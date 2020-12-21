<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<title>Login</title>
	<script>
          function clearP() {
              document.getElementById("demo1").innerHTML="";
          }
          function showPassword() {
              var x = document.getElementById("inputPassword");
              if (x.type === "password") {
                  x.type = "text";
              } else {
                  x.type = "password";
              }
          }

          function load(link) {
		  	  window.location.href = link;
          }
    </script>
</head>

<body>

	<nav class="navbar navbar-light bg-dark">
		<div class="container">
		  <a class="navbar-brand" href="#">Voting System</a>
		  <form class="justify-content-end">
		    <!-- <button class="btn btn-outline-success me-2" style="margin-right: 10px" type="button">Main button</button> -->
		    <button class="btn btn-sm btn-outline-secondary" onclick="load('register')" style="margin-right: 10px" type="button">Register</button>
		  </form>
	  	</div>
	</nav>
	
        
    <div class="container mt-4">
		<h3>Login</h3>
		<hr>
		
		<form action="" method="POST">
		  <div class="form-group">
		    <label for="inputUsername">Username</label>
		    <input type="text" name="username" class="form-control" id="inputUsername" aria-describedby="emailHelp" placeholder="Enter Username">
		  </div>
		  <div class="form-group">
		    <label for="InputPassword">Password</label>
		    <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Enter Password">
		    <input type="checkbox" style="margin-top: 10px;" onclick="showPassword()" id="icon1">
            	<label for="icon1">Show Password</label>
		  </div>
		
		  <div class="form-group">
               <input type="submit" name="loggedin" class="btn btn-primary" value="Log in">
		  </div>
		</form>
			
	</div>
	
</body>
</html>