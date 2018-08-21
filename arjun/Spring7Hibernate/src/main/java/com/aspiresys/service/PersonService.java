package com.aspiresys.service;

import java.util.List;

import com.aspiresys.model.Person;

public interface PersonService {
	public List<Person> list();

	public Person get(int id);

	public void saveOrUpdate(Person person);

	public void delete(int id);
}
