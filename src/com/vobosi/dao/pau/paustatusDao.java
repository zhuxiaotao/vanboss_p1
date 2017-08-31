package com.vobosi.dao.pau;

import com.vobosi.pojo.pau.paustatus;
import com.vobosi.pojo.pau.paustatusQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface paustatusDao {
    int countByExample(paustatusQuery example);

    int deleteByExample(paustatusQuery example);

    int insert(paustatus record);

    int insertSelective(paustatus record);

    List<paustatus> selectByExample(paustatusQuery example);

    int updateByExampleSelective(@Param("record") paustatus record, @Param("example") paustatusQuery example);

    int updateByExample(@Param("record") paustatus record, @Param("example") paustatusQuery example);
}