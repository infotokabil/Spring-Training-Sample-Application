package com.aspiresys.dao;

import java.util.List;

import com.aspiresys.model.Person;

public interface PersonDao {
	public List<Person> list();
	
	public Person get(int id);
	
	public void saveOrUpdate(Person person);
	
	public void delete(int id);
}