package com.aspiresys.service;

import java.util.List;

import com.aspiresys.model.PersonDetail;



public interface PersonDetailService {
	public List<PersonDetail> list();

	public PersonDetail get(int id);

	public void saveOrUpdate(PersonDetail personDetail);

	public void delete(int id);
}
