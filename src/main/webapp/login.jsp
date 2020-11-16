<%--
  Created by IntelliJ IDEA.
  User: sang666
  Date: 2020/5/27
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html;charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrom=1">
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/loginstyle.css" type="text/css" >
    <title>Title</title>
    <style type="text/css">
        body{
            background-image: url("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590569467261&di=d38c1152940e7d4b13e8f59cb02b60bd&imgtype=0&src=http%3A%2F%2Fimg1.juimg.com%2F141016%2F330696-14101619400449.jpg");
            background-position: center 0;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            -webkit-background-size: cover;
            -o-background-size: cover;
            -moz-background-size: cover;
            -ms-background-size: cover;
        }
        .container{
            padding-top: 100px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-offset-3 col-md-6">
            <form class="form-horizontal" action="${pageContext.request.contextPath }/login" method="post">
                <span class="heading">欢迎登录图书管理系统</span>
                <div class="form-group">
                    <input type="text" class="form-control" id="inputEmail3" name="username" placeholder="管理员用户名">
                    <i class="fa fa-user"></i>
                </div>
                <div class="form-group help">
                    <input type="password" class="form-control" id="inputPassword3" name="password" placeholder="密　码">
                    <i class="fa fa-lock"></i>
                    <a href="#" class="fa fa-question-circle"></a>
                </div>
                <div class="form-group">
                    <div class="main-checkbox">
                        <input type="checkbox" value="None" id="checkbox1" name="check"/>
                        <label for="checkbox1"></label>
                    </div>
                    <span class="text">Remember me</span>
                    <button type="submit" class="btn btn-default"  >登录</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>