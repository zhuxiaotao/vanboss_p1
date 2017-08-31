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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>智慧实验室</title>

<!-- Bootstrap -->
<link href="/tempweb/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link href="tempweb/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link href="tempweb/vendors/nprogress/nprogress.css" rel="stylesheet">
<!-- jQuery custom content scroller -->
<link
	href="tempweb/vendors/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.min.css"
	rel="stylesheet" />

<!-- Custom Theme Style -->
<link href="tempweb/build/css/custom.min.css" rel="stylesheet">
<!-- Switchery -->
<link href="/tempweb/vendors/switchery/dist/switchery.min.css"
	rel="stylesheet">

<!--App自定义的css-->
<style>
.chart {
	height: 200px;
	margin: 0px;
	padding: 0px;
}

h5 {
	margin-top: 30px;
	font-weight: bold;
}

h5:first-child {
	margin-top: 15px;
}

video {
	max-width: 1200px;
	width: 100%;
}
</style>
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<div class="col-md-3 left_col menu_fixed">
				<div class="left_col scroll-view">
					<div class="navbar nav_title" style="border: 0;">
						<a href="index.html" class="site_title">&nbsp <img
							src="/imgs/bobosilog.png" width="32px" height="32px"> <span>智慧实验室系统</span></a>
						<img ismap>
					</div>

					<div class="clearfix"></div>

					<!-- menu profile quick info -->
					<div class="profile clearfix">
						<div class="profile_pic">
							<img src="/images/img.jpg" alt="..."
								class="img-circle profile_img">
						</div>
						<div class="profile_info">
							<span>山东沃柏斯欢迎您!</span>
							<h2>实验员A</h2>
						</div>
					</div>
					<!-- /menu profile quick info -->

					<br />

					<!-- sidebar menu -->
					<div id="sidebar-menu"
						class="main_menu_side hidden-print main_menu">
						<div class="menu_section">
							<h3>&nbsp&nbsp&nbsp实验员</h3>
							<ul class="nav side-menu">
								<li><a><i class="fa fa-home"></i> 介绍 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="index.html">单位概况</a></li>
										<li><a href="index2.html">建筑概况</a></li>
										<li><a href="index3.html">实验室概况</a></li>
									</ul></li>
								<li><a><i class="fa fa-edit"></i> 环境<span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="form.html">实验室总管线</a></li>
										<li><a href="form_advanced.html">实验室支路管线</a></li>
									</ul></li>
								<li><a><i class="fa fa-flask"></i>监控<span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="general_elements.html">视频监控</a></li>
										<li><a href="media_gallery.html">门禁监控</a></li>
										<li><a href="typography.html">实验室监控</a></li>
									</ul></li>
								<li><a><i class="fa fa-table"></i> LIMS <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="tables.html">实验室预约</a></li>
										<li><a href="tables_dynamic.html">试剂管理</a></li>
										<li><a href="tables_dynamic.html">仪器管理</a></li>
										<li><a href="tables_dynamic.html">数据管理</a></li>
									</ul></li>
								<li><a><i class="fa fa-bar-chart-o"></i>能效 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="chartjs.html">用电管理</a></li>
										<li><a href="chartjs2.html">燃气管理</a></li>
										<li><a href="chartjs2.html">用水管理</a></li>
									</ul></li>
								<li><a><i class="fa fa-clone"></i>安全<span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="fixed_sidebar.html">危险气体</a></li>
										<li><a href="fixed_footer.html">火灾报警</a></li>
									</ul></li>
							</ul>
						</div>

					</div>
					<!--右侧导航栏页脚 -->
					<!-- /menu footer buttons -->
					<!-- <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div> -->
					<!-- /右侧导航栏页脚 -->
				</div>
			</div>

			<!-- top navigation -->
			<div class="top_nav">
				<div class="nav_menu">
					<nav>
						<div class="nav toggle">
							<a id="menu_toggle"><i class="fa fa-bars"></i></a>
						</div>

						<ul class="nav navbar-nav navbar-right">
							<li class=""><a href="javascript:;"
								class="user-profile dropdown-toggle" data-toggle="dropdown"
								aria-expanded="false"> <img src="images/img.jpg" alt="">实验员A<span
									class=" fa fa-angle-down"></span>
							</a>
								<ul class="dropdown-menu dropdown-usermenu pull-right">
									<li><a href="javascript:;"> 用户注册</a></li>
									<li><a href="javascript:;"> <span
											class="badge bg-red pull-right">50%</span> <span>用户设定</span>
									</a></li>
									<li><a href="login.html"><i
											class="fa fa-sign-out pull-right"></i>用户登出</a></li>
								</ul></li>

							<li role="presentation" class="dropdown"><a
								href="javascript:;" class="dropdown-toggle info-number"
								data-toggle="dropdown" aria-expanded="false"> <i
									class="fa fa-envelope-o"></i> <span class="badge bg-green">6</span>
							</a>
								<ul id="menu1" class="dropdown-menu list-unstyled msg_list"
									role="menu">
									<li><a> <span class="image"><img
												src="images/img.jpg" alt="Profile Image" /></span> <span> <span>实验员A</span>
												<span class="time">3 分钟前</span>
										</span> <span class="message"> xxxxxxxxxxxx
												yyyyyyyyyyyyyyyyyyyyyyyyyyyy... </span>
									</a></li>
									<li>
										<div class="text-center">
											<a> <strong>查看 所有</strong> <i class="fa fa-angle-right"></i>
											</a>
										</div>
									</li>
								</ul></li>
						</ul>
					</nav>
				</div>
			</div>
			<!-- /top navigation -->

			<!-- 页面主体内容书写 -->
			<div class="right_col" role="main">

				<!-- 顶部数字显示 -->
				<div class="row tile_count">
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top"><i class="fa fa-user"></i> 用户登录时间 </span>
						<div class="count">2500</div>
						<span class="count_bottom"><i class="green">4% </i>
							上周使用时间-% </span>
					</div>

					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top"><i class="fa fa-clock-o"></i>
							设备使用时间</span>
						<div class="count">123.50</div>
						<span class="count_bottom"><i class="green"><i
								class="fa fa-sort-asc"></i>60% </i> 上周使用时间-% </span>
					</div>

					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top"><i class="fa fa-clock-o"></i> 设备使用率</span>
						<div class="count">23.50</div>
						<span class="count_bottom"><i class="green"><i
								class="fa fa-sort-asc"></i>9% </i> 上周使用率-% </span>
					</div>

					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<a class="btn btn-app" style="margin-top: 12px"
							onclick="nettyrun()"> <i class="fa fa-pause"></i> netty
						</a>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<a class="btn btn-app" style="margin-top: 12px"
							onclick="ModbusTcpRun()"> <i class="fa fa-pause"></i> ModbusTcp
						</a>
					</div>

				</div>



				<!-- 整行块显示 -->
				<div class="row" style="margin-top: -40px">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="dashboard_graph">
							<div class="row x_title">
								<div class="col-md-6">
									<h3>
										陕西西电高压开关有限公司 <small>一层-气体 热分析实验室</small>
									</h3>
								</div>
								<div class="col-md-6"></div>
							</div>

							<div class="col-md-9 col-sm-9 col-xs-12"
								style="background-color: silver;">

								<div>
									<img src="/imgs/tfgz.png" style="width: 150px; height: 150px">
									<img src="/imgs/tfgm.png"
										style="width: 150px; height: 150px; margin-left: -5px">
									<img src="/imgs/tfgr.png"
										style="width: 150px; height: 150px; margin-left: -5px;">
									<img src="/imgs/hg.png"
										style="width: 40px; height: 20px; margin-top: -130px; margin-left: -58px;">
									<img src="/imgs/hg.png"
										style="width: 40px; height: 22px; margin-top: -130px; margin-left: -5px;">
									<img src="/imgs/hg.png"
										style="width: 40px; height: 22px; margin-top: -130px; margin-left: -5px;">
									<img src="/imgs/hg.png"
										style="width: 40px; height: 22px; margin-top: -130px; margin-left: -5px;">
									<img src="/imgs/sgz.png"
										style="width: 28px; height: 110px; margin-top: -38px; margin-left: -2px;">
									<img src="/imgs/pfj.png"
										style="width: 150px; height: 110px; margin-top: 35px; margin-left: -28px;">
									<img src="/imgs/fsxz.gif"
										style="width: 30px; height: 30px; margin-top: 110px; margin-left: -88px;">
								</div>
								<!-- </br> -->
								<div>
									<img src="/imgs/tfgz.png" style="width: 150px; height: 150px">
									<img src="/imgs/tfgm.png"
										style="width: 150px; height: 150px; margin-left: -5px">
									<img src="/imgs/tfgr.png"
										style="width: 150px; height: 150px; margin-left: -5px;">
									<img src="/imgs/hg.png"
										style="width: 40px; height: 20px; margin-top: -130px; margin-left: -58px;">
									<img src="/imgs/hg.png"
										style="width: 40px; height: 22px; margin-top: -130px; margin-left: -5px;">
									<img src="/imgs/hg.png"
										style="width: 40px; height: 22px; margin-top: -130px; margin-left: -5px;">
									<img src="/imgs/hg.png"
										style="width: 40px; height: 22px; margin-top: -130px; margin-left: -5px;">
									<img src="/imgs/sgz.png"
										style="width: 28px; height: 110px; margin-top: -38px; margin-left: -2px;">
									<img src="/imgs/pfj.png"
										style="width: 150px; height: 110px; margin-top: 35px; margin-left: -28px;">
									<img src="/imgs/fsxz.gif"
										style="width: 30px; height: 30px; margin-top: 110px; margin-left: -88px;">

									<a class="btn btn-primary btn-xs"
										style="margin-left: -483px; margin-top: 30px"> <i
										class="fa fa-recycle"></i> 通风厨良好
									</a> <a class="btn btn-primary btn-xs"
										style="margin-left: -260px; margin-top: 30px"> <i
										class="fa fa-recycle"></i> 通风厨良好
									</a> <a class="btn btn-danger btn-xs"
										style="margin-left: 220px; margin-top: 30px"> <i
										class="fa  fa-exclamation-circle"></i> 通风厨异常
									</a>

								</div>
							</div>

							<!-- 行模块内的有边栏 -->
							<div class="col-md-3 col-sm-3 col-xs-12 bg-white">
								<div class="x_title">
									<h2>主要用电设备:</h2>
									<div class="clearfix"></div>
								</div>

								<div class="col-md-12 col-sm-12 col-xs-6">

									<div>
										<p>排风机使用频率</p>
										<div class="">
											<div class="progress progress_sm" style="width: 80%;">
												<!-- <div class="progress-bar bg-green" role="progressbar"
													data-transitiongoal="80"></div> -->
											</div>
										</div>
										<p>新风机使用频率</p>
										<div class="">
											<div class="progress progress_sm" style="width: 90%;">
												<!-- <div class="progress-bar bg-green" role="progressbar"
													data-transitiongoal="80"></div> -->
											</div>
										</div>

										<div class="divider-dashed"></div>
										<span><font size="4px" style="color: red;"><b>电机电流:</b></font></span>
										<span style="margin-left: 100px"><font size="4px">10-A</font></span>
										<div class="ln_solid" style="margin-top: 5px"></div>

										<span><font size="4px" style="color: blue;"><b>电机频率:</b></font></span>
										<span style="margin-left: 100px"><font size="4px">45-Hz</font></span>
										<div class="ln_solid" style="margin-top: 5px"></div>

										<span><font size="4px" style="color: orange;"><b>输出功率:</b></font></span>
										<span style="margin-left: 100px"><font size="4px">1.1-Kw</font></span>
										<div class="ln_solid" style="margin-top: 5px"></div>

									</div>

								</div>

							</div>

							<div class="clearfix"></div>
						</div>
					</div>
				</div>

				</br>

				<!-- 显示块换行 -->
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel tile fixed_height_32">
							<div class="x_title">
								<h2>实验室总览:</h2>
								<ul class="nav navbar-right panel_toolbox">
									<li><a class="collapse-link"><i
											class="fa fa-chevron-up"></i></a></li>
									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown" role="button" aria-expanded="false"><i
											class="fa fa-wrench"></i></a>
										<ul class="dropdown-menu" role="menu">
											<li><a href="#">Settings 1</a></li>
											<li><a href="#">Settings 2</a></li>
										</ul></li>
									<li><a class="close-link"><i class="fa fa-close"></i></a>
									</li>
								</ul>
								<div class="clearfix"></div>
							</div>

							<div class="x_content">

								<h4>四层实验区</h4>
								<div>
									<img src="/imgs/pmt.png" style="height: 100%; width: 100%" />

									<div style="margin-left: 100px; margin-top: -420px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: green;" />
									</div>
									<div style="margin-left: 100px; margin-top: 0px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: red;" />
									</div>

									<div style="margin-left: 200px; margin-top: -400px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: red;" />
									</div>
									<div style="margin-left: 200px; margin-top: 0px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: green;" />
									</div>

									<div style="margin-left: 300px; margin-top: -400px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: green;" />
									</div>
									<div style="margin-left: 300px; margin-top: 0px">
										<img src="/imgs/null.png" onclick="click1()" id="lab2div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: red;" />
									</div>

									<div style="margin-left: 400px; margin-top: -400px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: red;" />
									</div>
									<div style="margin-left: 400px; margin-top: 0px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: green;" />
									</div>

									<div style="margin-left: 500px; margin-top: -400px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: green;" />
									</div>
									<div style="margin-left: 500px; margin-top: 0px">
										<img src="/imgs/null.png" onclick="click1()" id="lab2div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: red;" />
									</div>

									<div style="margin-left: 600px; margin-top: -400px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: red;" />
									</div>
									<div style="margin-left: 600px; margin-top: 0px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: green;" />
									</div>

									<div style="margin-left: 700px; margin-top: -400px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: green;" />
									</div>
									<div style="margin-left: 700px; margin-top: 0px">
										<img src="/imgs/null.png" onclick="click1()" id="lab2div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: red;" />
									</div>

									<div style="margin-left: 800px; margin-top: -400px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: red;" />
									</div>
									<div style="margin-left: 800px; margin-top: 0px">
										<img src="/imgs/null.png" onclick="click1()" id="lab1div"
											style="opacity: 0.4; width: 100px; height: 200px; background-color: green;" />
									</div>

								</div>

								<div class="ln_solid"></div>

							</div>
						</div>
					</div>
				</div>

				<!-- 新一行折叠面板 -->
				<div class="row">
					<div class="col-md-8 col-sm-8 col-xs-8">
						<div class="x_panel tile fixed_height_32">
							<div class="x_title">
								<h2>实验室历史数据:</h2>
								<ul class="nav navbar-right panel_toolbox">
									<li><a class="collapse-link"><i
											class="fa fa-chevron-up"></i></a></li>
									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown" role="button" aria-expanded="false"><i
											class="fa fa-wrench"></i></a>
										<ul class="dropdown-menu" role="menu">
											<li><a href="#">Settings 1</a></li>
											<li><a href="#">Settings 2</a></li>
										</ul></li>
									<li><a class="close-link"><i class="fa fa-close"></i></a>
									</li>
								</ul>
								<div class="clearfix"></div>

								<div class="x_content">
									<!-- 折线图 -->
									<div style="margin-top: 10px">
										<div class="chart" id="lineChart" style="width: 100%"></div>
									</div>
								</div>

							</div>
						</div>
					</div>

					<div class="col-md-4 col-sm-4 col-xs-4">
						<div class="x_panel tile fixed_height_32">
							<div class="x_title">
								<h2>实验室设定:</h2>
								<ul class="nav navbar-right panel_toolbox">
									<li><a class="collapse-link"> <i
											class="fa fa-chevron-up"></i>
									</a></li>
								</ul>
								<div class="clearfix"></div>
								<div class="x_content" style="margin-top: 5px">
									<div style="margin-top: 10px; margin-left: -20px; width: 100%">
										<div
											class="col-md-8 col-sm-8 col-xs-8 form-group has-feedback">
											<input type="text" class="form-control has-feedback-left"
												id="inputSuccess2" placeholder="0-30度"> <span
												class="fa   fa-leaf form-control-feedback left"
												aria-hidden="true"></span>

										</div>
										<h2 style="margin-left: 20px; margin-top: 7px">温度设定</h2>
									</div>
									<div class="divider-dashed"
										style="margin-top: 50px; width: 107%; margin-left: -10px"></div>

									<div style="margin-top: 10px; margin-left: -20px; width: 100%">
										<div
											class="col-md-8 col-sm-8 col-xs-8 form-group has-feedback">
											<input type="text" class="form-control has-feedback-left"
												id="inputSuccess2" placeholder="0-50%"> <span
												class="fa  fa-tint form-control-feedback left"
												aria-hidden="true"></span>

										</div>
										<h2 style="margin-left: 20px; margin-top: 7px">湿度设定</h2>
									</div>
									<div class="divider-dashed"
										style="margin-top: 50px; width: 107%; margin-left: -10px"></div>

									<div style="margin-top: 10px; margin-left: -20px; width: 100%">
										<div
											class="col-md-8 col-sm-8 col-xs-8 form-group has-feedback">
											<input type="text" class="form-control has-feedback-left"
												id="inputSuccess2" placeholder="20-100%"> <span
												class="fa   fa-lightbulb-o form-control-feedback left"
												aria-hidden="true"></span>

										</div>
										<h2 style="margin-left: 20px; margin-top: 7px">照度设定</h2>
									</div>
									<div class="divider-dashed"
										style="margin-top: 50px; width: 107%; margin-left: -10px"></div>

									<div style="margin-top: 10px; margin-left: -20px; width: 100%">
										<div
											class="col-md-8 col-sm-8 col-xs-8 form-group has-feedback">
											<input type="text" class="form-control has-feedback-left"
												id="inputSuccess2" placeholder="-20~+20Pa"> <span
												class="fa    fa-pied-piper-alt form-control-feedback left"
												aria-hidden="true"></span>

										</div>
										<h2 style="margin-left: 20px; margin-top: 7px">压力梯度</h2>
									</div>
									<div class="divider-dashed"
										style="margin-top: 50px; width: 107%; margin-left: -10px"></div>

								</div>
							</div>
						</div>

					</div>

					<div class="col-md-6 col-sm-6 col-xs-6">
						<div class="x_panel tile fixed_height_32">
							<div class="x_title">
								<h2>新风机设定:</h2>
								<ul class="nav navbar-right panel_toolbox">
									<li><a class="collapse-link"><i
											class="fa fa-chevron-up"></i></a></li>
									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown" role="button" aria-expanded="false"><i
											class="fa fa-wrench"></i></a>
										<ul class="dropdown-menu" role="menu">
											<li><a href="#">Settings 1</a></li>
											<li><a href="#">Settings 2</a></li>
										</ul></li>
									<li><a class="close-link"><i class="fa fa-close"></i></a>
									</li>
								</ul>
								<div class="clearfix"></div>
								<div class="x_content" style="margin-top: 5px">
									<div style="margin-top: 10px; margin-left: -20px; width: 100%">
										<div
											class="col-md-8 col-sm-8 col-xs-8 form-group has-feedback">
											<input type="text" class="form-control has-feedback-left"
												id="inputSuccess2" placeholder="0-30度"> <span
												class="fa   fa-leaf form-control-feedback left"
												aria-hidden="true"></span>

										</div>
										<h2 style="margin-left: 60px; margin-top: 7px">温度设定</h2>
									</div>
									<div class="divider-dashed"
										style="margin-top: 50px; width: 104%; margin-left: -10px"></div>

									<div style="margin-top: 10px; margin-left: -20px; width: 100%">
										<div
											class="col-md-8 col-sm-8 col-xs-8 form-group has-feedback">
											<input type="text" class="form-control has-feedback-left"
												id="inputSuccess2" placeholder="0-50%"> <span
												class="fa  fa-tint form-control-feedback left"
												aria-hidden="true"></span>

										</div>
										<h2 style="margin-left: 60px; margin-top: 7px">湿度设定</h2>
									</div>
									<div class="divider-dashed"
										style="margin-top: 50px; width: 104%; margin-left: -10px"></div>

									<div style="margin-top: 10px; margin-left: -20px; width: 100%">
										<div
											class="col-md-8 col-sm-8 col-xs-8 form-group has-feedback">
											<input type="text" class="form-control has-feedback-left"
												id="inputSuccess2" placeholder="-20~+20Pa"> <span
												class="fa    fa-pied-piper-alt form-control-feedback left"
												aria-hidden="true"></span>

										</div>
										<h2 style="margin-left: 60px; margin-top: 7px">静压设定</h2>
									</div>
									<div class="divider-dashed"
										style="margin-top: 50px; width: 104%; margin-left: -10px"></div>

									<div style="margin-top: 10px; margin-left: -20px; width: 100%">
										<div nowrap
											style="margin-top: 0px; margin-left: 20px; width: 100%">
											<h2 id="moterrunshow">风机运行</h2>
										</div>
										<h2 style="margin-left: 302px; margin-top: 7px"></h2>
										<input id="ms" type="checkbox" class="js-switch" />
									</div>
									<div class="divider-dashed"
										style="margin-top: 10px; width: 104%; margin-left: -10px"></div>

									<div style="margin-top: 10px; margin-left: -20px; width: 100%">
										<div nowrap
											style="margin-top: 0px; margin-left: 20px; width: 100%">
											<h2 id="netcontrolshow">云端控制</h2>
										</div>
										<h2 style="margin-left: 302px; margin-top: 7px"></h2>
										<input id="ms2" type="checkbox" class="js-switch" />
									</div>
									<div class="divider-dashed"
										style="margin-top: 10px; width: 104%; margin-left: -10px"></div>
								</div>
							</div>
						</div>

					</div>

					<!-- 事件设定块 -->
					<div class="col-md-6 col-sm-6 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>
									<i class=""></i> 定时运行设置: <small>新风设定</small>
								</h2>
								<ul class="nav navbar-right panel_toolbox">
									<li><a class=""><i class=""></i></a></li>
									<li><a class=""><i class=""></i></a></li>
									<li><a class=""><i class=""></i></a></li>
									<li><a class=""><i class=""></i></a></li>
									<li><a class="collapse-link"><i
											class="fa fa-chevron-up"></i></a></li>
								</ul>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">

								<div class="col-xs-9">
									<!-- Tab panes -->
									<div class="tab-content">
										<div class="tab-pane active" id="mon-r">
											<p class="lead" id="montc">周一自动运行</p>
											<div style="margin-top: -50px; margin-left: 280px">
												<input id="ms3" type="checkbox" class="js-switch" />
											</div>
											<div class="form-group" style="margin-top: 20px">
												<label style="margin-top: 6px"
													class="control-label col-md-8 col-sm-8 col-xs-8">
													上午定时启动时间 </label>
												<div class="col-md-4 col-sm-4 col-xs-4">
													<input type="text" class="form-control"
														data-inputmask="'mask': '99:99'"> <span
														class="fa fa-power-off form-control-feedback right"
														aria-hidden="true"></span>
												</div>
											</div>

											<div class="col-md-12 col-sm-12 col-xs-12">
												<div class="divider-dashed"
													style="margin-top: 5px; width: 104%; margin-left: -10px"></div>
											</div>

											<div class="form-group">
												<label style="margin-top: 6px"
													class="control-label col-md-8 col-sm-8 col-xs-8">
													上午定时关闭时间 </label>
												<div class="col-md-4 col-sm-4 col-xs-4">
													<input type="text" class="form-control"
														data-inputmask="'mask': '99:99'"> <span
														class="fa fa-square form-control-feedback right"
														aria-hidden="true"></span>
												</div>
											</div>

											<div class="col-md-12 col-sm-12 col-xs-12">
												<div class="divider-dashed"
													style="margin-top: 5px; width: 104%; margin-left: -10px"></div>
											</div>

											<div class="form-group">
												<label style="margin-top: 6px"
													class="control-label col-md-8 col-sm-8 col-xs-8">
													下午定时启动时间 </label>
												<div class="col-md-4 col-sm-4 col-xs-4">
													<input type="text" class="form-control"
														data-inputmask="'mask': '99:99'"> <span
														class="fa fa-power-off form-control-feedback right"
														aria-hidden="true"></span>
												</div>
											</div>

											<div class="col-md-12 col-sm-12 col-xs-12">
												<div class="divider-dashed"
													style="margin-top: 5px; width: 104%; margin-left: -10px"></div>
											</div>

											<div class="form-group">
												<label style="margin-top: 6px"
													class="control-label col-md-8 col-sm-8 col-xs-8">
													下午定时关闭时间 </label>
												<div class="col-md-4 col-sm-4 col-xs-4">
													<input type="text" class="form-control"
														data-inputmask="'mask': '99:99'"> <span
														class="fa  fa-square form-control-feedback right"
														aria-hidden="true"></span>
												</div>
											</div>

											<div class="col-md-12 col-sm-12 col-xs-12">
												<div class="divider-dashed"
													style="margin-top: 5px; width: 104%; margin-left: -10px"></div>
											</div>

										</div>
										<div class="tab-pane" id="tue-r">
											<p class="lead">周二 列表</p>
											<div class="form-group">
												<label style="margin-top: 6px"
													class="control-label col-md-8 col-sm-8 col-xs-8">
													上午定时启动时间 </label>
												<div class="col-md-4 col-sm-4 col-xs-4">
													<input type="text" class="form-control"
														data-inputmask="'mask': '99:99'"> <span
														class="fa fa-power-off form-control-feedback right"
														aria-hidden="true"></span>
												</div>
											</div>

											<div class="col-md-12 col-sm-12 col-xs-12">
												<div class="divider-dashed"
													style="margin-top: 5px; width: 104%; margin-left: -10px"></div>
											</div>
										</div>
										<div class="tab-pane" id="wed-r">
											<p class="lead">周三 列表</p>
										</div>
										<div class="tab-pane" id="thu-r">
											<p class="lead">周四 列表</p>
										</div>
										<div class="tab-pane" id="fri-r">
											<p class="lead">周五 列表</p>
										</div>
										<div class="tab-pane" id="sat-r">
											<p class="lead">周六 列表</p>
										</div>
										<div class="tab-pane" id="sun-r">
											<p class="lead">周日 列表</p>
										</div>
									</div>
								</div>

								<div class="col-xs-3">
									<!-- required for floating -->
									<!-- Nav tabs -->
									<ul class="nav nav-tabs tabs-right">
										<li class="active"><a href="#mon-r" data-toggle="tab">&nbsp&nbsp星期一</a>
										</li>
										<li><a href="#tue-r" data-toggle="tab">&nbsp&nbsp星期二</a>
										</li>
										<li><a href="#wed-r" data-toggle="tab">&nbsp&nbsp星期三</a>
										</li>
										<li><a href="#thu-r" data-toggle="tab">&nbsp&nbsp星期四</a>
										</li>
										<li><a href="#fri-r" data-toggle="tab">&nbsp&nbsp星期五</a>
										</li>
										<li><a href="#sat-r" data-toggle="tab">&nbsp&nbsp星期六</a>
										</li>
										<li><a href="#sun-r" data-toggle="tab">&nbsp&nbsp星期日</a>
										</li>
									</ul>
								</div>
							</div>

						</div>
					</div>
					<div class="clearfix"></div>

					<!-- 事件设定块 -->
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>
									<i class=""></i> 视频监控: <small>ICP实验室</small>
								</h2>
								<ul class="nav navbar-right panel_toolbox">
									<li><a class=""><i class=""></i></a></li>
									<li><a class=""><i class=""></i></a></li>
									<li><a class=""><i class=""></i></a></li>
									<li><a class=""><i class=""></i></a></li>
									<li><a class="collapse-link"><i
											class="fa fa-chevron-up"></i></a></li>
								</ul>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<!-- 嵌入一个网页 -->
								<!-- <iframe src="http://shuidi.huajiao.com/pc/" frameBorder="0"
									width="100%" scrolling="yes" height="500"></iframe> -->

								<!-- 视频直播 -->
								<video id="myPlayer" poster="" controls playsInline
									webkit-playsinline autoplay>
									<source
										src="rtmp://rtmp.open.ys7.com/openlive/f01018a141094b7fa138b9d0b856507b"
										type="" />
									<source
										src="http://hls.open.ys7.com/openlive/f01018a141094b7fa138b9d0b856507b.m3u8"
										type="application/x-mpegURL" />
									<!-- https://forge-rcdb.autodesk.io/configurator?id=58c7ae474c6d400bfa5aaf37 -->
								</video>

							</div>
						</div>
					</div>

					<!-- 事件设定块 -->
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>
									<i class=""></i> 3D展示: <small>xxx实验室</small>
								</h2>
								<ul class="nav navbar-right panel_toolbox">
									<li><a class=""><i class=""></i></a></li>
									<li><a class=""><i class=""></i></a></li>
									<li><a class=""><i class=""></i></a></li>
									<li><a class=""><i class=""></i></a></li>
									<li><a class="collapse-link"><i
											class="fa fa-chevron-up"></i></a></li>
								</ul>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<!-- 嵌入一个网页 -->
								<!-- <iframe src="//forge-rcdb.autodesk.io/database?id=583ec7efebfb320e3cef26a5" frameBorder="1"
									width="100%" scrolling="yes" height="500"></iframe> -->
							</div>
						</div>
					</div>

				</div>

				<!-- /页面主体内容书写 -->
				<script src="/js/mui.min.js"></script>
				<!-- jQuery -->
				<script src="tempweb/vendors/jquery/dist/jquery.min.js"></script>
				<!-- Bootstrap -->
				<script src="tempweb/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
				<!-- FastClick -->
				<script src="tempweb/vendors/fastclick/lib/fastclick.js"></script>
				<!-- NProgress -->
				<script src="tempweb/vendors/nprogress/nprogress.js"></script>
				<!-- jQuery custom content scroller -->
				<script
					src="tempweb/vendors/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
				<!-- Custom Theme Scripts -->
				<script src="tempweb/build/js/custom.min.js"></script>
				<script src="/libs/echarts-all.js"></script>
				<script src="/js/ezuikit.js"></script>
				<!-- Switchery -->
				<script src="/tempweb/vendors/switchery/dist/switchery.min.js"></script>
				<script
					src="/tempweb/vendors/jquery.inputmask/dist/min/jquery.inputmask.bundle.min.js"></script>

				<script type="text/javascript">
					/* 启动ModbusTcp功能 */
					function ModbusTcpRun() {
						var data = '{}';
						$.ajax({
							url : "http://192.168.27.1:8080/modbusRunServer.do",
							type : "post",
							data : data,
							contentType : "application/json;charset=UTF-8",
							dataType : "json",
							success : function() {
							}
						});
					}
					/* 启动netty功能 */
					function nettyrun() {
						var data = '{}';
						$.ajax({
							url : "http://192.168.27.1:8080/nettyServer.do",
							type : "post",
							data : data,
							contentType : "application/json;charset=UTF-8",
							dataType : "json",
							success : function() {
							}
						});
					}

					/* ios开关的转台显示代码 */
					var netcontrolshowCheckbox = document.querySelector('#ms2');
					netcontrolshowCheckbox.onchange = function() {
						if (netcontrolshowCheckbox.checked) {
							$("#netcontrolshow").html("云端控制")
						} else {
							$("#netcontrolshow").html("现场控制")
						}
					};

					var montc = document.querySelector('#ms');
					montc.onchange = function() {
						if (montc.checked) {
							$("#moterrunshow").html("风机运行")
						} else {
							$("#moterrunshow").html("风机停止")
						}
					};

					var changeCheckbox = document.querySelector('#ms3');
					changeCheckbox.onchange = function() {
						if (changeCheckbox.checked) {
							$("#montc").html("周一自动运行")
						} else {
							$("#montc").html("周一手动运行")
						}
					};

					$(function() {
						$("#lab1div").click(function() {
							alert("冰箱存放室");
						});
						$("#lab2div").click(function() {
							alert("发酵室");
						});
					});

					//模拟plc存入一条数据
					function insertdata(d) {

						var data = '{"stime" : ' + d + '}';
						$.ajax({
							/* ajax访问的url */
							url : "http://192.168.27.1:8080/insertdata.do",
							/* ajax请求方式 */
							type : "post",
							/* ajax请求参数 */
							data : data,
							/* 这个代表上传参数为json格式   */
							contentType : "application/json;charset=UTF-8",
							/* ajax返回值类型 */
							dataType : "json",
							/* ajax成功的回调函数 自定义的业务逻辑*/
							success : function(data) {
							}
						});
						//供页面显示的方法给echar用
						showdata();
					}

					//供页面显示的方法给echar用
					function showdata() {
						$.ajax({
							url : "http://192.168.27.1:8080/showdata.do",
							type : "post",
							dataType : "text",
							success : function(d) {
								xy = d.split("+");
								//将传过来的字符串切割为数组
								y3 = xy[0].split(",");
								xz = xy[1].split(",");
								//刷新曲线图
								lineChart = echarts.init(byId('lineChart'));
								lineChart.setOption(getOption('line'));
							}
						});
					}
					//预定义一个js数组用于存放实时传过来的数据
					var xy = [];
					var y3 = [];
					var xz = [ 1, 2 ];

					//折线图
					var getOption = function(chartType) {
						var chartOption = chartType == 'pie' ? {
							calculable : false,
							series : [ {} ]
						} : {
							legend : {
								data : [ '温度', '湿度', '压力' ]
							},
							grid : {
								x : 35,
								x2 : 10,
								y : 30,
								y2 : 25
							},
							tooltip : {
								trigger : 'axis'
							},
							toolbox : {
								show : false,
								feature : {
									mark : {
										show : true
									},
									dataView : {
										show : true,
										readOnly : false
									},
									magicType : {
										show : true,
										type : [ 'line', 'bar' ]
									},
									restore : {
										show : true
									},
									saveAsImage : {
										show : true
									}
								}
							},
							calculable : false,
							animation : false,
							xAxis : [ {
								type : 'category',
								data : xz
							} ],
							yAxis : [ {
								type : 'value',
								max : 120,
								min : 10,
								splitArea : {
									show : true
								}
							} ],
							series : [ {
								name : '温度',
								type : chartType,
								data : y3
							}, {
								name : '湿度',
								type : chartType,
								data : y3
							}, {
								name : '压力',
								type : chartType,
								data : y3
							} ]
						};
						return chartOption;
					};
					var byId = function(id) {
						return document.getElementById(id);
					};

					var lineChart = echarts.init(byId('lineChart'));
					lineChart.setOption(getOption('line'));

					//定时存储一条数据
					//window.onload(window.setInterval("insertdata(1)", 1000));

					byId("echarts").addEventListener('tap', function() {
						var url = this.getAttribute('data-url');
						plus.runtime.openURL(url);
					}, false);
				</script>

				<script>
					var player = new EZUIPlayer('myPlayer');
					player.on('error', function() {
						console.log('error');
					});
					player.on('play', function() {
						console.log('play');
					});
					player.on('pause', function() {
						console.log('pause');
					});
				</script>
</body>
</html>