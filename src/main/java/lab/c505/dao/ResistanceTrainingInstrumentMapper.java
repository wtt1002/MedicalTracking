package lab.c505.dao;

import lab.c505.entity.ResistanceTrainingInstrument;

public interface ResistanceTrainingInstrumentMapper {
    int deleteByPrimaryKey(Long trti_id);

    int insert(ResistanceTrainingInstrument record);

    int insertSelective(ResistanceTrainingInstrument record);

    ResistanceTrainingInstrument selectByPrimaryKey(Long trti_id);

    int updateByPrimaryKeySelective(ResistanceTrainingInstrument record);

    int updateByPrimaryKey(ResistanceTrainingInstrument record);
}