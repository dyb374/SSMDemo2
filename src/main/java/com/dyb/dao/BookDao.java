package com.dyb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dyb.entity.Book;

public interface BookDao {
    int deleteByPrimaryKey(Long bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
    
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}