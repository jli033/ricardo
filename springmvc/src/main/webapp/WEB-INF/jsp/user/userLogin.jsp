<%@page language="java" import="java.lang.*, java.util.*"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>会员管理系统</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<!-- Le styles -->
	<c:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
	<c:url value="/resources/core/css/user/userLogin.css" var="userLogin" />
	<link href="${bootstrapCss}" rel="stylesheet" />
	<link href="${userLogin}" rel="stylesheet" />
	
	<c:url value="/" var="root"/>
</head>
<body>
    <div class="container">
      <form id="frmIndex" class="form-signin" action="${root}/user/home/login.do" method="post">
        <h2 class="form-signin-heading">用户登录</h2>
        <label for="txtLoginId" class="sr-only">Email address</label>
        <input type="text" id="txtLoginId" name="loginId" class="form-control" placeholder="Login ID" required autofocus>
        <label for="txtPassword" class="sr-only">Password</label>
        <input type="password" id="txtPassword" name="password" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <span id="lblErrorMessage" style="display:none;color:red;"></span>
        <button id="btnLogin" class="btn btn-lg btn-primary btn-block" type="button" onclick="btnLogin_click();">Sign in</button>
      </form>
    </div> <!-- /container -->
    <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="<c:url value="/resources/core/js/user/userLogin.js"/>"></script>
</body>
</html>