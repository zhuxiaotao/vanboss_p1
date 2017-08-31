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
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>&nbsp&nbsp山东沃柏斯-VANBOSS</title>

<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet">

<!-- DataTables CSS -->
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet"
	type="text/css">

<!--标准mui.css-->
<link rel="stylesheet" href="/css/mui.min.css">
<!--App自定义的css-->
<link rel="stylesheet" type="text/css" href="/css/app.css" />
<link href="/vendors/pnotify/dist/pnotify.css" rel="stylesheet">
<link href="/vendors/pnotify/dist/pnotify.buttons.css" rel="stylesheet">
<link href="/vendors/pnotify/dist/pnotify.nonblock.css" rel="stylesheet">
<script src="/vendors/pnotify/dist/pnotify.js"></script>
<script src="/vendors/pnotify/dist/pnotify.buttons.js"></script>
<script src="/vendors/pnotify/dist/pnotify.nonblock.js"></script>
			<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
			<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
			<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->


			<!--标准mui.css-->
<link rel="stylesheet" href="/css/mui.min.css">
<!--App自定义的css-->
<style>
.chart {
	height: 300px;
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
</style>
</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
		<div class="navbar-header">
			<img src="/imgs/bobosilog.png"
				style="height: 40px; width: 40px; margin-top: 5px" /> <a
				class="navbar-brand">沃柏斯智慧实验室系统 V0.1</a>
		</div>
		<!-- /.navbar-header -->

		<ul class="nav navbar-top-links navbar-right">
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-bell fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-alerts">
					<li><a href="#">
							<div>
								<i class="glyphicon glyphicon-leaf"></i> 新风报警 <span
									style="margin-left: 80%" class="label label-warning">
									99分钟前 </span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-envelope fa-fw"></i> 新消息<span
									style="margin-left: 80%" class="label label-warning">
									9分钟前 </span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-tasks fa-fw"></i> 新任务 <span
									class="pull-right text-muted small">4分钟之前</span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-upload fa-fw"></i> 服务器重启 <span
									class="pull-right text-muted small">4分钟之前</span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a class="text-center" href="#"> <strong>查看所有提醒</strong>
							<i class="fa fa-angle-right"></i>
					</a></li>
				</ul> <!-- /.dropdown-alerts --></li>
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-user">
					<li><a href="#"><i class="fa fa-user fa-fw"></i> 用户设置</a></li>
					<li><a href="#"><i class="fa fa-gear fa-fw"></i> 系统设置</a></li>
					<li class="divider"></li>
					<li><a href="/logOut.do"><i class="fa fa-sign-out fa-fw"></i>
							退出登录</a></li>
				</ul> <!-- /.dropdown-user --></li>
			<!-- /.dropdown -->
		</ul>
		<!-- /.navbar-top-links -->

		<div class="navbar-default sidebar" role="navigation">
			<div class="sidebar-nav navbar-collapse">
				<ul class="nav" id="side-menu">
					<li class="sidebar-search">
						<div class="input-group custom-search-form">
							<h3>&nbsp&nbsp&nbsp&nbsp&nbsp
								欢迎:&nbsp&nbsp&nbsp${user.username}</h3>
						</div> <!-- /input-group -->
					</li>
					<li><a href="customer.action"> <i
							class="glyphicon glyphicon-leaf"></i> 通风设备
					</a></li>
					<li><a href="salevisit.action"><i
							class="glyphicon glyphicon-signal"></i> 历史记录</a></li>
					<li><a href="salevisit.action"><i
							class="glyphicon glyphicon-warning-sign"></i> 报警记录</a></li>
					<li><a href="salevisit.action"><i
							class="glyphicon glyphicon-filter"></i> 共享实验室</a></li>
					<li><a href="salevisit.action"><i
							class="glyphicon glyphicon-time"></i> 定时服务</a></li>
					<li><a href="salevisit.action"><i
							class="glyphicon glyphicon-facetime-video"></i> 视频监控</a></li>
					<li><a href="salevisit.action"><i
							class="glyphicon glyphicon-lock"></i> 门禁管理</a></li>
					<li><a href="salevisit.action"><i
							class="glyphicon glyphicon-lamp"></i> 智能照明</a></li>
				</ul>
			</div>
			<!-- /.sidebar-collapse -->
		</div>
		<!-- /.navbar-static-side --> </nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">设备管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline"
						action="${pageContext.request.contextPath }/customer/list.action"
						method="get">
						<div class="form-group">
							<label for="customerName">设备名称</label> <input type="text"
								class="form-control" id="customerName" value="${custName }"
								name="custName">
						</div>
						<div class="form-group">
							<label for="customerFrom">设备编号</label> <select
								class="form-control" id="customerFrom" placeholder="客户来源"
								name="custSource">
								<option value="">--请选择--</option>
								<c:forEach items="${fromType}" var="item">
									<option value="${item.dict_id}"
										<c:if test="${item.dict_id == custSource}"> selected</c:if>>${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label for="custIndustry">服务区域</label> <select
								class="form-control" id="custIndustry" name="custIndustry">
								<option value="">--请选择--</option>
								<c:forEach items="${industryType}" var="item">
									<option value="${item.dict_id}"
										<c:if test="${item.dict_id == custIndustry}"> selected</c:if>>${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label for="custLevel">运行时间</label> <select class="form-control"
								id="custLevel" name="custLevel">
								<option value="">--请选择--</option>
								<c:forEach items="${levelType}" var="item">
									<option value="${item.dict_id}"
										<c:if test="${item.dict_id == custLevel}"> selected</c:if>>${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
						<button type="submit" class="btn btn-primary">查询</button>
					</form>
					<br />
					<button type="button" class="btn btn-primary"
						onclick="insertdata(121)" style="margin-left: 5%">记录数据</button>
					<button type="button" class="btn btn-primary" onclick="deldata()"
						style="margin-left: 10%">删除数据</button>
					<button type="button" class="btn btn-primary"
						onclick="delalldata()" style="margin-left: 5%">批量删除</button>
					<button type="button" class="btn btn-info" onclick="threadrun()"
						style="margin-left: 5%">启动数据采集引擎</button>
					<button type="button" class="btn btn-info" id="rsb"
						onclick="threadstop()" style="margin-left: 5%">暂停数据采集</button>
				</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-body">
					<h2>${user.username}</h2>
					<div>
						<!-- Nav tabs -->
						<ul class="nav nav-tabs" role="tablist">
							<li role="presentation"><a href="#home" aria-controls="home"
								role="tab" data-toggle="tab" id="qr">预览视图</a></li>
							<li role="presentation"><a href="#profile"
								aria-controls="profile" role="tab" data-toggle="tab">报警信息</a></li>
							<li role="presentation" active="true"><a href="#messages"
								aria-controls="messages" role="tab" data-toggle="tab">历史记录</a></li>
							<li role="presentation"><a href="#settings"
								aria-controls="settings" role="tab" data-toggle="tab">运行设置</a></li>
						</ul>

						<!-- Tab panes -->
						<div class="tab-content">
							<div role="tabpanel" class="tab-pane" id="home">
								<img id="qrlocation" src="" />
							</div>
							<div role="tabpanel" class="tab-pane" id="profile">
								...</b> ...</b> ...</b> ...</b> ...</b>
							</div>
							<div role="tabpanel" class="tab-pane active" id="messages">
								<div class="panel-group" id="accordion" role="tablist"
									aria-multiselectable="true">
									<div class="panel panel-primary">
										<div class="panel-heading" role="tab" id="headingOne">
											<h4 class="panel-title">
												<a role="button" data-toggle="collapse"
													data-parent="#accordion" href="#collapseOne"
													aria-expanded="true" aria-controls="collapseOne">
													<blockquote>
														<strong>新 风 机 组 1#</strong>
													</blockquote>
												</a>
											</h4>
										</div>
										<div id="collapseOne" class="panel-collapse collapse in"
											role="tabpanel" aria-labelledby="headingOne">
											<div class="panel-body">
												<!-- 折线图展示区域 -->
												<h5 id="ti">线图示例</h5>
												<div class="chart" id="lineChart"></div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div role="tabpanel" class="tab-pane" id="settings">...</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">客户信息列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>ID</th>
									<th>设备名称</th>
									<th>运行时间</th>
									<th>服务区域</th>
									<th>故障报警</th>
									<th>服务人员</th>
									<th>手动操作</th>
									<th>自动操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${page.rows}" var="row">
									<tr>
										<td>${row.cust_id}</td>
										<td>${row.cust_name}</td>
										<td>${row.cust_source}</td>
										<td>${row.cust_industry}</td>
										<td>${row.cust_level}</td>
										<td>${row.cust_phone}</td>
										<td>${row.cust_mobile}</td>
										<td><a href="#" class="btn btn-primary btn-xs"
											data-toggle="modal" data-target="#customerEditDialog"
											onclick="editCustomer(${row.cust_id})">修改</a> <a href="#"
											class="btn btn-danger btn-xs"
											onclick="deleteCustomer(${row.cust_id})">删除</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<%-- <itcast:page url="${pageContext.request.contextPath }/customer/list.action" /> --%>
						</div>
						<!-- 折线图展示区域 -->

						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>

			<div class="panel panel-default">
				<div class="panel-body">
					<h2>测试一行</h2>
					<div class="alert alert-block">
						<button type="button" class="close" data-dismiss="alert">&times;</button>
						<h4>我的警告!</h4>
						警告警告警告</br> 警告警告警告</br> 警告警告警告</br> 警告警告警告</br>
					</div>

					<div class="row">
						<div class="col-lg-6">
							<div class="input-group">
								<div class="input-group-btn">
									<button type="button" class="btn btn-default dropdown-toggle"
										data-toggle="dropdown" aria-haspopup="false"
										aria-expanded="false">
										新风机 <span class="caret"></span>
									</button>
									</ul>
								</div>
								<!-- /btn-group -->
								<input type="text" class="form-control" aria-label="..."
									style="width: 250px">
							</div>
							<!-- /input-group -->
						</div>
						<!-- /.col-lg-6 -->
					</div>
					<!-- /.row -->
					<div class="alert alert-success" role="alert">
						呵呵...</br> 呵呵...</br>
					</div>

					<div class="alert alert-warning alert-dismissible" role="alert">
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<strong>么么哒!</strong> 呵呵风机正常运转呦！
					</div>

					<ul class="list-group">
						<li class="list-group-item"><span class="badge">14</span>Cras
							justo odio</li>
						<li class="list-group-item">Dapibus ac facilisis in</li>
						<li class="list-group-item">Morbi leo risus</li>
						<li class="list-group-item">Porta ac consectetur ac</li>
						<li class="list-group-item">Vestibulum at eros</li>
					</ul>

					<div class="list-group">
						<a href="#" class="list-group-item active"> <span
							class="badge">14Cras justo odio </a> <a href="#"
							class="list-group-item">Dapibus ac facilisis in</a> <a href="#"
							class="list-group-item">Morbi leo risus</a> <a href="#"
							class="list-group-item">Porta ac consectetur ac</a> <a href="#"
							class="list-group-item">Vestibulum at eros</a>
					</div>

					<!-- Button trigger modal -->
					<button type="button" class="btn btn-info btn-lg"
						data-toggle="modal" data-target="#myModal">Launch demo
						modal</button>

					<!-- Modal -->
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title" id="myModalLabel">Modal title</h4>
								</div>
								<div class="modal-body"></div>
								<div>
									<img src="/imgs/20150811092321893.gif" style="height: 200px" />
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="button" class="btn btn-primary">Save
										changes</button>
								</div>
							</div>
						</div>
					</div>

					<div class="media">
						<div class="media-left">
							<a> <img class="media-object" src="/imgs/t19.png"
								width="64px" height="64px"></a>
						</div>
						<div class="media-body">
							<div class="alert alert-success" role="alert">
								<h4 class="media-heading">粉红熊猫</h4>
								驴说话了，呵呵！ <img src="/imgs/t1.png"
									style="height: 32px; width: 32px" />
							</div>
						</div>
					</div>

					<div class="media">
						<div class="media-body text-right">
							<div class="alert alert-success" role="alert">
								<h4 class="media-heading text-right">龌龊狸</h4>
								又说话了，呵呵！
							</div>
						</div>
						<div class="media-right">
							<a> <img class="media-object" src="/imgs/t10.png"
								width="64px" height="64px"></a>
						</div>
					</div>


					<span id="sp">关闭</span> //switch开关模块的html代码
					<div class="mui-switch mui-active" id="sw1">
						<div class="mui-switch-handle"></div>
					</div>

					<div class="x_content">
						<button class="btn btn-default source"
							onclick="new PNotify({
                                  title: 'New Thing',
                                  text: 'Just to let you know, something happened.',
                                  type: 'info',
                                  styling: 'bootstrap3'
                              });">
                              Info
                              </button>
					</div>

				</div>
			</div>
		</div>
		<!-- /#page-wrapper -->
		<nav>
		<ul class="pager">
			<li><a href="#">Previous</a></li>
			<li><a href="#">Next</a></li>
		</ul>
		</nav>

	</div>

	<!-- jQuery -->
	<script src="/js/jquery.min.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>
	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>
	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
	<script src="/js/mui.min.js"></script>
	<script src="/libs/echarts-all.js"></script>
	<script type="text/javascript">
	
	//switch模块
	$(function(){
		mui.init({
			swipeBack:true //启用右滑关闭功能
		});
		
		$("#sw1").each(function() {
			//toggle 事件监听
			this.addEventListener('toggle', function(event) {
				//event.detail.isActive 可直接获取当前状态
				$("#sp").html(event.detail.isActive?"打开":"关闭");
			});
		});  
		
		$("#qr").click(function() {
				$.ajax({
					url : "http://192.168.27.1:8080/QR_Code.do",
					type : "post",
					contentType : "application/json;charset=UTF-8",
					dataType : "text",
					success : function(d){
						$("#qrlocation").attr({src:d}); 
					}
				});
		})
		$("#qrlocation").click(function() {
				$.ajax({
					url : "http://192.168.27.1:8080/QR_Code.do",
					type : "post",
					contentType : "application/json;charset=UTF-8",
					dataType : "text",
					success : function(d){
						$("#qrlocation").attr({src:d}); 
					}
				});
		})
		
	})
	
		function editCustomer(id) {
			$.ajax({
				type:"get",
				url:"<%=basePath%>customer/edit.action",
				data:{"id":id},
				success:function(data) {
					$("#edit_cust_id").val(data.cust_id);
					$("#edit_customerName").val(data.cust_name);
					$("#edit_customerFrom").val(data.cust_source)
					$("#edit_custIndustry").val(data.cust_industry)
					$("#edit_custLevel").val(data.cust_level)
					$("#edit_linkMan").val(data.cust_linkman);
					$("#edit_phone").val(data.cust_phone);
					$("#edit_mobile").val(data.cust_mobile);
					$("#edit_zipcode").val(data.cust_zipcode);
					$("#edit_address").val(data.cust_address);
					
				}
			});
		}
		function updateCustomer() {
			$.post("<%=basePath%>customer/update.action",$("#edit_customer_form").serialize(),function(data){
				alert("客户信息更新成功！");
				window.location.reload();
			});
		}
		
		function deleteCustomer(id) {
			if(confirm('确实要删除该客户吗?')) {
				$.post("<%=basePath%>customer/delete.action",{"id":id},function(data){
					alert("客户删除更新成功！");
					window.location.reload();
				});
			}
		}
		
		//模拟plc存入一条数据
		function insertdata(d){
			var data = '{"stime" : '+d+'}';
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
				success : function(data){
				}
			});
			showdata();
		}
		
		function deldata(){
			var d=$("#customerName").val();
			var data = '{"stime" : '+d+'}';
			$.ajax({
				url : "http://192.168.27.1:8080/deldata.do",
				type : "post",
				data : data,
				contentType : "application/json;charset=UTF-8",
				dataType : "json",
				success : function(){
				}
			});
		}
		
		function delalldata(){
			var d=$("#customerName").val();
			var data = '{"stime" : '+d+'}';
			$.ajax({
				url : "http://192.168.27.1:8080/delalldata.do",
				type : "post",
				data : data,
				contentType : "application/json;charset=UTF-8",
				dataType : "json",
				success : function(){
				}
			});
		}
		
		//
		function threadrun(){
			$.ajax({
				url : "http://192.168.27.1:8080/threadrun.do",
				type : "post",
				contentType : "application/json;charset=UTF-8",
				dataType : "json",
				success : function(){
				}
			});
		}
		
		function threadstop(){
			$.ajax({
				url : "http://192.168.1.123:8080/threadstop.do",
				type : "post",
				contentType : "application/json;charset=UTF-8",
				dataType : "text",
				success : function(data){
					if(data=="true"){
						$("#rsb").html("暂停数据采集");
					}else{
						$("#rsb").html("恢复数据采集");
					} 
				}
			});
		}
		
		function showdata() {
			$.ajax({
				url : "http://192.168.1.123:8080/showdata.do",
				type : "post",
				dataType : "text",
				success : function(d){
					xy=d.split("+");
					//将传过来的字符串切割为数组
					y3=xy[0].split(",");
					xz=xy[1].split(",");
					//刷新曲线图
					lineChart = echarts.init(byId('lineChart'));
					lineChart.setOption(getOption('line'));
				}
			}); 
			
		}
		//预定义一个js数组用于存放实时传过来的数据
		var xy=[] ;
		var y3=[] ;
		var xz=[1,2] ;
		
		//折线图
				var getOption = function(chartType) {
				var chartOption = chartType == 'pie' ? {
					calculable: false,
					series: [{
					}]
				} : {
					legend: {
						data: ['温度', '湿度', '压力']
					},
					grid: {
						x: 35,
						x2: 10,
						y: 30,
						y2: 25
					},
					tooltip : {
						 trigger: 'axis'
					},
					toolbox: {
						show: false,
						feature: {
							mark: {
								show: true
							},
							dataView: {
								show: true,
								readOnly: false
							},
							magicType: {
								show: true,
								type: ['line', 'bar']
							},
							restore: {
								show: true
							},
							saveAsImage: {
								show: true
							}
						}
					},
					calculable: false,animation: false,
					xAxis: [{
						type: 'category',
						data: xz
					}],
					yAxis: [{
						type: 'value',
						max: 120,
						min: 10,
						splitArea: {
							show: true
						}
					}],
					series: [{
						name: '温度',
						type: chartType,
						data: y3
					}, {
						name: '湿度',
						type: chartType,
						data: y3
					}, {
						name: '压力',
						type: chartType,
						data: y3
					}]
				};
				return chartOption;
			};
			var byId = function(id) {
				return document.getElementById(id);
			};
			
			var lineChart = echarts.init(byId('lineChart'));
			lineChart.setOption(getOption('line'));
			
			//定时存储一条数据
			window.onload(window.setInterval("insertdata(1)",1000));
			
			byId("echarts").addEventListener('tap',function(){
				var url = this.getAttribute('data-url');
				plus.runtime.openURL(url);
			},false); 
			
	</script>

</body>

</html>
