<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	getAllMonthKaoQin();
});
function getAllMonthKaoQin(){
	$.ajax({
		url:"getAllMonthKaoQinAction",
		//async : false,// 同步, 等待执行完
		method:"post",
		dataType:"json",
		cache : false,//设置异步
		success:function(monthKaoQins){

			//alert(monthKaoQins);

			alert(monthKaoQins);
			$("#show").empty();	
			for(var i=0;i<monthKaoQins.length;i++){
				var h=monthKaoQins[i];
				var tr="<tr><td>"+h.monthShangBanTime+"</td><td>"+h.monthXiaBanTime+"</td></tr>";
				$("#show").append(tr);	
			}
		} 
	});
}
//存储一个打卡信息
/* function saveOneInfo(){
	$.ajax({
		url:"saveOneKaoQinInfoAction",
		method:"post",
		dataType:"json",
		success:function(){
			alert("打卡成功");
		}
	});
} */
</script>
<title>Insert title here</title>
</head>
<body>
putongyuangong
	<form action="getAllMonthKaoQinAction" method="post">
	
		<table border="1px" width=300px align="center">
			<tr>
				<td>上班打卡时间</td>
				<td>下班打卡时间</td>
			</tr>
			<!-- <tr>
				<td><input type="button" id="chaKanKaoQinId" name="chaKanKaoQin" value="查看本月考勤"/></td>
			</tr> -->
			<tbody id="show"></tbody>
		</table>
		
	</form>
	---------------
	<a href="index.jsp">返回</a>
<!-- <form action="saveOneKaoQinInfoAction" method="post">
	<input type="submit" name="daka" id="dakaId" value="打卡" />
</form>
<a href='#' id='delete' onclick='saveOneInfo()'>打卡2</a>
----------------------- -->
</body>
</html>