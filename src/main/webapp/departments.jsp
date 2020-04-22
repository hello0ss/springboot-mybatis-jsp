<%@ page pageEncoding="utf-8" contentType="text/html; charset=utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>departments</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${path}/css/style.css"/>
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br/>
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        部门ID
                    </td>
                    <td>
                        部门编号
                    </td>
                    <td>
                        部门名称
                    </td>
                    <td>
                        操作
                    </td>
                </tr>
                <c:forEach items="${list}" var="se">
                    <tr class="row1">
                        <td>
                                ${se.id}
                        </td>

                        <td>
                                ${se.seid}
                        </td>
                        <td>
                                ${se.name}
                        </td>
                        <td>
                            <a href="${path}/updateDepartment.jsp?id=${se.id}&seid=${se.seid}&name=${se.name}">更新</a>&nbsp;&nbsp;&nbsp;
                            <a href="${path}/person/showPersonMethod?seid=${se.seid}">员工列表</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <p>
                <input type="button" class="button" value="添加员工"
                       onclick="location='${path}/section/ShowSectionMethod'"/>
                <input type="button" class="button" value="添加部门" onclick="location='${path}/addDepartment.jsp'"/>
            </p>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
