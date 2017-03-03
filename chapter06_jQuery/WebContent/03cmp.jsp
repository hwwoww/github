<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

value = <input type="text" id="t" value="아무거나"/><hr/>
html = <textarea rows="3" cols="45" id="ta">미리 작성..</textarea>

<button id="bt">버튼</button>
<!-- 버튼에 이벤트 걸어서 클릭하면 type="text" 에 적힌 글씨
		콘솔 출력, textarea 에 적힌 글씨 콘솔 출력 ,둘 다 val() 로 하면 출력 가능 
		arrt("value") ?? html(): ?? -->
<script>
$("#bt").click(function(){
	window.alert( $("#t").attr("value") );
	window.alert( $("#t").val() );
	
	window.alert( $("#ta").html() );
	window.alert( $("#ta").val() );
});
</script>