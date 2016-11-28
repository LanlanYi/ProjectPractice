<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>查看会计工作汇报</title>
</head>
<body>

<table border="1px">
	<tr>
		<td>序号</td>
		<td>操作会计的编号</td>
		<td>账目的时间</td>
		<td>记账活动类型编号</td>
		<td>金额</td>
		<td>结余</td>
		<td>操作</td>
		<td>状态</td>
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
			<a href="replyKuaijiReportAction?kuaiJiReportId=${kuaiJiReport.kuaijiReportId }">查看</a>
		</td>
		<td>${kuaiJiReport.status }</td>
	</tr>
	</c:forEach>	
</table>

<br />
	<a href="laoban.jsp">返回</a>
<br /><br /><br /><br />

</body>
</html>