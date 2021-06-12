<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Management</title>
</head>
<body>

<h2>Witaj serdecznie na stronie aplikacji <h1>Book Management</h1></h2><br>

<table border="1">
    <thead>
    <th>Readme</th>
    <th>Akcja inicjująca</th>
    <th>Dodanie książki</th>
    </thead>

    <tbody>
        <tr>
            <td><a href="https://github.com/grzjar/bookAPI#bookapi">Opis aplikacji</a></td>
            <td><a href="/admin/books/all">Lista książek</a></td>
            <td><a href="/admin/books/create">Dodaj książkę</a></td>
        </tr>
    </tbody>
</table>
</body>
</html>