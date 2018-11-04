package lab.c505.dao;

import lab.c505.entity.Pci;

public interface PciMapper {
    int deleteByPrimaryKey(Long pci_id);

    int insert(Pci record);

    int insertSelective(Pci record);

    Pci selectByPrimaryKey(Long pci_id);

    int updateByPrimaryKeySelective(Pci record);

    int updateByPrimaryKey(Pci record);
}