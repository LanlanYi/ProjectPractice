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
		//async : false,// ͬ��, �ȴ�ִ����
		method:"post",
		dataType:"json",
		cache : false,//�����첽
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
//�洢һ������Ϣ
/* function saveOneInfo(){
	$.ajax({
		url:"saveOneKaoQinInfoAction",
		method:"post",
		dataType:"json",
		success:function(){
			alert("�򿨳ɹ�");
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
				<td>�ϰ��ʱ��</td>
				<td>�°��ʱ��</td>
			</tr>
			<!-- <tr>
				<td><input type="button" id="chaKanKaoQinId" name="chaKanKaoQin" value="�鿴���¿���"/></td>
			</tr> -->
			<tbody id="show"></tbody>
		</table>
		
	</form>
	---------------
	<a href="index.jsp">����</a>
<!-- <form action="saveOneKaoQinInfoAction" method="post">
	<input type="submit" name="daka" id="dakaId" value="��" />
</form>
<a href='#' id='delete' onclick='saveOneInfo()'>��2</a>
----------------------- -->
</body>
</html>