/**
 * @auto lijun
 * welcome index view
 */
function btnLogin_click(){
	var loginId = $("#txtLoginId").val();
	var password = $("#txtPassword").val();
	if(loginId==""){
		$("#lblErrorMessage").html("请输入用户名。");
		$("#lblErrorMessage").css("display","inline");
		$("#txtLoginId").focus();
		return false;
	}

	if(password==""){
		$("#lblErrorMessage").html("请输入密码。");
		$("#lblErrorMessage").css("display","inline");
		$("#txtPassword").focus();
		return false;
	}

	//$('form').serialize() URL文字列を生成するだけ 、JSON objectじゃない
	var userjson = $('#frmIndex').serializeObject();
	var url ='home/login.do';
	$.ajax({
		url:url,
		type:'POST',
		dataType:'json',
		data:JSON.stringify(userjson),
		contentType : "application/json",
		success:function(rdata){
			if(rdata.result=="OK"){
				location.href="home/userHome.do";
			}else{
				$("#lblErrorMessage").html("用户名或密码有误。");
				$("#lblErrorMessage").css("display","inline");
				$("#txtLoginId").focus();
			}
		},
	    error: function(XMLHttpRequest, textStatus, errorThrown){
	        alert(XMLHttpRequest.readyState + XMLHttpRequest.status + XMLHttpRequest.responseText);
	    }
	});
}

$.fn.serializeObject = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};
