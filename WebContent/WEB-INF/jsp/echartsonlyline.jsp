<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>ECahrt 示例</title>
		<!--标准mui.css-->
		<link rel="stylesheet" href="/css/mui.min.css">
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
		</style>
		<script src="/js/mui.min.js"></script>
	</head>

	<body>

		<div class="mui-content">
			<div class="mui-content-padded">
				<h5>线图示例</h5>
				<div class="chart" id="lineChart"></div>
			</div>
		</div>
		
		<script src="/libs/echarts-all.js"></script>
		<script>
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
						data: ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14']
					}],
					yAxis: [{
						type: 'value',
						max: 550,
						min: 10,
						splitArea: {
							show: true
						}
					}],
					series: [{
						name: '温度',
						type: chartType,
						data: [2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3, 16.3, 18.3]
					}, {
						name: '湿度',
						type: chartType,
						data: [2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 282.2, 48.7, 18.8, 6.0, 2.3, 12.3, 15.3]
					}, {
						name: '压力',
						type: chartType,
						data: [2.6, 5.9, 9.0, 26.4, 29.7, 71.7, 176.6, 183.2, 49.7, 19.8, 6.0, 2.3, 22.3, 28.3]
					}]
				};
				return chartOption;
			};
			var byId = function(id) {
				return document.getElementById(id);
			};
			
			var lineChart = echarts.init(byId('lineChart'));
			lineChart.setOption(getOption('line'));
			byId("echarts").addEventListener('tap',function(){
				var url = this.getAttribute('data-url');
				plus.runtime.openURL(url);
			},false);
		</script>
	</body>

</html>