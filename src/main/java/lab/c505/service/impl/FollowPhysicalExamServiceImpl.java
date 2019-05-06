package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lab.c505.entity.FollowPhysicalExam;
import lab.c505.mapper.FollowPhysicalExamMapper;
import lab.c505.service.FollowPhysicalExamService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 随访体检表 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
@Primary
public class FollowPhysicalExamServiceImpl extends ServiceImpl<FollowPhysicalExamMapper, FollowPhysicalExam> implements FollowPhysicalExamService {

    @Autowired
    private FollowPhysicalExamMapper followPhysicalExamMapper;

    @Override
    public FollowPhysicalExam getFollowPhysicalExam(String followUpId) throws Exception {
        QueryWrapper<FollowPhysicalExam> fpeQueryWrapper = new QueryWrapper<>();
        return followPhysicalExamMapper.selectOne(fpeQueryWrapper);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public FollowPhysicalExam addFollowPhysicalExam(FollowPhysicalExam followPhysicalExam) throws Exception {
        if (followPhysicalExamMapper.insert(followPhysicalExam) != 1) {
            throw new Exception("随访查体表添加出错！");
        }
        return followPhysicalExam;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public FollowPhysicalExam updateFollowPhysicalExam(FollowPhysicalExam followPhysicalExam) throws Exception {
        if (followPhysicalExamMapper.updateById(followPhysicalExam) == 0) {
            throw new Exception("修改失败");
        }
        return followPhysicalExam;
    }
}
