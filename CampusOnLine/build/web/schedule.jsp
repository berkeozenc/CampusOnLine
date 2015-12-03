<%-- 
    Document   : schedule
    Created on : 02.Ara.2015, 14:46:31
    Author     : LabTek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
    >



<head>

    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>

    <title>COL++ Schedule</title>

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
                <a class="navbar-brand page-scroll" href="stuHome.jsp">Main Page</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                   
                    <li>
                        <a class="page-scroll" href="#">Admission-Online</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="registration.jsp">Registrar-Online</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#">Curriculum</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#">Ccr</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#">Instructor and Course Evaluation</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#">Transcript</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#">Messages</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="index.xhtml">Log Out</a>
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
                
                                <table border="2" style="background-color:#000;border-color: darksalmon;">
                                    <tr>
                                        <td colspan="17">WEEKLY SCHEDULE</td>
                                    </tr>
                                    <tr>
                                        <td>&nbsp;</td>
                                        <td style="padding: 15px;"><p>1</p>9_10</td>
                                        <td style="padding: 15px;"><p>2</p>10_11</td>
                                        <td style="padding: 15px"><p>3</p>11_12</td>
                                        <td style="padding: 15px"><p>4</p>12_13</td>
                                        <td style="padding: 15px"><p>5</p>13_14</td>
                                        <td style="padding: 15px"><p>6</p>14_15</td>
                                        <td style="padding: 15px"><p>7</p>15_16</td>
                                        <td style="padding: 15px"><p>8</p>16_17</td>
                                        <td style="padding: 5px"><p>9</p>17_18</td>
                                        <td style="padding: 5px"><p>10</p>18_19</td>
                                        <td style="padding: 5px"><p>11</p>19_20</td>
                                        <td style="padding: 5px"><p>12</p>20_21</td>
                                        <td style="padding: 5px"><p>13</p>21_22</td>
                                        <td style="padding: 5px"><p>14</p>22_23</td>
                                        <td style="padding: 5px"><p>15</p>23_24</td>
                                        <td style="padding: 5px"><p>16</p>24_01</td>
                                        
                                    </tr>
                                    <tr>
                                        <td style="padding: 15px">Mon</td> 
                                        <td style="background-color: #888" name="mon1" id="mon1"></td> 
                                        <td style="background-color: #888" name="mon2" id="mon2"></td>
                                        <td style="background-color: #888" name="mon3" id="mon3"></td> 
                                        <td style="background-color: #888" name="mon4" id="mon4"></td> 
                                        <td style="background-color: #888" name="mon5" id="mon5"></td> 
                                        <td style="background-color: #888" name="mon6" id="mon6"></td> 
                                        <td style="background-color: #888" name="mon7" id="mon7"></td> 
                                        <td style="background-color: #888" name="mon8" id="mon8"></td> 
                                        <td style="background-color: #888" name="mon9" id="mon9"></td> 
                                        <td style="background-color: #888" name="mon10" id="mon10"></td> 
                                        <td style="background-color: #888" name="mon11" id="mon11"></td> 
                                        <td style="background-color: #888" name="mon12" id="mon12"></td> 
                                        <td style="background-color: #888" name="mon13" id="mon13"></td> 
                                        <td style="background-color: #888" name="mon14" id="mon14"></td> 
                                        <td style="background-color: #888" name="mon15" id="mon15"></td>
                                        <td style="background-color: #888" name="mon16" id="mon16"></td> 
                                        
                                    </tr>
                                    <tr>
                                        <td style="padding: 15px">Tue</td> 
                                        <td style="background-color: #888" name="tue1" id="tue1"></td> 
                                        <td style="background-color: #888" name="tue2" id="tue2"></td>
                                        <td style="background-color: #888" name="tue3" id="tue3"></td> 
                                        <td style="background-color: #888" name="tue4" id="tue4"></td> 
                                        <td style="background-color: #888" name="tue5" id="tue5"></td> 
                                        <td style="background-color: #888" name="tue6" id="tue6"></td> 
                                        <td style="background-color: #888" name="tue7" id="tue7"></td> 
                                        <td style="background-color: #888" name="tue8" id="tue8"></td> 
                                        <td style="background-color: #888" name="tue9" id="tue9"></td> 
                                        <td style="background-color: #888" name="tue10" id="tue10"></td> 
                                        <td style="background-color: #888" name="tue11" id="tue11"></td> 
                                        <td style="background-color: #888" name="tue12" id="tue12"></td> 
                                        <td style="background-color: #888" name="tue13" id="tue13"></td> 
                                        <td style="background-color: #888" name="tue14" id="tue14"></td> 
                                        <td style="background-color: #888" name="tue15" id="tue15"></td>
                                        <td style="background-color: #888" name="tue16" id="tue16"></td> 
                                        
                                    </tr>
                                    <tr>
                                        <td style="padding: 15px">Wed</td> 
                                        <td style="background-color: #888" name="wed1" id="wed1"></td>  
                                        <td style="background-color: #888" name="wed2" id="wed2"></td>
                                        <td style="background-color: #888" name="wed3" id="wed3"></td> 
                                        <td style="background-color: #888" name="wed4" id="wed4"></td> 
                                        <td style="background-color: #888" name="wed5" id="wed5"></td> 
                                        <td style="background-color: #888" name="wed6" id="wed6"></td> 
                                        <td style="background-color: #888" name="wed7" id="wed7"></td> 
                                        <td style="background-color: #888" name="wed8" id="wed8"></td> 
                                        <td style="background-color: #888" name="wed9" id="wed9"></td> 
                                        <td style="background-color: #888" name="wed10" id="wed10"></td> 
                                        <td style="background-color: #888" name="wed11" id="wed11"></td> 
                                        <td style="background-color: #888" name="wed12" id="wed12"></td> 
                                        <td style="background-color: #888" name="wed13" id="wed13"></td> 
                                        <td style="background-color: #888" name="wed14" id="wed14"></td> 
                                        <td style="background-color: #888" name="wed15" id="wed15"></td>
                                        <td style="background-color: #888" name="wed16" id="wed16"></td> 
                                        
                                    </tr>
                                    <tr>
                                        <td style="padding: 15px">Thu</td> 
                                        <td style="background-color: #888" name="thu1" id="thu1"></td> 
                                        <td style="background-color: #888" name="thu2" id="thu2"></td>
                                        <td style="background-color: #888" name="thu3" id="thu3"></td> 
                                        <td style="background-color: #888" name="thu4" id="thu4"></td> 
                                        <td style="background-color: #888" name="thu5" id="thu5"></td> 
                                        <td style="background-color: #888" name="thu6" id="thu6"></td> 
                                        <td style="background-color: #888" name="thu7" id="thu7"></td> 
                                        <td style="background-color: #888" name="thu8" id="thu8"></td> 
                                        <td style="background-color: #888" name="thu9" id="thu9"></td> 
                                        <td style="background-color: #888" name="thu10" id="thu10"></td> 
                                        <td style="background-color: #888" name="thu11" id="thu11"></td> 
                                        <td style="background-color: #888" name="thu12" id="thu12"></td> 
                                        <td style="background-color: #888" name="thu13" id="thu13"></td> 
                                        <td style="background-color: #888" name="thu14" id="thu14"></td> 
                                        <td style="background-color: #888" name="thu15" id="thu15"></td>
                                        <td style="background-color: #888" name="thu16" id="thu16"></td> 
                                        
                                    </tr>
                                    <tr>
                                        <td style="padding: 15px">Fri</td> 
                                        <td style="background-color: #888" name="fri1" id="fri1"></td> 
                                        <td style="background-color: #888" name="fri2" id="fri2"></td>
                                        <td style="background-color: #888" name="fri3" id="fri3"></td> 
                                        <td style="background-color: #888" name="fri4" id="fri4"></td> 
                                        <td style="background-color: #888" name="fri5" id="fri5"></td> 
                                        <td style="background-color: #888" name="fri6" id="fri6"></td> 
                                        <td style="background-color: #888" name="fri7" id="fri7"></td> 
                                        <td style="background-color: #888" name="fri8" id="fri8"></td> 
                                        <td style="background-color: #888" name="fri9" id="fri9"></td> 
                                        <td style="background-color: #888" name="fri10" id="fri10"></td> 
                                        <td style="background-color: #888" name="fri11" id="fri11"></td> 
                                        <td style="background-color: #888" name="fri12" id="fri12"></td> 
                                        <td style="background-color: #888" name="fri13" id="fri13"></td> 
                                        <td style="background-color: #888" name="fri14" id="fri14"></td> 
                                        <td style="background-color: #888" name="fri15" id="fri15"></td>
                                        <td style="background-color: #888" name="fri16" id="fri16"></td> 
                                        
                                    </tr>
                                    <tr>
                                        <td style="padding: 15px">Sat</td> 
                                        <td style="background-color: #888" name="sat1" id="sat1"></td> 
                                        <td style="background-color: #888" name="sat2" id="sat2"></td>
                                        <td style="background-color: #888" name="sat3" id="sat3"></td> 
                                        <td style="background-color: #888" name="sat4" id="sat4"></td> 
                                        <td style="background-color: #888" name="sat5" id="sat5"></td> 
                                        <td style="background-color: #888" name="sat6" id="sat6"></td> 
                                        <td style="background-color: #888" name="sat7" id="sat7"></td> 
                                        <td style="background-color: #888" name="sat8" id="sat8"></td> 
                                        <td style="background-color: #888" name="sat9" id="sat9"></td> 
                                        <td style="background-color: #888" name="sat10" id="sat10"></td> 
                                        <td style="background-color: #888" name="sat11" id="sat11"></td> 
                                        <td style="background-color: #888" name="sat12" id="sat12"></td> 
                                        <td style="background-color: #888" name="sat13" id="sat13"></td> 
                                        <td style="background-color: #888" name="sat14" id="sat14"></td> 
                                        <td style="background-color: #888" name="sat15" id="sat15"></td>
                                        <td style="background-color: #888" name="sat16" id="sat16"></td> 
                                        
                                    </tr>
                                </table>
                       
                <hr/>
                
                <a href="#" class="btn btn-primary btn-xl page-scroll">PRINT MY SCHEDULE</a>
                
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

