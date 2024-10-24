<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Members List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h1>Members List</h1>
<%--    <a href="<c:url value='/members/new'/>" class="btn btn-primary mb-3">Add New Member</a>--%>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Membership Number</th>
            <th>Name</th>
            <th>Nationality</th>
            <th>Membership Date</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${members}" var="member">
            <tr>
                <td>${member.id}</td>
                <td>${member.membershipNumber}</td>
                <td>${member.firstName} ${member.lastName}</td>
                <td>${member.nationality}</td>
                <td>${member.membershipDate}</td>
                <td>
                    <a href="<c:url value='/members/${member.id}'/>" class="btn btn-info btn-sm">View</a>
                    <a href="<c:url value='/members/${member.id}/edit'/>" class="btn btn-warning btn-sm">Edit</a>
                    <a href="<c:url value='/members/${member.id}/delete'/>" class="btn btn-danger btn-sm"
                       onclick="return confirm('Are you sure?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>