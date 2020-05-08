
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <c:set var="context" value="${pageContext.request.contextPath}" />
  		<title>Agriculture</title>
<!-- 

Highway Template

https://templatemo.com/tm-520-highway

-->
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" href="${context}/resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="${context}/resources/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="${context}/resources/css/fontAwesome.css">
        <link rel="stylesheet" href="${context}/resources/css/light-box.css">
        <link rel="stylesheet" href="${context}/resources/css/templatemo-style.css">

        <link href="https://fonts.googleapis.com/css?family=Kanit:100,200,300,400,500,600,700,800,900" rel="stylesheet">

        <script src="${context}/resources/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    </head>

<body style="background:black;">

    <nav>
        <div class="logo">
            <a href="/index">Agri<em>Culture</em></a>
        </div>
        <div class="menu-icon">
        <span></span>
      </div>
    </nav>
    <div class="full-screen-portfolio" id="portfolio">
        <div class="container-fluid">
        <video style="width:100%;height:584px;margin-left:0%;" src="../../Content/Agriculture/${imagename}.mp4" controls="" type="video/mp4"></video>
        </div>
        <div style="padding: 10px;">
        <a href="../../Content/Agriculture/${imagename}.mp4" download="">
        <p style="text-align: center;height: 20px;"><i class="fa fa-download"></i> Download Now</p></a></div>
        </div>

    <footer>
        <div class="container-fluid">
            <div class="col-md-12">
                <p>Copyright &copy; 2020 Agriculture 
            </div>
        </div>
    </footer>

    <section class="overlay-menu">
      <div class="container">
        <div class="row">
          <div class="main-menu">
              <ul>
                  <li>
                      <a href="/index">Home</a>
                  </li>
              </ul>
          </div>
        </div>
      </div>
    </section>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="${context}/resources/js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

    <script src="${context}/resources/js/vendor/bootstrap.min.js"></script>
    
    <script src="${context}/resources/js/plugins.js"></script>
    <script src="${context}/resources/js/main.js"></script>

    
</body>
</html>