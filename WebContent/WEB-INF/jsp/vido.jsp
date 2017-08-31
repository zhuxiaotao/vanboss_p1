<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<!--App自定义的css-->
<style>
video {
	max-width: 401px;
	width: 400px;
}
</style>
</head>
<body>
	<!-- 视频直播 -->
	<video id="myPlayer" poster="" controls playsInline webkit-playsinline
		autoplay> <source
		src="rtmp://rtmp.open.ys7.com/openlive/f01018a141094b7fa138b9d0b856507b"
		type="" /> <source
		src="http://hls.open.ys7.com/openlive/f01018a141094b7fa138b9d0b856507b.m3u8"
		type="application/x-mpegURL" /> </video>
</body>
<script src="/js/ezuikit.js"></script>
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
</html>