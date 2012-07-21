$(function() {
	$("table tbody td").dblclick(function() {
		var id = $(this).attr("id");
		jQuery.post("competition/edit?id="+id);
	});	
});