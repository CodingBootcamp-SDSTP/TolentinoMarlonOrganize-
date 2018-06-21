<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
	<title>My Profile</title>
	<link rel="stylesheet" type="text/css" href="style.css" />
	<script>
		window.onload = function() {
			document.getElementById('menulink').onclick = function() {
				var menu = document.getElementById('menu');
				if(menu.className != 'showmenu') {
					menu.className = 'showmenu';
				}
				else {
					menu.className = 'hiddenmenu';
				}
			}
		}

		function show() {
			var xhr = new XMLHttpRequest();
			xhr.onreadystatechange = function() {
				if(this.readyState ==4 && this.status == 200) {
					document.getElementById("input").innerHTML = this.responseText;
				}
			};
			xhr.open("GET", "input.jsp", true);
			xhr.send();
		}
	</script>
	</head>
	<body>
		<center>
		</center>
		<div id="header">
			<div id="name">Organize!</div>
			<div id="menubutton"><a id="menulink" href="#">MENU</a></div>
			<div id="menu" class="hiddenmenu">
				<div class="menuitem"><a href="/organize/urls">Display</a></div>
				<div class="menuitem"><a id="add" onclick="show()">Add</a></div>
				<div class="menuitem"><a href="#">Delete</a></div>
				<div class="menuitem"><a href="#">Chart</a></div>
				<div class="menuitem">URL</div>
			</div>
			<div class="clear"></div>
		</div>
		<div id="input">
		</div>
	</body>
</html>
