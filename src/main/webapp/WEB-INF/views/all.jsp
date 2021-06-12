<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
<table border="1">
    <thead>
    <th>isbn</th>
    <th>tytuł</th>
    <th>autor</th>
    <th>wydawca</th>
    <th>typ</th>
    <th>akcja</th>
    </thead>

    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.isbn}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author}"/></td>
            <td><c:out value="${book.publisher}"/></td>
            <td><c:out value="${book.type}"/></td>
            <td><a href="/admin/books/one?id=${book.id}">Pokaż</a>
            <a href="/admin/books/edit?id=${book.id}">Edycja</a>
            <a href="/admin/books/delete?id=${book.id}">Usuń</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br><br>

<h4>Możesz z tego miejsca <a href="/admin/books/create">dodać książkę</a> lub <a href="/">wrócić na stronę główną</a>.</h4>
</body>
</html>


