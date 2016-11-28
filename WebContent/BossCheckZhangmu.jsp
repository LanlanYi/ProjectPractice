<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>老板审批账目</title>
</head>
<body>

老板审批账目
<br /><br /><br />

<a href="zhangmuAction">显示全部账目</a>
<a href="uncheckedZhangmuAction">只查看未审批的账目</a>

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
		<td>
			<c:choose>
		       <c:when test="${zhangmu.reply == null}">未审批</c:when>
		       <c:otherwise>已审批</c:otherwise>
			</c:choose>
		</td>
	</tr>
	</c:forEach>	
</table>

<br />
	<a href="laoban.jsp">返回</a>
<br /><br /><br /><br />

</body>

</html>