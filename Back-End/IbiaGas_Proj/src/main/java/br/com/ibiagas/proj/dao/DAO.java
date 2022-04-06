package br.com.ibiagas.proj.dao;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;

public class DAO {
	
	private static BasicDataSource basicDataSource = null;
	
	// inicializar o banco de dados
	public static void init() {
		basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // informar ao bd o drive jdbc
		basicDataSource.setUsername("root");
		basicDataSource.setUrl("");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/ibia_gas");
	
		basicDataSource.setValidationQuery("SELECT CURRENT_TIMESTAMP");
		
		basicDataSource.setInitialSize(3);
	
	}
	
	
	// recupera uma conexão
	public static Connection getConnection() {
		
		try {
			return basicDataSource.getConnection();
		}
		catch (Exception e) {
			return null;
		}
		
	}
	
	
	// fechar o banco de dados
	public static void close() {
		try {
			basicDataSource.close();
		}
		catch (Exception e) {
			
		}
	}
}
