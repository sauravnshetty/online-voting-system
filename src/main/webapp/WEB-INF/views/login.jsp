<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<script>
          function clearP() {
              document.getElementById("demo1").innerHTML="";
          }
          function myFunction() {
              var x = document.getElementById("pass");
              if (x.type === "password") {
                  x.type = "text";
              } else {
                  x.type = "password";
              }
          }
    </script>
</head>

<body>
	<div class="container">
        <header>
            <h1>Voting System</h1>
        </header>
        
        <form name="login_form"  action="" method="POST">
            <label for="username">Email  </label> <br>
            <input type="text" name="username" id="username" required placeholder="Enter username">
            <br>
            <label for="pass">Password</label> <br>
            <input type="password" id="pass" name="upassword" required placeholder="Enter password">
            <br>
            <input type="checkbox" onclick="myFunction()" id="icon1">
             <label for="icon1">Show Password</label>
             <br>
            <p id="demo1"> <?php echo $msg; ?> </p>
            <br>
            <input class="submitclass" type="submit" value="login">
            <br>
            <input class="submitclass" type="reset" value="Clear">
            <br><br>
        </form>
	</div>
</body>
</html>