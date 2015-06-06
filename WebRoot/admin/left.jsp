<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../js/bootstrap.min.js"></script>
<base href="<%=basePath%>">

<title>My JSP 'left.jsp' starting page</title>

</head>

<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<ul class="nav nav-list">
					<li class="nav-header">菜单</li>
					<li class="active"><a href="#">用户管理</a></li>
					<li><a href="#">注册用户</a></li>
					<li><a href="#">黑名单</a></li>
					<li><a href="#">角色管理</a></li>
					<li><a href="#">权限管理</a></li>
					<li class="active"><a href="#">酒店管理</a></li>
					<li><a href="#">酒店列表</a></li>
					<li><a href="#">房型设置</a></li>
					<li><a href="#">房间列表</a></li>
					<li class="active"><a href="#">合同管理</a></li>
					<li><a href="#">合同列表</a></li>
					<li class="active"><a href="#">存房管理</a></li>
					<li><a href="#">存房列表</a></li>
					<li class="divider"></li>
					<li><a href="#">帮助</a></li>

				</ul>
			</div>
		</div>
	</div>

</body>
</html>
