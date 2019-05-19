package lab.c505.service.impl;

import lab.c505.dto.FollowUpDetailDto;
import lab.c505.entity.Doctor;
import lab.c505.entity.FollowUp;
import lab.c505.entity.MedicalHistory;
import lab.c505.entity.Patient;
import lab.c505.mapper.DoctorMapper;
import lab.c505.mapper.FollowUpMapper;
import lab.c505.mapper.MedicalHistoryMapper;
import lab.c505.mapper.PatientMapper;
import lab.c505.service.FollowUpDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;


/**
 * @author zxp
 * @since 2019-5-17
 * @do 随访详情相关的接口
 */

@Service
@Primary
public class FollowUpDetailServiceImpl implements FollowUpDetailService {

    @Autowired
    private FollowUpMapper followUpMapper;

    @Autowired
    private DoctorMapper doctorMapper;

    @Autowired
    private PatientMapper patientMapper;

    @Autowired
    private MedicalHistoryMapper medicalHistoryMapper;

    @Override
    public FollowUpDetailDto getOneFuDetail(String fuId) throws Exception {
        FollowUp followUp = followUpMapper.selectById(fuId);
        Doctor doctor = doctorMapper.selectById(followUp.getDoctorId());
        MedicalHistory medicalHistory = medicalHistoryMapper.selectById(followUp.getMedicalHistoryId());
        Patient patient = patientMapper.selectById(medicalHistory.getPatientId());
        return new FollowUpDetailDto(patient.getName(), doctor.getDoctorName(), followUp);
    }

    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public FollowUp addFollowUp(FollowUp followUp) throws Exception{
        followUp.setFollowUpId(UUID.randomUUID().toString());
        if(followUpMapper.insert(followUp) == 0){
            throw new Exception("插入followUp失败");
        }
        return followUp;
    }

    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public FollowUp updateFollowUp(FollowUp followUp) throws Exception{
        if(followUpMapper.updateById(followUp) == 0){
            throw new Exception("更新followUp失败");
        }
        return followUp;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public FollowUpDetailDto updateFuDetail(FollowUpDetailDto followUpDetailDto) throws Exception {
        followUpDetailDto.parseTime();// 将字符串时间转化为followUp实体内的时间格式
        updateFollowUp(followUpDetailDto.getFollowUp());
        return followUpDetailDto;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public FollowUpDetailDto addFuDetail(FollowUpDetailDto followUpDetailDto) throws Exception {
        followUpDetailDto.parseTime();
        addFollowUp(followUpDetailDto.getFollowUp());
        return followUpDetailDto;
    }
}
