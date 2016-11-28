<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	getAllTodayKaoQin();
});
function getAllTodayKaoQin(){
	$.ajax({
		url:"getAllTodayKaoQinAction",
		//async : false,// 同步, 等待执行完
		method:"post",
		dataType:"json",
		cache : false,//设置异步
		success:function(todayKaoQins){
			//alert(todayKaoQins);
			alert(todayKaoQins);
			$("#show").empty();	
			for(var i=0;i<todayKaoQins.length;i++){
				var h=todayKaoQins[i];
				var tr="<tr><td>"+h.daKaTime+"</td></tr>";
				$("#show").append(tr);	
			}
		} 
	});
}

</script>
<title>Insert title here</title>
</head>
<body>
showtodaydakainfo
	<form action="getAllTodayKaoQinAction" method="post">
	
		<table border="1px" width=300px align="center">
			<tr>
				<td>打卡时间</td>
			</tr>
			
			<tbody id="show"></tbody>
		</table>
		
	</form>
	---------------
	<a href="index.jsp">返回</a>

</body>
</html>