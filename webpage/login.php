<!doctype HTML>

<?php
  if($_POST["submit"]){

  }
?>

  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Project Q</title>

    <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
  </head>

  <body>

    <div class="jumbotron">
      <div class="container">
        <h1>Project Q - Login</h1>
        <form method="post">
          <div class="form-group">
            <input class="form-control" name="email" type="text" placeholder="Email"></input>
          </div>
          <div class="form-group">
            <input class="form-control" name="pass" type="text" placeholder="Password"></input>
          </div>
          <div class="form-group">
            <input class="btn btn-success" name="submit" type="submit"></input>
          </div>
        </form>
      </div>
      <!--/container-->

    </div>
    <!--/jumbotron-->

  </body>

  </html>