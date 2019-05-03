package lab.c505.service.impl;

        import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
        import lab.c505.entity.Assessment;
        import lab.c505.mapper.AssessmentMapper;
        import lab.c505.service.AssessmentService;
        import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Propagation;
        import org.springframework.transaction.annotation.Transactional;

        import java.util.List;
        import java.util.UUID;

/**
 * <p>
 * 入院评估表 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class AssessmentServiceImpl extends ServiceImpl<AssessmentMapper, Assessment> implements AssessmentService {

    @Autowired
    AssessmentMapper assessmentMapper;
    @Override
    public List<Assessment> getOneAssessment(String medicalHistoryId){
        QueryWrapper<Assessment> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(Assessment.MEDICAL_HISTORY_ID,medicalHistoryId);
        return assessmentMapper.selectList(queryWrapper);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public String addOneAssessment(Assessment assessment) throws Exception{
        String uuid = UUID.randomUUID().toString();
        assessment.setAssessmentId(uuid);
        if(assessmentMapper.insert(assessment)==0){
            throw new Exception("插入失败");
        }
        return uuid;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public Assessment updateOneAssessment(Assessment assessment) throws Exception {
        if(assessmentMapper.updateById(assessment)==0){
            throw new Exception("更新失败");
        }
        return null;
    }
}
