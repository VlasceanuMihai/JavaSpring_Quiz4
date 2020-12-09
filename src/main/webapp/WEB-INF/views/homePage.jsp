<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
    <title>Home page</title>
</head>
<body>
<h1>Suma a 2 numere!</h1>

<script type="text/javascript">
    function OnSubmitForm()
    {
        var first = document.getElementById("first").value;
        var second = document.getElementById("second").value;
        document.sumForm.action="/add/first/" + first + "/second/" + second;
        return true;
    }
</script>

<form name="sumForm" method="get" onsubmit="return OnSubmitForm();">
    <input type="text" name="firstNumber"><br>
    <input type="text" name="secondNumber"><br>
    <input type="submit" value="Sum">
</form>
</body>
</html>