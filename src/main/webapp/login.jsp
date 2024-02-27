<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="tonprogramming">
    <meta name="description" content="template for login design">
    <title>LOGIN TEMPLATE</title>
    <link href="styles/normalize.css" rel="stylesheet">
    <link href="styles/base.css" rel="stylesheet">
    <link href="styles/medium.css" rel="stylesheet">
    <link href="styles/larger.css" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet"></head>

<body>
    <p><a href="register.jsp">Don't have an account? click to register </a></p>

    <main>
        <div class="title-wrapper">
            <img src="images/ekiti-logo-small.webp" alt="your logo here"  width="60" height="60">
            <div>
                <h1>SUREPAY LOGIN PORTAL</h1>
            </div>
        </div>
        <div class="form-wrapper">
            <% if( request.getAttribute("error") != null) {  %>
            <p style="color: red; text-align: center"><%= request.getAttribute("error") %></p>
            <% } %>
           <form action="Login" method="post">
            <label for="username">Username</label>
            <input type="text" id="username" name="username" value="<%= request.getAttribute("uname") != null ? request.getAttribute("uname") : "" %>">
            <label for="password">password</label>
            <input type="password" id="password" name="password" value="<%= request.getAttribute("pass") != null ? request.getAttribute("pass") : "" %>">
            <div class="btn-wrapper">
                <button type="submit" aria-label="Submit">Submit</button>
            </div>
           </form>
        </div>
    </main>
<footer>&copy; 2024-tonprogramming.com</footer>
</body>
</html>