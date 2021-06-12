<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
<div><a href="/admin/books/all">Powrót</a></div>
<table border="1">
    <thead>
    <th>isbn</th>
    <th>tytuł</th>
    <th>autor</th>
    <th>wydawca</th>
    <th>typ</th>
    </thead>
    <tbody>
        <tr>
            <td><c:out value="${book.isbn}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author}"/></td>
            <td><c:out value="${book.publisher}"/></td>
            <td><c:out value="${book.type}"/></td>
        </tr>
    </tbody>
</table>
</body>
</html>


