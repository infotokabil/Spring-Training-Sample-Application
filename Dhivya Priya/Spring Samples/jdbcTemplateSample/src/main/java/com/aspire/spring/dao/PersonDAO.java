package com.aspire.spring.dao;
import java.util.List;

import com.spring.model.Person;


public interface PersonDAO {
	
	Person getPersonById(Long id);

	List<Person> getAllPersons();

	boolean deletePerson(Person person);

	boolean updatePerson(Person person);

	boolean createPerson(Person person);
}



