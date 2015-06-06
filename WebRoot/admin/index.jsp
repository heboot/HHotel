<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>


<frameset rows="20%,80%">

	<frame src="top.jsp"/>

				<frameset cols="15%,85%">
					<frame src="left.jsp"/>
						<frame src="/main.jsp"/>
				</frameset>

		</frameset>

</html>
