package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class bookSearch {
	List<Book> bookResult =new ArrayList<Book>();
	String authName;
	String ifFoundAuthor = "没有找到该作者!!!";
	String ifFoundAuthorBook = "没有找到该作者的图书!!!";
	//author authorInfo = new author();
	int authorId,authorAge;
	String authorName,authorCountry;
	public void setAuthName(String authName){
		this.authName = authName;
	}
	
	public String execute(){
		DBConnection db=new DBConnection();
		ResultSet rs;
		Book temp;
		try {
			String sql ="select * from Author where Author.name='"+authName+"'";
			System.out.println(authName);
			rs = db.searchBook(sql);
			//System.out.println(rs.getInt(1));
			if (rs.next()){
				ifFoundAuthor = "";
			//	System.out.println("authorFound");
			/*	authorInfo.authorId=rs.getInt(1);
			    authorInfo.name=rs.getString(2);
			    authorInfo.age=rs.getInt(3);
			    authorInfo.country=rs.getString(4);*/
				authorId=rs.getInt(1);
			    authorName=rs.getString(2);
			    authorAge=rs.getInt(3);
			    authorCountry=rs.getString(4);
			    //System.out.println(authorId);
				sql="select * from Book where Book.authorID='"+authorId+"'";
				rs = db.searchBook(sql);
			
				while(rs.next()){
					ifFoundAuthorBook = "";
				//	System.out.println("bookFound");
					temp=new Book(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
					bookResult.add(temp);
				//	System.out.println(bookResult.get(0).title);
				}
			}else{
				return "error";
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return "success";
		
	}
	public int getAuthorid(){
		return authorId;
	}
	public int getAuthorAge(){
		return this.authorAge;
	}
	public String getAuthorName(){
		return this.authorName;
	}
	public String getAuthorCountry(){
		return this.authorCountry;
	}
	public List<Book> getBookResult(){
		return this.bookResult;
	}
	public String getIfFoundAuthor(){
		return this.ifFoundAuthor;
	}
	public String getIfFoundAuthorBook(){
		return this.ifFoundAuthorBook;
	}
}
