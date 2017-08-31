package com.vobosi.dao.user;

import com.vobosi.pojo.user.user;
import com.vobosi.pojo.user.userQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userDao {
    int countByExample(userQuery example);

    int deleteByExample(userQuery example);

    int insert(user record);

    int insertSelective(user record);

    List<user> selectByExample(userQuery example);

    int updateByExampleSelective(@Param("record") user record, @Param("example") userQuery example);

    int updateByExample(@Param("record") user record, @Param("example") userQuery example);
}