package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lab.c505.entity.FollowSideEffects;
import lab.c505.mapper.FollowSideEffectsMapper;
import lab.c505.service.FollowSideEffectsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 随访药物不良反应表 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class FollowSideEffectsServiceImpl extends ServiceImpl<FollowSideEffectsMapper, FollowSideEffects> implements FollowSideEffectsService {

    @Autowired
    FollowSideEffectsMapper followSideEffectsMapper;

    @Override
    public FollowSideEffects getFsEffects(String id) throws Exception {
        QueryWrapper<FollowSideEffects> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(FollowSideEffects.FOLLOW_UP_ID, id);
        return followSideEffectsMapper.selectOne(queryWrapper);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public FollowSideEffects addFsEffects(FollowSideEffects followSideEffects) throws Exception {
        if(followSideEffectsMapper.insert(followSideEffects.setSideEffectsId(null)) == 0){
            throw new Exception("插入FollowSideEffects失败");
        }
        return followSideEffects;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public FollowSideEffects updateFsEffects(FollowSideEffects followSideEffects) throws Exception {
        if(followSideEffectsMapper.updateById(followSideEffects) == 0){
            throw new Exception("更新FollowSideEffects失败");
        }
        return followSideEffects;
    }
}
