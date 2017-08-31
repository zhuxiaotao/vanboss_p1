package com.vobosi.dao.pau;

import com.vobosi.pojo.pau.paualarm;
import com.vobosi.pojo.pau.paualarmQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface paualarmDao {
    int countByExample(paualarmQuery example);

    int deleteByExample(paualarmQuery example);

    int insert(paualarm record);

    int insertSelective(paualarm record);

    List<paualarm> selectByExample(paualarmQuery example);

    int updateByExampleSelective(@Param("record") paualarm record, @Param("example") paualarmQuery example);

    int updateByExample(@Param("record") paualarm record, @Param("example") paualarmQuery example);
}