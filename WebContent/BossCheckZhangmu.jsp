<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>�ϰ�������Ŀ</title>
</head>
<body>

�ϰ�������Ŀ
<br /><br /><br />

<table>
	<tr>
		<td>���</td>
		<td>������Ƶı��</td>
		<td>��Ŀ��ʱ��</td>
		<td>���˻���ͱ��</td>
		<td>���</td>
		<td>����</td>
		<td>����</td>
	</tr>
	<c:forEach items="${sessionScope.zhangmuList }" var="zhangmu" varStatus="vs" >
	<tr>
		<td>${vs.index+1 }</td>
		<td>${zhangmu.kuaijiId }</td>
		<td>${zhangmu.time }</td>
		<td>${zhangmu.jizhangId }</td>
		<td>${zhangmu.amount }</td>
		<td>${zhangmu.jieyu }</td>
		<td>
			<a href="replyZhangmuAction?zhangmuId=${zhangmu.zhangmuId }">����</a>
		</td>
	</tr>
</c:forEach>	
</table>
<br /><br /><br /><br /><br />

</body>

</html>