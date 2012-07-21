<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pályázat rögzítés</title>
</head>
<body>
	<form action="save" method="post">
		<div class="validation-msg">${errorMsg}</div>
		<fieldset>
			<legend>Pályázat</legend>
					<input type="hidden" name="id" value="${comp.id}">
			Azonosító : <input type="text" name="textId" value="${comp.textId}">
			Leírás : <textarea rows="4" cols="40" name="description">${comp.description}</textarea>
		</fieldset>
		<button type="submit">Mentés</button>
	</form>
</body>
</html>