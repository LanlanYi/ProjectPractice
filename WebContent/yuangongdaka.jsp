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

//�洢һ������Ϣ
function saveOneInfo(){
	$.ajax({
		url:"saveOneKaoQinInfoAction",
		method:"post",
		dataType:"json",
		success:function(){
			alert("�򿨳ɹ�");
		}
	});
}
</script>
</head>
<body>
daka
<form action="saveOneKaoQinInfoAction" method="post">
	<input type="submit" name="daka" id="dakaId" value="��" />
</form>
<a href='index.jsp' id='delete' onclick='saveOneInfo()'>��2������</a><!-- ���ܽ�ʱ��洢����һ����MonthKaoQin�����������첽��������� ������ת����һ������ -->
-----------------------





</body>
</html>