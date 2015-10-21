<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>jquery css3动态背景用户登录界面演示</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<!-- 代码 开始 -->
<div class="wrapper">
	<div class="container">
		<h1>欢迎登录</h1>
		
		<form class="form" action="login.action" method="post" >
			<input type="text" name="admin.adminName" placeholder="用户名">
			<input type="password" name="admin.adminPsw" placeholder="密码">
			<button type="submit" id="login-button">登录</button>
		</form>
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
</div>

<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>

<!-- 代码 结束 -->
</body>
</html>