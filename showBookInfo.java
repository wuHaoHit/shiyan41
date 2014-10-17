package test;
import java.sql.*;
public class showBookInfo {
	public static Book book;
	String isbn = "wuhao";
	public String execute() throws SQLException{
		System.out.println(this.isbn);
		DBConnection db = new DBConnection();
		ResultSet rs;
		String sql = "select * from Book where Book.isbn='"+isbn+"'";
		rs = db.searchBook(sql);
		if(rs.next()){
			System.out.println("found one");
			book = new Book(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
		}
		return "success";
	}
	public Book getBook(){
		return this.book;
	}
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
}
