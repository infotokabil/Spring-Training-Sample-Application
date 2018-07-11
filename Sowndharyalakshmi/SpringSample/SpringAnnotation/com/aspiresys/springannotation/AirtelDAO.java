package com.aspiresys.springannotation;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@SuppressWarnings("unused")
public class AirtelDAO {
 public void getUserDetails() {
	/* try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement statement = connection.prepareStatement("SELECT type FROM user_details WHERE username=? and password=?");	){
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			ResultSet resultset = statement.executeQuery();
			while (resultset.next()) {
				return resultset.getString(1);
				
			}
		} catch (SQLException sqlexception) {
			LOG.error(sqlexception.getMessage());
         throw new CustomException(sqlexception, "Exception occurred while logging in");
     			
 }*/
}
}