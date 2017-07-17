package com.ferdisonmezay.tutorials.genericrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ferdisonmezay.tutorials.genericrestapi.dao.BaseDao;
import com.ferdisonmezay.tutorials.genericrestapi.model.BaseModel;

public class GenericRestController<T extends BaseModel> {
	
	@Autowired
	private BaseDao<T> dao;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<T> list() {
		return dao.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public T create(@RequestBody T entity) {
		return dao.save(entity);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public T update(@PathVariable(value = "id") long id, @RequestBody T entity) {
		return dao.save(entity);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") long id) {
		dao.delete(id);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public T get(@PathVariable(value = "id") long id) {
		return dao.getOne(id);
	}
}
