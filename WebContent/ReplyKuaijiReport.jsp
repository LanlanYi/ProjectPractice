<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>�ظ���ƹ����㱨</title>
</head>
<body>

<form action="insertOrUpdateAction" method="post" id="f">
	<table border="1px">
		<tr>
			<td>������Ƶı��</td>
			<td>��Ŀ��ʱ��</td>
			<td>���˻���ͱ��</td>
			<td>���</td>
			<td>����</td>
		</tr>
		<tr>
			<td>${sessionScope.kuaiJiReport1.kuaijiId }</td>
			<td>${sessionScope.kuaiJiReport1.time }</td>
			<td>${sessionScope.kuaiJiReport1.jizhangId }</td>
			<td>${sessionScope.kuaiJiReport1.amount }</td>
			<td>${sessionScope.kuaiJiReport1.jieyu }</td>
		</tr>
	</table>

	<table>
		<tr>
			<td>�ظ�</td>
			<td>
				<textarea name="reply" id="reply" cols="50" rows="10">
					${sessionScope.kuaiJiReport1.reply}
				</textarea>
			</td>
		</tr>
		<tr>
			<td>��������������/��ͨ����</td>
			<td><input type="text" name="result" id="result" value="${sessionScope.kuaiJiReport1.status}"></td>
			
		</tr>
		<tr>
			<td>����</td>
			<td>
				<input type="submit" name="tijiao" id="tijiao" value="����" />
				<a href="BossCheckZhangmu.jsp">����</a>
			</td>
		</tr>
		
	</table>

</form>

</body>
</html>