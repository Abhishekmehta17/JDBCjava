package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

@SuppressWarnings("unused")
public class DBUtils {
 private static Connection cn;
 public static Connection openConnection() throws SQLException {
	 String url = "jdbc:mysql://localhost:3306/dac23?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
	 cn = DriverManager.getConnection(url, "root", "root123");
	 return cn;
 }
}
