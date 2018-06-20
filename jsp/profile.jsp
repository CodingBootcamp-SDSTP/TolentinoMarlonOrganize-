<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
	<title>My Profile</title>
		<style>
			body {
				margin: 0px;
			}
			#header {
				background: rgb(1, 136, 138); color:white;
				font-size: 16px;
				padding: 16px;
			}
			#header > #name {
				font-weight: bold;
				float: left;
			}
			#menu a, #menubutton a {
				text-decoration: none;
				color: white;
				text-transform: uppercase;
				font: arial; font-size: 13px;
			}
			@media only screen and (min-width: 600px) {
				#menu {
					float: right;
					display: block;
				}
				.menuitem {
					display: inline;
				}
				.menuitem + .menuitem {
					border-left: 1px solid rgb(255, 255, 255);
					margin-left: 8px; padding-left: 8px;
				}
				#menubutton {
					display: none;
				}
			}
			@media only screen and (max-width: 599px) {
				#menubutton {
					display: inline;
					float: right;
				}
				#menu {
					position: absolute; top: 48px;
					right: 0px; background: rgb(90, 54, 0);
					padding: 16px;
				}
				.showmenu {
					display: block;
				}
				.hiddenmenu {
					display: none;
				}
				.menuitem {
					display: block;
				}
				.menuitem + .menuitem {
					margin-top: 8px;
				}
			}
			.clear {
				clear: both;
			}
			.content {
			}
		</style>
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
		</script>
	</head>
		<body>
			<center>
				<!-- <% String age = (String) session.getAttribute("age");%>
				<% String gender = (String) session.getAttribute("gender");%>
				<% String address = (String) session.getAttribute("address");%>
				Your Age :  <%= age %>
				Your Gender : <%= gender %>
				Your Address <%= address %> -->
			</center>
			<div id="header">
				<div id="name">Organize!</div>
				<div id="menubutton"><a id="menulink" href="#">MENU</a></div>
				<div id="menu" class="hiddenmenu">
					<div class="menuitem"><a href="/organize/urls">All URL</a></div>
					<div class="menuitem"><a href="#">Types</a></div>
					<div class="menuitem"><a href="#">Modify</a></div>
					<div class="menuitem"><a href="#">Sort!</a></div>
				</div>
				<div class="clear"></div>
			</div>
			<div class="content">
			</div>
		</body>
</html>
