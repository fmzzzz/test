<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.zhiyou100.crm.util.SessionKey" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>站内消息 - 智游客户关系管理系统</title>
</head>
<body>
	<h1>站内消息2</h1>
	<p>
		当前用户：${ sessionScope[SessionKey.USERNAME] }
	</p>
</body>
</html>