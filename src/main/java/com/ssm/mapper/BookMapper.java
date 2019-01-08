package com.ssm.mapper;

import com.ssm.model.Book;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {

    Book getBookByName(@Param("param") String bname);

    void updateUid(@Param("param") Book book);
}
