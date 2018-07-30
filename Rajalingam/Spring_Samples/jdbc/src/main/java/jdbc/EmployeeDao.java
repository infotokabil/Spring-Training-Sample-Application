package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDao {private JdbcTemplate jdbcTemplate;  

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
  this.jdbcTemplate = jdbcTemplate;  
}  

public Boolean saveEmployeeByPreparedStatement(final Employee e){  
  String query="insert into employee values(?,?,?)";  
  return (Boolean) jdbcTemplate.execute(query,new PreparedStatementCallback(){  
  public Boolean doInPreparedStatement(PreparedStatement ps)  
          throws SQLException, DataAccessException {  
            
      ps.setInt(1,e.getId());  
      ps.setString(2,e.getName());  
      ps.setString(3,e.getSalary());  
            
      return ps.execute();  
            
  }  
  });  
}  
}
