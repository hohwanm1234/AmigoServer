$(document).ready(function(){
    $("#loginBtn").click(function() {

        var id = $("#id").val();
        var password = $("#password").val();

        if(!id){
            $.messager.alert('Amigo',"사용할 아이디를 넣어주세요.");
            $("#id").focus();
        } else if(!password){
            $.messager.alert('Amigo',"사용할 비밀번호를 넣어주세요.");
            $("#password").focus();
        } else{
            $("#loginInfo").attr("action", "<c:url value='/login'/>");
            $("#loginInfo").submit();
        }


    });

});