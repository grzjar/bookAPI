<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Utwórz książkę</title>
</head>
<body>
<form:form method="post" modelAttribute="book">
    <label>Isbn:
        <form:input path="isbn"/>
    </label><br/>
    <label>Tytuł:
        <form:input path="title"/>
    </label><br/>
    <label>Autor:
        <form:input path="author"/>
    </label><br/>
    <label>Wydawca:
        <form:input path="publisher"/>
    </label><br/>
    <label>Kategoria:
        <form:input path="type"/>
    </label><br/>
    <form:button type="submit">Dodaj</form:button>
</form:form>
</body>
</html>