package com.dyb.dao;

import com.dyb.entity.Appointment;
import org.apache.ibatis.annotations.Param;

public interface AppointmentDao {
    int deleteByPrimaryKey(@Param("bookId") Long bookId, @Param("studentId") Long studentId);

    int insert(Appointment record);

    int insertSelective(Appointment record);

    Appointment selectByPrimaryKey(@Param("bookId") Long bookId, @Param("studentId") Long studentId);

    int updateByPrimaryKeySelective(Appointment record);

    int updateByPrimaryKey(Appointment record);
}