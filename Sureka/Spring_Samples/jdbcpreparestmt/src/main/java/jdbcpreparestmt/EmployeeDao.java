package jdbcpreparestmt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;  
  
public class EmployeeDao {  
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public Boolean saveEmployeeByPreparedStatement(final Employee e){  
    String query="insert into employee values(?,?,?)";  
    return (Boolean) jdbcTemplate.execute(query,new PreparedStatementCallback(){  
    @Override  
    public Boolean doInPreparedStatement(PreparedStatement ps)  
            throws SQLException, DataAccessException {  
              
        ps.setInt(1,e.getId());  
        ps.setString(2,e.getName());  
        ps.setString(3,e.getSalary());  
              
        return ps.execute();  
              
    }  
    });  
}  

/*public List<Employee> getAllEmployees(){  
    return template.query("select * from employee",new ResultSetExtractor(){  
        @Override  
         public Object extractData(ResultSet rs) throws SQLException,  
            DataAccessException {  

            List<Employee> list=new ArrayList<Employee>();  
            while(rs.next()) {  
                Employee e=new Employee();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setSalary(rs.getInt(3));  
                list.add(e);  
            }  
            return list;  
        }  
    });  
  }     
*/


public List<Employee> getAllEmployees(){  
	 return (List<Employee>)jdbcTemplate.query("select * from employee",new ResultSetExtractor(){  
	    @Override  
	     public List<Employee> extractData(ResultSet rs) throws SQLException,  
	            DataAccessException {  
	      
	        List<Employee> list=new ArrayList<Employee>();  
	        while(rs.next()){  
	        Employee e=new Employee();  
	        e.setId(rs.getInt(1));  
	        e.setName(rs.getString(2));  
	        e.setSalary(rs.getString(3));  
	        list.add(e);  
	        } 
	        return list;  
	        }  
	    });  
	  }  



}