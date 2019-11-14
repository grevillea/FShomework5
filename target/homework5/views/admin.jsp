<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" session="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="application/javascript" src="/statics/js/jquery-1.4.2.js"></script>
    <script type="application/javascript">
        $(document).ready(function () {
            $("#updateUser").click(function () {
                $("#main-form").submit();
            })
        });
    </script>
</head>
<body>
<h1>标题: ${title}</h1>
<h1>消息 : ${message}</h1>

<c:if test="${pageContext.request.userPrincipal.name != null}">
    <h2>欢迎: ${pageContext.request.userPrincipal.name}
        | <a href="<c:url value="/logout" />" > 注销</a></h2>
        | <a href="#" id="updateUser"> 更新账户</a></h2>
</c:if>
<form action="/updateUser" id="main-form">
    <input style="display: none" value="${pageContext.request.userPrincipal.name}" name="userName">
</form>
</body>
</html>
