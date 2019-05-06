package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lab.c505.entity.Pci;
import lab.c505.mapper.PciMapper;
import lab.c505.service.PciService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 冠脉介入表 服务实现类
 * </p>
 *
 * @author Liu Chenglong
 * @since 2019-05-06 16:26
 */
@Service
@Primary
public class PciServiceImpl extends ServiceImpl<PciMapper, Pci> implements PciService {

    @Autowired
    private PciMapper pciMapper;

    /**
     * 查询冠脉介入
     *
     * @param medicalHistoryId
     * @return
     * @throws Exception
     */
    @Override
    public Pci getPci(String medicalHistoryId) throws Exception {
        QueryWrapper<Pci> pciQueryWrapper = new QueryWrapper<>();
        pciQueryWrapper.eq(true, Pci.MEDICAL_HISTORY_ID, medicalHistoryId);
        return pciMapper.selectOne(pciQueryWrapper);
    }

    /**
     * 添加冠脉介入
     *
     * @param pciEntity
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Pci addPci(Pci pciEntity) throws Exception {
        if (pciMapper.insert(pciEntity) != 1) {
            throw new Exception("冠脉介入添加出错！");
        }
        return pciEntity;
    }

    /**
     * 修改冠脉介入
     *
     * @param pciEntity
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Pci updatePci(Pci pciEntity) throws Exception {
        if (pciMapper.updateById(pciEntity) == 0) {
            throw new Exception("修改失败");
        }
        return pciEntity;
    }
}
