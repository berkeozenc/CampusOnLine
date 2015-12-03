<%-- 
    Document   : instHome
    Created on : 30.Kas.2015, 22:20:43
    Author     : Berke
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id = "addDept" scope = "page" class= "Controller.DepartmentController"></jsp:useBean>
<jsp:setProperty name = "addDept" property = "*"/>
<!DOCTYPE html>


<html xmlns="http://www.w3.org/1999/xhtml"
     >



<head>

    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>

    <title>COL++ Add Department</title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>

    <!-- Custom Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'/>
    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'/>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css"/>

    <!-- Plugin CSS -->
    <link rel="stylesheet" href="css/animate.min.css" type="text/css"/>

    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/creative.css" type="text/css"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="adminHome.jsp">Main Page</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    
                  
                    
                    <li class="dropdown" >
                         <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="false">
        Manage Departments<b class="caret"></b>
    </a>
    <ul class="dropdown-menu">
      
        <li class="divider"></li>
        <li><a tabindex="-1" href="editDepartment.jsp">Edit/Delete Department</a></li>
        
        

        <!--  <li class="divider"></li> -->
       
    </ul>
                    </li>
                      
                        <li class="dropdown" >
                         <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="false">
        Manage Courses<b class="caret"></b>
    </a>
    <ul class="dropdown-menu">
        <li><a tabindex="-1" href="addCourse.jsp">Add Course</a></li>
        <li class="divider"></li>
        <li><a tabindex="-1" href="#">Edit/Delete Course</a></li>
        <li class="divider"></li>
        <li><a tabindex="-1" href="#">Manage Quotas</a></li>
        

        <!--  <li class="divider"></li> -->
       
    </ul>
                    </li>
                    
                     <li class="dropdown" >
                         <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="false">
        Manage Instructors<b class="caret"></b>
    </a>
    <ul class="dropdown-menu">
        <li><a tabindex="-1" href="addInstructor.jsp">Add Instructor</a></li>
        <li class="divider"></li>
        <li><a tabindex="-1" href="#">Edit/Delete Instructor</a></li>
        
        

        <!--  <li class="divider"></li> -->
       
    </ul>
                    </li>
                    
                    <li class="dropdown" >
                         <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="false">
        Manage Students<b class="caret"></b>
    </a>
    <ul class="dropdown-menu">
        <li><a tabindex="-1" href="addStudent.jsp">Add Student</a></li>
        <li class="divider"></li>
        <li><a tabindex="-1" href="#">Edit/Delete Student</a></li>
        
        

        <!--  <li class="divider"></li> -->
       
    </ul>
                    </li>
                    
                    <li>
                        <a class="page-scroll" href="addAdmin.jsp">Add Administrative Account</a>
                    </li>
                      <li>
                          <a class="page-scroll" href="personalInfo.jsp">Personal Info</a>
                    </li>
                     
                    <li>
                        <a class="page-scroll" href="login.html">Log Out</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header>
        <div class="header-content">
            <div class="header-content-inner">
                
                
                <form action='addDepartment.jsp' method='post'>
                    <table align='center'>
                        <tr>
                            <td style='padding: 20px'>
                                Department Name:</td><td><input type='text' class="form-control input-lg" name='depName' />
                            </td>
                        </tr>
                        <tr>
                            <td style='padding: 20px'>
                                Number Of Departmental Elective:</td><td><input type='text' class="form-control input-lg" name='numOfDepElect' />
                            </td>
                        </tr>
                        <tr>
                            <td style='padding: 20px'>
                                Number Of Complementary Elective:</td><td><input type='text' class="form-control input-lg" name='numOfCompElect' />
                            </td>
                        </tr>
                        <tr>
                            <td style='padding: 20px'>
                                Number Of Free Elective:</td><td><input type='text' class="form-control input-lg" name='numOfFreeElect' />
                            </td>
                        </tr>
                        <tr>
                            
                            <td>
                                &nbsp;
                            </td>
                            <td>
                                <input type='submit' value='Add Department' class="btn btn-primary btn-lg btn-block" />
                            </td>
                            
                        </tr>
                            
                    </table>
                </form>
                <%
                    if(request.getParameter("depName") != null && request.getParameter("numOfDepElect") != null && request.getParameter("numOfCompElect") != null
                        && request.getParameter("numOfFreeElect") != null ){
                       if(addDept.add()){
                %>
                    <%=addDept.getDepName() + "Eklendi" %>
                    <%}
else{%>
                <%=addDept.getDepName() + "Eklenemedi"%>
                <%}}%>
                <hr/>
              
                
                
            </div>
        </div>
    </header>

    

   

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/jquery.fittext.js"></script>
    <script src="js/wow.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/creative.js"></script>

</body>

</html>

