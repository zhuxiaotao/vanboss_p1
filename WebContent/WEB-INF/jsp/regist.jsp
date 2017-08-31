<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="itcast" uri="http://itcast.cn/common/"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Minimal and Clean Sign up / Login and Forgot Form by
	FreeHTML5.co</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
<meta name="keywords"
	content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<link rel="shortcut icon" href="favicon.ico">

<!-- <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'> -->

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/style.css">

<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

</head>
<body class="style-2">

	<div class="container">
		<div class="row">
			<div class="col-md-4">


				<!-- Start Sign In Form -->
				<form action="/userRegister.do" class="fh5co-form animate-box"
					data-animate-effect="fadeInLeft">
					<h2>用户注册</h2>
					<div class="form-group">
						<label for="name" class="sr-only">用户名</label> <input type="text"
						 class="form-control" id="userName" name="userName"
							placeholder="用户名" autocomplete="off">
						<h6 id="uni"></h6>
					</div>
					<div class="form-group">
						<label for="email" class="sr-only">邮箱</label> <input type="email"
							class="form-control" id="email" name="email"
							placeholder="邮箱" autocomplete="off">
						<h6 id="une"></h6>
					</div>
					<div class="form-group">
						<label for="password" class="sr-only">密码</label> <input
							type="password" class="form-control" id="passWord" name="passWord"
							placeholder="密码" autocomplete="off">
						<h6 id="unp"></h6>
					</div>
					<div class="form-group">
						<label for="re-password" class="sr-only">密码重复</label> <input
							type="password" class="form-control" id="rePassWord"
							name="rePassWord" placeholder="密码重复" autocomplete="off">
						<h6 id="unrp"></h6>
					</div>
					<div class="form-group">
						<input type="submit" id="submit" value="注&nbsp&nbsp&nbsp&nbsp&nbsp册"
							class="btn btn-primary" disabled="disabled">&nbsp&nbsp&nbsp&nbsp&nbsp 
							
							<input type="button" onclick="loginGoBack()"
							value="返&nbsp&nbsp&nbsp&nbsp&nbsp回" class="btn btn-primary">
					</div>
				</form>
				<!-- END Sign In Form -->

			</div>
		</div>
	</div>

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script src="js/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="js/main.js"></script>
	<script type="text/javascript">
	var unn=0;
	var unp=0;
	var une=0;
	var unrp=0;
	function loginGoBack(){
		window.location.href="http://192.168.27.1:8080/login.do";
	}
	
	$(function(){
		/* 用户名校验代码 */
		$("#userName").blur(function (){
			var name=$("#userName").val();
			if(""==name){
				$("#uni").html("用户名不能为空");
			}else{
				$("#uni").html("");
				var data = '{"username": "'+name+'"}';
				$.ajax({
					/* ajax访问的url */
					url : "http://192.168.27.1:8080/userNameCheck.do",
					/* ajax请求方式 */
					type : "post",
					/* ajax请求参数 */
					data : data,
					/* 这个代表上传参数为json格式 */
					contentType : "application/json;charset=UTF-8",
					/* ajax返回值类型 */
					dataType : "json",
					/* ajax成功的回调函数 自定义的业务逻辑*/
					success : function(data){
						if(data.username!=""){
							$("#uni").html("用户已存在");
							$("#submit").attr("disabled", true);
							unn=0;
						} else{
							unn=1;
							if(unn==1 & une==1 & unp==1 & unrp==1){
								$("#submit").removeAttr("disabled");
							}
						}
					}
				});
			}
		});
		
		//邮箱校验为空代码
		$("#email").blur(function (){
			var enmail=$("#email").val();
			if(""==enmail){
				$("#submit").attr("disabled", true);
				$("#une").html("邮箱不能为空");
				une=0;
			}else{
				une=1;
				if(unn==1 & une==1 & unp==1 & unrp==1){
					$("#submit").removeAttr("disabled");
					$("#une").html("");
				}
			}
		});
		
		//密码校验为空代码
		$("#passWord").blur(function (){
			var password=$("#passWord").val();
			if(""==password){
				$("#submit").attr("disabled", true);
				$("#unp").html("密码不能为空");
				unp=0;
			}else{
				unp=1;
				if(unn==1 & une==1 & unp==1 & unrp==1){
					$("#submit").removeAttr("disabled");
					$("#unp").html("");
				}
			}
		});
		
		//密码重复校验为空代码
		$("#rePassWord").blur(function (){
			var password=$("#passWord").val();
			var repassword=$("#rePassWord").val();
			if(password!=repassword){
				$("#submit").attr("disabled", true);
				$("#unrp").html("密码不一致");
				unrp=0;
			}else{
				unrp=1;
				if(unn==1 & une==1 & unp==1 & unrp==1){
					$("#submit").removeAttr("disabled");
					$("#unrp").html("");
				}
			}
		});
		
	})
	
	</script>

</body>
</html>

