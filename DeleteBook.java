package test;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DeleteBook {
	String isbn;
	public String execute() throws SQLException{
		System.out.println("delete");
		DBConnection db = new DBConnection();
		System.out.println(isbn);
		String sql ="delete from Book where Book.isbn='"+this.isbn+"'";
		if(db.deleteBook(sql) == 0){
			//JOptionPane.showMessageDialog(null, "É¾³ýÊ§°Ü", "É¾³ýÊ§°Ü", JOptionPane.ERROR_MESSAGE);
			
			return "fail";
		}
		return "success";
	}
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
}
