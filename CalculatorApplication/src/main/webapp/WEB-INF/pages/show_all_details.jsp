<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
<c:when test="${!empty calList}">
<table border="1" align="center" bgcolor="cyan">
<c:forEach var="cal1" items="${calList}">
${cal1.firstnum}
${cal1.date}
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color: red">no record</h1>
</c:otherwise>

</c:choose>