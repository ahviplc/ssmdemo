

function submitvote(event){
    var checkstatus = event.parentNode.parentNode.getElementsByTagName('input');
    var infomessage=false;
    for(var i=0;i<checkstatus.length;i++){
        if(checkstatus[i].checked){
            infomessage=true;
        }
    }
    if(infomessage){
        alert("投票成功！");
    }else{
        alert("请选择选项后再点击投票按钮！");
    }
}
