<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<#include "include.ftl" />
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Visual Admin Dashboard - Main</title>
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript" src="<@spring.url'/js/module/dashboard.js'/>"></script>
    <script type="text/javascript" src="<@spring.url'/js/module/patientMgr.js'/>"></script>
    <script type="text/javascript">
        $(function() {
            var dashboard = new Dashboard();
            var patientMgr = new PatientMgr();

            var param = {};
            $('#dashboard').click();

            $('#dashboard').click(function() {
                setActive(this);
                dashboard.init("container", param);
            });

            $('#patientMgr').click(function() {
                setActive(this);
                patientMgr.init("container", param);
            });

            $('#groupMgr').click(function() {

            });

            $('#filesMgr').click(function() {

            });

            $('#modelMgr').click(function() {

            });

            $('#logout').click(function() {

            });
        });

        function setActive(tag) {
            $('nav#leftNav ul li a').removeClass("active");
            $(tag).addClass("active");
        }
    </script>

</head>
<body>
<!-- Left column -->
<div class="templatemo-flex-row">
    <div class="templatemo-sidebar">
        <header class="templatemo-site-header">
            <div class="square"></div>
            <h1>Visual Admin</h1>
        </header>
        <#--<div class="profile-photo-container">
            <img src="images/profile-photo.jpg" alt="Profile Photo" class="img-responsive">
            <div class="profile-photo-overlay"></div>
        </div>-->
        <!-- Search box -->
        <form class="templatemo-search-form" role="search">
            <div class="input-group">
                <button type="submit" class="fa fa-search"></button>
                <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
            </div>
        </form>
        <div class="mobile-menu-icon">
            <i class="fa fa-bars"></i>
        </div>
        <nav id="leftNav" class="templatemo-left-nav">
            <ul>
                <li><a id="dashboard" class="active"><i class="fa fa-home fa-fw"></i>工作界面</a></li>
                <li><a id="patientMgr"><i class="fa fa-users fa-fw"></i>病患管理</a></li>
                <li><a id="groupMgr"><i class="fa fa-hospital-o fa-fw"></i>科室管理</a></li>
                <li><a id="filesMgr"><i class="fa fa-bar-chart fa-fw"></i>文件管理</a></li>
                <li><a id="modelMgr"><i class="fa fa-database fa-fw"></i>模型管理</a></li>
                <li><a id="logout"><i class="fa fa-eject fa-fw"></i>登出</a></li>
            </ul>
        </nav>
    </div>
    <!-- Main content -->
    <div class="templatemo-content col-1 light-gray-bg">
        <div class="templatemo-top-nav-container">
            <div class="row">
                <table>
                    <tbody>
                        <tr>
                            <td>
                                <span class="dropdown">
                                    <button style="border-color: #fff; padding: 0px 40px 0px 16px;" class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                        DROPDOWN
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Action</a></li>
                                        <li><a href="#">Another action</a></li>
                                        <li><a href="#">Something else here</a></li>
                                        <li role="separator" class="divider"></li>
                                        <li><a href="#">Separated link</a></li>
                                        <li role="separator" class="divider"></li>
                                        <li><a href="#">One more separated link<br>ssss</a></li>
                                    </ul>
                                </span>
                            </td>
                            <td>
                                <nav class="templatemo-top-nav col-lg-12 col-md-12">
                                    <ul class="text-uppercase">
                                    <#--<li><a href="" class="active">Admin panel</a></li>-->
                                        <li><a href="">Dashboard</a></li>
                                        <li><a href="">Overview</a></li>
                                        <li><a href="login.html">Sign in form</a></li>
                                    </ul>
                                </nav>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <#--<nav class="templatemo-top-nav col-lg-12 col-md-12">
                    <ul class="text-uppercase">
                        <li><a href="" class="active">Admin panel</a></li>
                        <li><a href="">Dashboard</a></li>
                        <li><a href="">Overview</a></li>
                        <li><a href="login.html">Sign in form</a></li>
                    </ul>
                </nav>-->

            </div>
        </div>
        <div class="templatemo-content-container" style="padding: 0px">

            <div id="container"></div>

            <footer class="text-right">
                <p>Copyright &copy; 2016 <a href="http://www.templatemo.com" target="_parent">KOO</a></p>
            </footer>
        </div>
    </div>
</div>

<!-- JS -->

</body>
</html>