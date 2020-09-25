package org.voyager.bank.core.domain.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {
	
	
	public static Connection getConnection(){
		
		Connection connect = null;
		String username = "";
		String password = "";
		
		try{
			
			connect = DriverManager.getConnection("", username, password);
			
		}catch (Exception e) {
			
			System.out.println(" @ConnectionJDBC.getConnection");
			System.out.println(" Error :" + e.getMessage() );
			System.out.printf("  Line: %s\n",e.getLocalizedMessage());
						
		}finally {
			return connect;
		}
		
	}

}
