<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>老板审批账目</title>
</head>
<body>

老板审批账目
<br /><br /><br />

<table>
	<tr>
		<td>序号</td>
		<td>操作会计的编号</td>
		<td>账目的时间</td>
		<td>记账活动类型编号</td>
		<td>金额</td>
		<td>结余</td>
		<td>操作</td>
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
			<a href="replyZhangmuAction?zhangmuId=${zhangmu.zhangmuId }">审批</a>
		</td>
	</tr>
</c:forEach>	
</table>
<br /><br /><br /><br /><br />

</body>

</html>