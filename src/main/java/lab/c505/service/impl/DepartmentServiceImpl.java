package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lab.c505.entity.Department;
import lab.c505.mapper.DepartmentMapper;
import lab.c505.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public Department getDepartmentById(String deptId) {
        return departmentMapper.selectById(deptId);
    }

    @Override
    public List<Department> getDepartmentsByHosId(String hosId) {
        QueryWrapper<Department> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(Department.HOS_ID,hosId);
        return departmentMapper.selectList(queryWrapper);
    }
}
