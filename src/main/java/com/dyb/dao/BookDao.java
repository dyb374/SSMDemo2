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
    
    /**
     * 查询所有图书
     * 
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}