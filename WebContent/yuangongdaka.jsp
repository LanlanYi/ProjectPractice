<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
});

//存储一个打卡信息
function saveOneInfo(){
	$.ajax({
		url:"saveOneKaoQinInfoAction",
		method:"post",
		dataType:"json",
		success:function(){
			alert("打卡成功");
		}
	});
}
</script>
</head>
<body>
daka
<form action="saveOneKaoQinInfoAction" method="post">
	<input type="submit" name="daka" id="dakaId" value="打卡" />
</form>
<a href='index.jsp' id='delete' onclick='saveOneInfo()'>打卡2不好用</a><!-- 不能将时间存储到另一个表MonthKaoQin表，初步怀疑异步请求的问题 不能跳转到另一个方法 -->
-----------------------





</body>
</html>