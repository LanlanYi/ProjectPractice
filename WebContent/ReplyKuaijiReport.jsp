<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>回复会计工作汇报</title>
</head>
<body>

<form action="insertOrUpdateAction" method="post" id="f">
	<table border="1px">
		<tr>
			<td>操作会计的编号</td>
			<td>账目的时间</td>
			<td>记账活动类型编号</td>
			<td>金额</td>
			<td>结余</td>
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
			<td>回复</td>
			<td>
				<textarea name="reply" id="reply" cols="50" rows="10">
					${sessionScope.kuaiJiReport1.reply}
				</textarea>
			</td>
		</tr>
		<tr>
			<td>审批结果（已审核/不通过）</td>
			<td><input type="text" name="result" id="result" value="${sessionScope.kuaiJiReport1.status}"></td>
			
		</tr>
		<tr>
			<td>操作</td>
			<td>
				<input type="submit" name="tijiao" id="tijiao" value="保存" />
				<a href="BossCheckZhangmu.jsp">返回</a>
			</td>
		</tr>
		
	</table>

</form>

</body>
</html>