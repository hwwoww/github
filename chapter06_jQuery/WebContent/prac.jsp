<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
	//append 
	$(document).ready(function(){
		$("#bt1").click(function(){
			$("p").append("<b>Appended Text<b>");
			});
		$("#bt2").click(function(){
			$("ol").append("<li>Appended item</li>");
			});
		
	//prepent 
		$("#bt3").click(function(){
			$("p").prepend("<b>Prepended text</b>");
		});
		$("#bt4").click(function(){
			$("ol").prepend("<li>Prepended item</li>");
			});
	});	
</script>

<p>paragraph</p>
<ol>
	<li>List item 1</li>
	<li>List item 2</li>
	<li>List item 3</li>
</ol>

<button id ="bt1">Append text</button><br>
<button id="bt2">Append list item</button><br>
<button id ="bt3">Prepend text</button><br>
<button id="bt4">Prepend list item</button><br>

<!-- hide and show -->









