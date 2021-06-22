package com.convict.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Convict.Yellow
 * @date: 2021/6/20 17:44
 * @description: DataDao
 */
@Repository
public interface DataDao {

    @Select("SELECT username FROM account")
    List<String> selectNames();
}
