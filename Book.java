package test;

public class Book {
	String isbn = null;
	String title = null;
	int authorID = 0;
	String publisher = null;
	String publishDate = null;
	String price = null;
	Book(String isbn,String title,int authorID,String publisher,String publishDate,String price){
		this.isbn=isbn;
		this.title=title;
		this.authorID=authorID;
		this.publisher=publisher;
		this.publishDate=publishDate;
		this.price=price;
	}
	public String getIsbn(){
		return this.isbn;
	}
	public String getTitle(){
		return this.title;
	}
	public int getAuthorID(){
		return this.authorID;
	}
	public String getPublisher(){
		return this.publisher;
	}
	public String getPublishDate(){
		return this.publishDate;
	}
	public String getPrice(){
		return this.price;
	}
}
