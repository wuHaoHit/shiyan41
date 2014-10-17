package test;

import java.sql.*;

public class DBConnection {
	public Connection dbConn;
	Statement stmt;
	public DBConnection() {
		String driverName = "com.mysql.jdbc.Driver";  //加载JDBC驱动   
		String dbURL = "jdbc:mysql://localhost:3306/BookDB";  //连接服务器和数据库test1，你可能得修改一下DatabaseName的值，这个数据库名必须是你sql2005里的  
		String userName = "root";  //默认用户名，跟你不同，你得改   
		String userPwd = "wu123456";  //密码，跟你不同，你得改   
		   
		try {     
			Class.forName(driverName);     
			dbConn = DriverManager.getConnection(dbURL, userName, userPwd);   
			System.out.println("Connection Successful!");  //如果连接成功 控制台输出Connection Successful! 
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


