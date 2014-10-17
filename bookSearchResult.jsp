<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>查询结果</title>
</head>
<body>
		<s:property value="ifFoundAuthor"/><br>
		<s:property value="ifFoundAuthorBook"/><br>
		作者信息:<br>
                 ID:<s:property value="authorid"/><br>
                 Name:<s:property value="authorName"/><br>
                 Age:<s:property value="authorAge"/><br>
                 Country:<s:property value="authorCountry"/><br><br><br>
                 
        作者图书:<br>
    	<s:iterator value="bookResult" id="authorBook">  
    		<s:a id="a" href="bookInfo.action?isbn=%{#authorBook.isbn}">
   			<s:property value='#authorBook.title'/><br>
    		</s:a><br><br>
    		<!-- <s:property value="#authorBook.title"/><br> -->
    		
    	</s:iterator>
</body>
</html>