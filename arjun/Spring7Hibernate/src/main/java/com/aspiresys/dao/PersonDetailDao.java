package com.aspiresys.dao;

import java.util.List;

import com.aspiresys.model.PersonDetail;

public interface PersonDetailDao {
public List<PersonDetail> list();
	
	public PersonDetail get(int id);
	
	public void saveOrUpdate(PersonDetail personDetail);
	
	public void delete(int id);
}
