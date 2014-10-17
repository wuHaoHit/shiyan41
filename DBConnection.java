package test;

import java.sql.*;

public class DBConnection {
	public Connection dbConn;
	Statement stmt;
	public DBConnection() {
		String driverName = "com.mysql.jdbc.Driver";  //����JDBC����   
		String dbURL = "jdbc:mysql://localhost:3306/BookDB";  //���ӷ����������ݿ�test1������ܵ��޸�һ��DatabaseName��ֵ��������ݿ�����������sql2005���  
		String userName = "root";  //Ĭ���û��������㲻ͬ����ø�   
		String userPwd = "wu123456";  //���룬���㲻ͬ����ø�   
		   
		try {     
			Class.forName(driverName);     
			dbConn = DriverManager.getConnection(dbURL, userName, userPwd);   
			System.out.println("Connection Successful!");  //������ӳɹ� ����̨���Connection Successful! 
			stmt = this.dbConn.createStatement();
			} catch (Exception e) {   
				e.printStackTrace();}
	} 
	public ResultSet searchBook(String str) throws SQLException{
		return stmt.executeQuery(str);
	}
	public int deleteBook(String str) throws SQLException{
		return stmt.executeUpdate(str);
	}
}


