/**
 * @auto lijun
 * welcome index view
 */
function btnLogin_click(){
	var userjson = $('#frmIndex').serialize();
	var url ='home/login';
	//console.log(url);
	$.ajax({
		url:url,
		type:'POST',
		dataType:'json',
		data:JSON.stringify({"loginId":"lijun","password":"jps38li"}),
		contentType : "application/json",
		success:function(rdata){
			alert(rdata.result);
		},
	    error: function(XMLHttpRequest, textStatus, errorThrown){  
	        alert(XMLHttpRequest.readyState + XMLHttpRequest.status + XMLHttpRequest.responseText); 
	    }
	});
}
