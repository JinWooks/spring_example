<%@ page import="org.springframework.security.core.Authentication" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %><%--
  Created by IntelliJ IDEA.
  User: JinWook
  Date: 2021-06-27
  Time: 오후 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/include/header.jsp"%>
<%
  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
  Object principal = auth.getPrincipal();

  String name= "";
  if(principal != null) {
    name = auth.getName();
  }
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div class="container text-center col-2">
    <h1>Hello World</h1>
      <sec:authorize access="isAnonymous()">
        <h5><a href="<c:url value="/login/loginPage"/>">Login</a>로그인 해주세요.</h5>
      </sec:authorize>
    <sec:authorize access="isAuthenticated()">
      <h5><%=name%>님, 반갑습니다.</h5><a href="#" onclick="document.getElementById('logout-form').submit();" role="button" class="btn btn-outline-secondary btn-dark">로그 아웃</a>
      <form id="logout-form" action="<c:url value="/accounts/logout"/>" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
      </form>
    </sec:authorize>
  </div>
    <div class="container text-center col-2">
      <a href='<c:url value="/guest/guestPage"/>' role="button" class="btn btn-outline-secondary btn-block">GUEST</a>
      <a href='<c:url value="/member/memberPage"/>' role="button" class="btn btn-outline-secondary btn-block">MEMBER</a>
      <a href='<c:url value="/admin/adminPage"/>' role="button" class="btn btn-outline-secondary btn-block">ADMIN</a>
    </div>

  </body>
</html>
