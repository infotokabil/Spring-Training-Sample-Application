package com.aspiresys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspiresys.dao.PersonDetailDao;
import com.aspiresys.model.PersonDetail;

@Service
public class PersonDetailServiceImpl implements PersonDetailService{
	
	@Autowired
	PersonDetailDao personDetailDao;

	public List<PersonDetail> list() {
		return personDetailDao.list();
	}

	public PersonDetail get(int id) {
		return personDetailDao.get(id);
	}

	public void saveOrUpdate(PersonDetail personDetail) {
		personDetailDao.saveOrUpdate(personDetail);
	}

	public void delete(int id) {
		personDetailDao.delete(id);
	}

}
