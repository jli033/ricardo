<%@page language="java" import="java.lang.*, java.util.*"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>李嘉图会员管理系统</title>
<spring:url value="/resources/core/css/user/userHome.css" var="currentCss" />
<spring:url value="/resources/core/css/bootstrap.min.css"
	var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${currentCss}" rel="stylesheet" />
</head>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Spring 3 MVC Project</a>
		</div>
	</div>
</nav>
<div class="jumbotron">
	<div class="container">
		<p>
			${user.userName}您好
		</p>
	</div>
</div>

<div class="container">

<div class="panel-group" id="accordion">
  <div class="panel panel-default in">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">
        	消费记录
        </a>
      </h4>
    </div>
    <div id="collapse1" class="panel-collapse collapse in">
      <div class="panel-body">
      <!-- //消费记录列表////////////////////////////// -->
      <table class="table table-sm">
	  <thead>
	    <tr>
	      <th>#</th>
	      <th>消费时间</th>
	      <th>消费金额</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<c:forEach var="item" items="${costList}" varStatus="status">
		    <tr>
		      <th scope="row">1</th>
		      <td>${item.costDateTime}</td>
		      <td>${item.cost}</td>
		    </tr>
	    </c:forEach>
	    </tbody>
	 </table>
      <!-- //消费记录列表///////////////////////////// -->
      </div>
    </div>
  </div>
  <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">
        	充值记录
        </a>
      </h4>
    </div>
    <div id="collapse2" class="panel-collapse collapse">
      <div class="panel-body">
	      <!-- //充值记录列表////////////////////////////// -->
	      <table class="table table-sm">
		  <thead>
		    <tr>
		      <th>#</th>
		      <th>充值时间</th>
		      <th>充值金额</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach var="item" items="${rechargeList}" varStatus="status">
			    <tr>
			      <th scope="row">1</th>
			      <td>${item.rechargeDateTime}</td>
			      <td>${item.rechargeMoney}</td>
			    </tr>
		    </c:forEach>
		    </tbody>
		 </table>
	      <!-- //充值记录列表///////////////////////////// -->
      </div>
    </div>
  </div>
</div>
	<footer>
		<p>&copy; Ricardo.com 2015</p>
	</footer>
</div>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<spring:url value="/resources/core/js/bootstrap.min.js"
	var="bootstrapJs" />
<spring:url value="/resources/core/js/user/userHome.js" var="currentJs" />
<script src="${currentJs}"></script>
<script src="${bootstrapJs}"></script>

</body>
</html>