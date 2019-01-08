package com.ssm.service;

import com.ssm.model.Book;

public interface BookServie {
    Book getBookByName(String bname);

    void updateUid(Book book);
}
