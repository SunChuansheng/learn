<%--
  Created by IntelliJ IDEA.
  User: sunchuansheng
  Date: 2016/1/8
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
input.jsp
<form action="${pageContext.request.contextPath}/product_save.action" method="get">
    <input name="name" value="Toy" title="产品名称"/><br/>
    <input name="description" value="儿童玩具" title="产品描述信息"/><br/>
    <input name="price" value="12.22" title="产品单价"/><br/>
    <input type="submit"/><br/>
</form>
</body>
</html>
