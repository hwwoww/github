<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div align="center">
	<h1>약관</h1>
	아래의 모든 약관에 동의합니다 <input type="checkbox" onClick="toggle(this)"
	id=a1/>
	<hr />
	아래의 약관에 동의합니다.<input type="checkbox" name=chk value=chk1
	 id=a2 class=sub/>
	<div style="height: 200;">
		<h2>이용약관</h2>
	</div>
	<hr />
	아래의 약관에 동의합니다.<input type="checkbox" name=chk value=chk2
	 id=a3 class=sub/>
	<div style="height: 200;">
		<h2>위치정보 이용약관</h2>
	</div>
	<hr />
	<button id="bt" disabled>다음으로.</button>
</div>
<script>
function toggle(source) {
	  checkboxes = document.getElementsByName('chk');
	  for(var i=0, n=checkboxes.length;i<n;i++) {
	    checkboxes[i].checked = source.checked;
	  }
	}

$("#a1").on("click", function(){
	$(".sub").each(function(){
		$(this).prop("checked", $("#a1").prop("checked"));
	})
	enableCheck();
});
$("#a2").click(function() {
	enableCheck();
});

$("#a3").click(enableCheck);

function enableCheck() {
	var cnt=0;
	$(".sub").each(function(){
		if($(this).prop("checked"))
			cnt++;
	});
	if(cnt==2) {
		$("#a1").prop("checked", true);
		$("#next").prop("disabled", false);
	}else {
		$("#a1").prop("checked", false);
		$("#next").prop("disabled", true);
	}
}

</script>

