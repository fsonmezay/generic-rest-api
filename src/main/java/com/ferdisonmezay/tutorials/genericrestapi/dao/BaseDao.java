package com.ferdisonmezay.tutorials.genericrestapi.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferdisonmezay.tutorials.genericrestapi.model.BaseModel;

public interface BaseDao<T extends BaseModel> extends JpaRepository<T, Serializable> {

}
