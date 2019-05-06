package lab.c505.service;

import lab.c505.entity.Pci;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 冠脉介入表 服务类
 * </p>
 *
 * @author Liu Chenglong
 * @since 2019-05-06 16:26
 */
public interface PciService extends IService<Pci> {

    //@Liu Chenglong
    Pci getPci(String medicalHistoryId) throws Exception;

    Pci addPci(Pci pciEntity) throws Exception;

    Pci updatePci(Pci pciEntity) throws Exception;
}
