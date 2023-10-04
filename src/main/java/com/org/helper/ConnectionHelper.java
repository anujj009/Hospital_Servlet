package com.org.helper;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.taglibs.standard.tag.common.fmt.FormatNumberSupport;

public class ConnectionHelper {
	public static Connection getConObj() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
			return con;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

}