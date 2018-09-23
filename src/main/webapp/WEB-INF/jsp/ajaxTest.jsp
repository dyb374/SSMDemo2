<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax Test</title>
<script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#useJson").click(function() {
			$.ajax({
				type : "POST",
				url : "http://127.0.0.1:8080/SSMDemo2/demo_json",
				data : {
					name : "Andrew",
				},
				datType : "json",
				success : function(data) {
					if (data.success) {
						$("#test").html(data.msg);
					} else {
						$("#test").html("出现错误: " + data.msg);
					}
				},
				error : function(jqXHR) {
					alert("status: " + jqXHR.status);
				}
			});
		});
	});
	/*
		function loadXMLDoc() {
			var xmlhttp;
			if (window.XMLHttpRequest) {
				xmlhttp = new XMLHttpRequest();//IE7+, Firefox, Chrome, Opera, Safari浏览器执行的代码
			} else {
				xmlhttp = new ActiveXObjext("Microsoft.XMLHTTP")//IE6, IE5浏览器执行的代码
			}

			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					document.getElementById("test").innerHTML = xmlhttp.responseText;
				}
			}

			xmlhttp.open("GET", "http://localhost:8080/SSMDemo2/demo_get", true);
			xmlhttp.send();
		}
	 */
	/*
	 window.onload = function() {
	 document.getElementById("useJson").onclick = function() {
	 var xmlhttp;
	 if (window.XMLHttpRequest) {
	 xmlhttp = new XMLHttpRequest();//IE7+, Firefox, Chrome, Opera, Safari浏览器执行的代码
	 } else {
	 xmlhttp = new ActiveXObjext("Microsoft.XMLHTTP")//IE6, IE5浏览器执行的代码
	 }

	 xmlhttp.onreadystatechange = function() {
	 if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
	 var data = JSON.parse(xmlhttp.responseText);
	 if (data.success){						
	 document.getElementById("test").innerHTML = data.msg;
	 } else {
	 document.getElementById("test").innerHTML = "出现错误: " + data.msg;
	 }
	 }
	 }

	 xmlhttp.open("POST", "http://localhost:8080/SSMDemo2/demo_json");
	 xmlhttp.setRequestHeader("Content-type",
	 "application/x-www-form-urlencoded");
	 xmlhttp.send("name=Andrew");
	 }
	 }
	 */
</script>
</head>
<body>
	<div id="test"></div>
	<button onclick="loadXMLDoc()">post test</button>
	<button id="useJson">USE JSON</button>
</body>
</html>