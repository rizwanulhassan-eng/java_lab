<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 11/16/2022
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>addition</h1>
<%--@elvariable id="calculator" type="com.Calculator"--%>
<form:form action="save" modelAttribute="calculator" method="get">

    <label for="id">id:</label>
    <form:input path="id"  />

    <label for="input1">input1:</label>
    <form:input path="input1"  />

    <label for="input2">input2:</label>
    <form:input path="input2" />


    <input type="submit" value="submit">

</form:form>



<h1>subtraction</h1>
<form:form action="delete" modelAttribute="calculator" method="get">

    <label for="id">id:</label>
    <form:input path="id"  />

    <label for="input1">input1:</label>
    <form:input path="input1"  />

    <label for="input2">input2:</label>
    <form:input path="input2" />


    <input type="submit" value="submit">

</form:form>

<h1>multiplication</h1>
<form:form action="multiplication" modelAttribute="calculator" method="get">

    <label for="id">id:</label>
    <form:input path="id"  />

    <label for="input1">input1:</label>
    <form:input path="input1"  />

    <label for="input2">input2:</label>
    <form:input path="input2" />


    <input type="submit" value="submit">

</form:form>
<h1>division</h1>
<form:form action="division" modelAttribute="calculator" method="get">

    <label for="id">id:</label>
    <form:input path="id"  />

    <label for="input1">input1:</label>
    <form:input path="input1"  />

    <label for="input2">input2:</label>
    <form:input path="input2" />


    <input type="submit" value="submit">

</form:form>
</body>
</html>
