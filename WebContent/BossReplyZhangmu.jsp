<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>�ϰ�ظ���Ŀ</title>
</head>

<body>

�ϰ�ظ���Ŀ
<form action="insertOrUpdateAction" method="post" id="f">
	<table>
		<tr>
			<td>������Ƶı��</td>
			<td>��Ŀ��ʱ��</td>
			<td>���˻���ͱ��</td>
			<td>���</td>
			<td>����</td>
		</tr>
		<tr>
			<td>${sessionScope.zhangmu1.kuaijiId }</td>
			<td>${sessionScope.zhangmu1.time }</td>
			<td>${sessionScope.zhangmu1.jizhangId }</td>
			<td>${sessionScope.zhangmu1.amount }</td>
			<td>${sessionScope.zhangmu1.jieyu }</td>
		</tr>
	</table>

	<table>
		<tr>
			<td>�ظ�</td>
			<td>
				<textarea name="reply" id="reply" cols="50" rows="10">
					${sessionScope.zhangmu1.reply}
				</textarea>
			</td>
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

<br /><br /><br /><br /><br />

</body>
</html>