<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
	<head>
		<style>
			.input {
				font-style: italize;
				width: 250px;
				margin-left: 30px;
				font-weight: bold;
			}
		</style>
		<script>
			var sessionid = "";
			var added = document.getElementById('addurl');
			added.onclick = function() {
				let url = document.getElementById('url').value;
				let dn = document.getElementById('domain').value;
				let c = document.getElementById('category').value;
				console.log(url);
				let rq = new XMLHttpRequest();
				rq.onreadystatechange = function() {
					if(rq.readyState == 4) {
						sessionid = rq.responseText;
						alert("URL added successfully!");
					}
				}
				rq.open("POST", "/urls/add?url="+url+"&dn="+dn+"&category="+c, true);
				rq.send();
			}
		</script>
	</head>
	<body>
	<form method="POST" action="/organize/urls/add">
		<p class="input">URL: <br><input type="text" name="url" autocomplete="off"/></p>
		<p class="input">Domain Name: <input type="text" name="domain" autocomplete="off"/></p>
		<p class="input">Category: <br><input type="text" name="category" autocomplete="off"/></p>
		<p class="input"><input type="submit" id="addurl"/></p>
	</form>
	</body>
</html>
