package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lab.c505.entity.BodyComposition;
import lab.c505.mapper.BodyCompositionMapper;
import lab.c505.service.BodyCompositionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * <p>
 * 人体成分分析表 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class BodyCompositionServiceImpl extends ServiceImpl<BodyCompositionMapper, BodyComposition> implements BodyCompositionService {

    @Autowired
    BodyCompositionMapper bodyCompositionMapper;
    @Override
    public BodyComposition getOneBodyComposition(String medicalHistory) {
        QueryWrapper<BodyComposition> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(BodyComposition.MEDICAL_HISTORY_ID,medicalHistory);
        return bodyCompositionMapper.selectOne(queryWrapper);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public String addOneBodyComposition(BodyComposition bodyComposition) throws Exception{
        String uuid = UUID.randomUUID().toString();
        bodyComposition.setBodyCompositionId(uuid);
        if(bodyCompositionMapper.insert(bodyComposition) == 0){
            throw new Exception("添加失败");
        }
        return uuid;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public BodyComposition updateBodyComposition(BodyComposition bodyComposition) throws Exception {
        if (bodyCompositionMapper.updateById(bodyComposition) == 0){
            throw new Exception("更新失败");
        }
        return bodyComposition;
    }
}
