<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>�鿴��ƹ����㱨</title>
</head>
<body>

<table border="1px">
	<tr>
		<td>���</td>
		<td>������Ƶı��</td>
		<td>��Ŀ��ʱ��</td>
		<td>���˻���ͱ��</td>
		<td>���</td>
		<td>����</td>
		<td>����</td>
		<td>״̬</td>
	</tr>
	<c:forEach items="${sessionScope.kuaiJiReportList }" var="kuaiJiReport" varStatus="vs" >
	<tr>
		
		<td>${vs.index+1 }</td>
		<td>${kuaiJiReport.kuaijiId }</td>
		<td>${kuaiJiReport.time }</td>
		<td>${kuaiJiReport.jizhangId }</td>
		<td>${kuaiJiReport.amount }</td>
		<td>${kuaiJiReport.jieyu }</td>
		<td>
			<a href="replyKuaijiReportAction?kuaiJiReportId=${kuaiJiReport.kuaijiReportId }">�鿴</a>
		</td>
		<td>${kuaiJiReport.status }</td>
	</tr>
	</c:forEach>	
</table>

<br />
	<a href="laoban.jsp">����</a>
<br /><br /><br /><br />

</body>
</html>