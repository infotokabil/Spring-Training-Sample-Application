package com.aspire.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	/*public int saveEmployee(Employee e){  
	    String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
	    return jdbcTemplate.update(query);  
	} */ 
	public int updateEmployee(Employee e){  
	    String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Employee e){  
	    String query="delete from employee where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	} 
	 
	public List<Employee> saveEmployeeByPreparedStatement(final Employee e){  
	    String query="select * from employee where  id='"+e.getId()+"' ";  
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<List<Employee>>(){  
	    @Override  
	    public List<Employee> doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	              
	       /* ps.setInt(1,e.getId());  
	        ps.setString(2,e.getName());  
	        ps.setFloat(3,e.getSalary());*/  
	    ResultSet result=ps.executeQuery();
	    List<Employee> list=new ArrayList<>();
	    while(result.next()) {
	   
	    list.add(new Employee(result.getInt(1), result.getString(2), result.getFloat(3)));
	    }
	              
	        return list;               
	    }  
	    });  
	}  
}
