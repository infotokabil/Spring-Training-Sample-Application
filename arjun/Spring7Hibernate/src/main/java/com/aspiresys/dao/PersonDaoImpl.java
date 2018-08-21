package com.aspiresys.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.aspiresys.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao{

	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Transactional
	public List<Person> list() {
	
	
		List<Person> listPerson = (List<Person>) sessionFactory.getCurrentSession().createCriteria(Person.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listPerson;
	}

	@Transactional
	public Person get(int id) {
		
		String hql = "from Person where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Person> listPerson = (List<Person>) query.list();
		
		if (listPerson != null && !listPerson.isEmpty()) {
			return listPerson.get(0);
		}
		
		return null;
	}

	@Transactional
	public void saveOrUpdate(Person person) {
		sessionFactory.getCurrentSession().saveOrUpdate(person);
		
	}

	@Transactional
	public void delete(int id) {
		Person personToDelete = new Person();
		personToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(personToDelete);
		
	}

}
