package com.aspiresys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspiresys.dao.PersonDao;
import com.aspiresys.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;

	public List<Person> list() {

		return personDao.list();
	}

	public Person get(int id) {

		return personDao.get(id);
	}

	public void saveOrUpdate(Person person) {

		personDao.saveOrUpdate(person);
	}

	public void delete(int id) {

		personDao.delete(id);

	}

}
