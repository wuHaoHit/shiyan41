<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>图书详情</title>
</head>
<body>
	图书详情:<br>
	ISBN:<s:property value="book.isbn"/><br>
	TITLE:<s:property value="book.title"/><br>
	AuthorID:<s:property value="book.authorID"/><br>
	Publisher:<s:property value="book.publisher"/><br>
	PublishDate:<s:property value="book.publishDate"/><br>
	Price:<s:property value="book.price"/><br>
	<a  href="deleteBook.action?isbn=<s:property value='%{book.isbn}'/>">
    删除<br>
    </a><br><br>
</body>
</html>