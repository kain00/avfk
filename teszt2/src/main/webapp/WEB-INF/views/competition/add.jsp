<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>P�ly�zat r�gz�t�s</title>
</head>
<body>
	<form action="save" method="post">
		<div class="validation-msg">${errorMsg}</div>
		<fieldset>
			<legend>P�ly�zat</legend>
					<input type="hidden" name="id" value="${comp.id}">
			Azonos�t� : <input type="text" name="textId" value="${comp.textId}">
			Le�r�s : <textarea rows="4" cols="40" name="description">${comp.description}</textarea>
		</fieldset>
		<button type="submit">Ment�s</button>
	</form>
</body>
</html>