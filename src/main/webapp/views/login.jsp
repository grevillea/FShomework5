<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="application/javascript" src="/statics/js/jquery-1.4.2.js"></script>
</head>
<body>
<form action="j_spring_security_check" method="post" id="main_form">

    <input type="text" name="j_username"
           placeholder=用户名 maxlength="11"  style="border-radius: 4px; outline:none;
                           ;width: 300px;height: 35px;text-indent: 10px"/><br/>
    <input type="password" name="j_password"
           placeholder=密码 maxlength="11"  style="border-radius: 4px; outline:none;
                           ;width: 300px;height: 35px;text-indent: 10px"/><br/>
    <label>
        <input type="text" id="j_valid"
               placeholder=验证码 maxlength="4"  style="width: 100px;height: 35px"/>
        <img type="image" src="/auth/code" id="codeImage"  style="cursor:pointer;"/>
    </label><br/>
    <input type="submit" id="login"
           style="width: 150px;height: 45px;background-color: orange" value="登录"
           οnmοusemοve="this.style.backgroundColor='darkorange';"
           οnmοuseοut="this.style.backgroundColor='orange   ';"/>
    <input type="reset" value="重置" style="width: 150px;height: 45px;background-color: orange"
           οnmοusemοve="this.style.backgroundColor='darkorange';"
           οnmοuseοut="this.style.backgroundColor='orange   ';"/>
    <a href="/newUser">注册新用户</a>
</form>
</body>
</html>
