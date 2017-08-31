package com.vobosi.dao.pau;

import com.vobosi.pojo.pau.pauset;
import com.vobosi.pojo.pau.pausetQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pausetDao {
    int countByExample(pausetQuery example);

    int deleteByExample(pausetQuery example);

    int insert(pauset record);

    int insertSelective(pauset record);

    List<pauset> selectByExample(pausetQuery example);

    int updateByExampleSelective(@Param("record") pauset record, @Param("example") pausetQuery example);

    int updateByExample(@Param("record") pauset record, @Param("example") pausetQuery example);
}