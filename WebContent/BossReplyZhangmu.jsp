<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>老板回复账目</title>
</head>

<body>

老板回复账目

<table>
	<tr>
		<td>操作会计的编号</td>
		<td>账目的时间</td>
		<td>记账活动类型编号</td>
		<td>金额</td>
		<td>结余</td>
	</tr>
	<c:forEach items="${sessionScope.zhangmuList }" var="zhangmu">
	<tr>
		<td>${sessionScope.zhangmu1.kuaijiId }</td>
		<td>${sessionScope.zhangmu1.time }</td>
		<td>${sessionScope.zhangmu1.jizhangId }</td>
		<td>${sessionScope.zhangmu1.amount }</td>
		<td>${sessionScope.zhangmu1.jieyu }</td>
	</tr>
</c:forEach>	
</table>

<form action="insertOrUpdateAction" method="post" id="f">
	<table>
		<tr>
			<td>回复</td>
			<td>
				<textarea name="reply" id="reply" cols="50" rows="10">
					${sessionScope.zhangmu1.reply}
				</textarea>
			</td>
		</tr>
		<tr>
			<td>操作</td>
			<td><input type="submit" name="tijiao" id="tijiao" value="保存" /></td>
		</tr>
		
	</table>

</form>

<br /><br /><br /><br /><br />

</body>
</html>