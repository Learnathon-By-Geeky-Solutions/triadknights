<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Register - agriConnect</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>

<!-- Navigation Bar -->
<!-- Navigation Bar -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">agriConnect</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
</nav>


<!-- Registration Form -->
<div class="container mt-4">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h2 class="text-center">Create an Account</h2>
            <form action="registerForm" method="post">
                <!-- Username Field -->
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" class="form-control" value="${user.username}" required>
                    <small class="text-danger">${errors.username}</small>
                </div>

                <!-- Email Field -->
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" class="form-control" value="${user.email}" required>
                    <small class="text-danger">${errors.email}</small>
                </div>

                <!-- Phone Field -->
                <div class="form-group">
                    <label for="phone">Phone:</label>
                    <input type="text" id="phone" name="phone" class="form-control" value="${user.phone}" required>
                    <small class="text-danger">${errors.phone}</small>
                </div>

                <!-- Password Field -->
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" class="form-control" required>
                    <small class="text-danger">${errors.password}</small>
                </div>

                <!-- Role Selection -->
                <div class="form-group">
                    <label for="role">Role:</label>
                    <select id="role" name="role" class="form-control">
                        <option value="FARMER" ${user.role == 'FARMER' ? 'selected' : ''}>Farmer</option>
                        <option value="ADMIN" ${user.role == 'ADMIN' ? 'selected' : ''}>Admin</option>
                        <option value="BUYER" ${user.role == 'BUYER' ? 'selected' : ''}>Buyer</option>
                    </select>
                </div>

                <button type="submit" class="btn btn-success btn-block">Register</button>
            </form>
            <p class="mt-3 text-center">Already have an account? <a href="/login">Login here</a></p>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
