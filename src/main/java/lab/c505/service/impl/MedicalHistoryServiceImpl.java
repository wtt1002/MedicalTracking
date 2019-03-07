package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lab.c505.entity.MedicalHistory;
import lab.c505.mapper.MedicalHistoryMapper;
import lab.c505.service.MedicalHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 * 患者病史表，记录患者每一次入院信息 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
@Primary
public class MedicalHistoryServiceImpl extends ServiceImpl<MedicalHistoryMapper, MedicalHistory> implements MedicalHistoryService {

    @Autowired
    MedicalHistoryMapper medicalHistoryMapper;

    @Override
    public String getLastMainDiagnose(String patientId) {
        QueryWrapper<MedicalHistory> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(MedicalHistory.PATIENT_ID,patientId);
        queryWrapper.orderByDesc(MedicalHistory.IN_TIME);
        List<MedicalHistory> list = medicalHistoryMapper.selectList(queryWrapper);
        if (list != null && list.size() > 0){
            return list.get(0).getMainDiagnose();
        }
        return null;
    }

    @Override
    public IPage<MedicalHistory> getRecordsByPage(Integer page, Integer count, String patientId) {
        QueryWrapper<MedicalHistory> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(MedicalHistory.PATIENT_ID, patientId);
        queryWrapper.orderByDesc(MedicalHistory.IN_TIME);
        return medicalHistoryMapper.selectPage(new Page<>(page, count),queryWrapper);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public String addMedicalHistory(MedicalHistory medicalHistory) {
        String uuid = UUID.randomUUID().toString();
        medicalHistory.setMedicalHistoryId(uuid);
        medicalHistoryMapper.insert(medicalHistory);
        return uuid;
    }

    @Override
    public MedicalHistory getOneMedicalHistory(String medicalHistoryId) {
        return medicalHistoryMapper.selectById(medicalHistoryId);
    }
}
