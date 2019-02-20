package lab.c505.service.impl;

import lab.c505.entity.MedicalHistory;
import lab.c505.mapper.MedicalHistoryMapper;
import lab.c505.service.MedicalHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 患者病史表，记录患者每一次入院信息 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class MedicalHistoryServiceImpl extends ServiceImpl<MedicalHistoryMapper, MedicalHistory> implements MedicalHistoryService {

}
