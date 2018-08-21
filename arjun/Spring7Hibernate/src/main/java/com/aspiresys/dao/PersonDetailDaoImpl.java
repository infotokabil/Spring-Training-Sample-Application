package com.aspiresys.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.aspiresys.model.PersonDetail;

@Repository
public class PersonDetailDaoImpl implements PersonDetailDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<PersonDetail> list() {
		List<PersonDetail> listPerson = (List<PersonDetail>) sessionFactory.getCurrentSession().createCriteria(PersonDetail.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listPerson;
	}

	@Transactional
	public PersonDetail get(int id) {
		String hql = "from Person where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<PersonDetail> listPerson = (List<PersonDetail>) query.list();
		
		if (listPerson != null && !listPerson.isEmpty()) {
			return listPerson.get(0);
		}
		return null;
	}

	@Transactional
	public void saveOrUpdate(PersonDetail personDetail) {
		sessionFactory.getCurrentSession().saveOrUpdate(personDetail);
		
	}

	@Transactional
	public void delete(int id) {
		PersonDetail personToDelete = new PersonDetail();
		personToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(personToDelete);
		
	}

}
