package Interpreter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExpression implements SQLExpression{

SQLExpression user1;
	
	public InsertExpression(SQLExpression user1) {
		this.user1 = user1;
	}
	
	@Override
	public String execute() throws Exception{
		String host = "bomberman-mysqldbserver.mysql.database.azure.com";
        String database = "bombermandatabase";
        String user = "adminbomberman@bomberman-mysqldbserver";
        String password = "Admin123";

        String url = String.format("jdbc:mysql://%s/%s", host, database);
        
		try {
			Connection connection = DriverManager.getConnection(url, "adminbomberman@bomberman-mysqldbserver", password);
	        Statement statement = connection.createStatement();
	        if(user1.execute() != null)
			{
				String sql = "INSERT INTO online (username) VALUES ('" + user1.execute() +"')";
				statement.executeUpdate(sql);
			}
		}catch (SQLException e) {
            throw new SQLException("Encountered an error when executing given sql statement.", e);
        }

		return "Online players updated to MySQL server";
	}
	
}