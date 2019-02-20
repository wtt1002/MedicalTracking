package lab.c505.service.impl;

import lab.c505.entity.ExamCategory;
import lab.c505.mapper.ExamCategoryMapper;
import lab.c505.service.ExamCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 医院检查类别表，血常规、尿常规等 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class ExamCategoryServiceImpl extends ServiceImpl<ExamCategoryMapper, ExamCategory> implements ExamCategoryService {

}
