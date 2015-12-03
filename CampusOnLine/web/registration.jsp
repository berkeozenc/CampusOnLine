<%-- 
    Document   : registration.jsp
    Created on : 01.Ara.2015, 17:16:22
    Author     : LabTek
--%>

<%@page import="Model.Course"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml"
      >

<%@ page import = "Controller.Registration" %>
<%@page import="Model.Section"%>
<jsp:useBean id = "reg" scope = "page" class= "Controller.Registration"></jsp:useBean>
<jsp:useBean id = "login" scope = "session" class= "Controller.Login"></jsp:useBean>

<head>

    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>

    <title>COL++ Registrar Page</title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>

    <!-- Custom Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'/>
    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'/>
   
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/creative.css" type="text/css"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<script src="js/jquery-1.10.2.min.js"></script>
 <script src="js/bootstrap.min.js"></script>

     <link rel="stylesheet" href="css/bootstrap-multiselect.css" type="text/css">
        <script type="text/javascript" src="js/bootstrap-multiselect.js"></script>
</head>

<body id="page-top">
    <% reg.setU(login.getU());%>
    
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
                <a class="navbar-brand page-scroll" href="#page-top">Main Page</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="stuSchedule.xhtml">Schedule</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="stuAdmission.xhtml">Admission-Online</a>
                    </li>
                    
                    <li>
                        <a class="page-scroll" href="curri.xhtml">Curriculum</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="ccr.xhtml">Ccr</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="evaluationForm.xhtml">Instructor and Course Evaluation</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="transcript.xhtml">Transcript</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="stuMessages.xhtml">Messages</a>
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
                <table>
                    <tr>
                        <td>
                            <div name="selected" style="margin-right: 60px; background-color: #000">
                                
                                <table border="1">
                                    <tr>
                                        <td colspan="7">SELECTED COURSES</td>
                                    </tr>
                                    
                                    
                                    
                                    <tr name="selected_data">
                                        
                                    </tr>
                                </table>
                            </div>
                        </td>
                        <td>
                            <div name="all_courses" style="background-color: #000">
                                <table border="1">
                                    <tr>
                                        <td colspan="8">ALL COURSES</td>
                                    </tr>
                                    <tr>
                                        <td>&nbsp;</td>
                                        <td style="padding: 15px">Course Code</td>
                                        <td style="padding: 15px">Course Name</td>
                                        <td style="padding: 15px">Section</td>
                                        <td style="padding: 15px">Instructor</td>
                                        <td style="padding: 15px">Days</td>
                                        <td style="padding: 15px">Hours</td>
                                        <td style="padding: 15px">Credits</td>
                                    </tr>
                                    
                                    <%reg.filterCourses();%>
                                    <tr><td colspan="8">OBLIGATORY</td></tr>
                                    <%
                                        for(Course c : reg.obligatory){
                                            for(Section s : c.sections){
                                    %>
                                    <tr>
                                        <td> <input type='checkbox' name='selected[]' value='<%= c.code%> <%= c.name%> <%= s.sectionNo%> <%= s.instructorName%> <%= s.days%> <%= s.hours%> <%= c.credit%>' />
                                        </td><td><%= c.code%></td>
                                    <td><%= c.name%></td>
                                   <td> <%= s.sectionNo%></td>
                                   <td> <%= s.instructorName%></td>
                                   <td> <%= s.days%></td>
                                   <td> <%= s.hours%></td>
                                    <td><%= c.credit%></td>
                                    </tr> 
                                    <%
                                            }
                                        }
                                    %>
                                    <%for(int i=1; i<reg.getS().getDept().numOfDeptElect; i++){%>
                                    <tr><td colspan = "8">Departmental Elective <%=i%></td></tr>
                                        <%
                                            for(Course c : reg.deptElective){
                                                for(Section s : c.sections){
                                        %>
                                        <tr> 
                                            <td> <input type='checkbox' name='selected[]' value='<%= c.code%> <%= c.name%> <%= s.sectionNo%> <%= s.instructorName%> <%= s.days%> <%= s.hours%> <%= c.credit%>' />
                                            </td><td><%= c.code%></td>
                                    <td><%= c.name%></td>
                                   <td> <%= s.sectionNo%></td>
                                   <td> <%= s.instructorName%></td>
                                   <td> <%= s.days%></td>
                                   <td> <%= s.hours%></td>
                                    <td><%= c.credit%></td>
                                    </tr>  
                                        <%
                                                }
                                            }
                                        %>
                                    <%}%>
                                    
                                    <%for(int i=1; i<reg.getS().getDept().numOfCompElect; i++){%>
                                        <tr><td colspan = "8">Complementary Elective <%=i%></td></tr>
                                        <%
                                            for(Course c : reg.compElective){
                                                for(Section s : c.sections){
                                        %>
                                       <tr><td> <input type='checkbox' name='selected[]' value='<%= c.code%> <%= c.name%> <%= s.sectionNo%> <%= s.instructorName%> <%= s.days%> <%= s.hours%> <%= c.credit%>' />
                                           </td><td><%= c.code%></td>
                                    <td><%= c.name%></td>
                                   <td> <%= s.sectionNo%></td>
                                   <td> <%= s.instructorName%></td>
                                   <td> <%= s.days%></td>
                                   <td> <%= s.hours%></td>
                                    <td><%= c.credit%></td>
                                    </tr>  
                                        <%
                                                }
                                            }
                                        %>
                                    <%}%>
                                    
                                    
                                    <%for(int i=1; i<reg.getS().getDept().numOfFreeElect; i++){%>
                                        <tr><td colspan = "8">Free Elective <%=i%></td></tr>
                                        <%
                                            for(Course c : reg.freeElective){
                                                for(Section s : c.sections){
                                        %>
                                        <tr><td> <input type='checkbox' name='selected[]' value='<%= c.code%> <%= c.name%> <%= s.sectionNo%> <%= s.instructorName%> <%= s.days%> <%= s.hours%> <%= c.credit%>' />
                                            </td><td><%= c.code%></td>
                                    <td><%= c.name%></td>
                                   <td> <%= s.sectionNo%></td>
                                   <td> <%= s.instructorName%></td>
                                   <td> <%= s.days%></td>
                                   <td> <%= s.hours%></td>
                                    <td><%= c.credit%></td>
                                    </tr> 
                                        <%
                                                }
                                            }
                                        %>
                                    <%}%>
                                    
                                    <tr name="all_courses_data">
                                        
                                    </tr>
                                </table>
                            </div>
                        </td>
                    </tr>
                </table>
               
                
            </div>
        </div>
    </header>

    

   

   

</body>

</html>

