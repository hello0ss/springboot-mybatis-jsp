<%@ page pageEncoding="utf-8" contentType="text/html; charset=utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>update Emp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="${path}/css/style.css"/>
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
                    <a href="#">Main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                update Department info:
            </h1>
            <form action="${path}/section/updateSectionMethod" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            部门id:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="id" value="${param.id}" readonly/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            部门编号:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="seid" value="${param.seid}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            部门名称:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="name" value="${param.name}"/>
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button" value="修改"/>
                </p>
            </form>
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
