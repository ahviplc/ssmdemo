UE.registerUI('endorse',function(editor,uiName){
	var serverCtx='/ZFDXFLZS';
	var me=this;
	var getEndorseNode = function(editor){
		var nodes=editor.selection.getStartElementPath();
        return domUtils.filterNodeList(nodes,'span');
    };
    //注册按钮执行时的command命令，使用命令默认就会带有回退操作
    editor.registerCommand(uiName,{
        execCommand:function(){
        	$.dialog({
				id:'EndorseEditor',
				title:'批注信息',
				content:'url:'+serverCtx+'/zfdx/caseDocEndorse.jsp?docId='+$('#caseDocVoId').val(),
				width:($(window).width()/2),
				height:($(window).height()/2),
				max:true,
				min:false,
				resize:false,
				zIndex:1000,
				close:function(){
					try{
						var iRet=this.content.getValue();
						if(iRet){
							var range = me.selection.getRange();
			    			var tmpNode = range.document.createElement('span');
			    			var jq=$(tmpNode);
			    			jq.html('\u3010').css({color:'#ff0000',cursor:'pointer'});
			    			jq.attr('class','endorseId_'+iRet.endorseId);
			    			range.insertNode(tmpNode);
			    			
			    			range.setStart(range.endContainer, range.endOffset);
			    			tmpNode = range.document.createElement('span');
			    			jq=$(tmpNode);
			    			jq.html(iRet.endorserName+'标注\u3011').css({color:'#ff0000',cursor:'pointer'});
			    			jq.attr('class','endorseId_'+iRet.endorseId);
			    			range.insertNode(tmpNode);
			    			range.collapse();
			    			var html=editor.getContent();
			    			var url=serverCtx+'/zfdxjs/checkCaseDocForCaseDoc.action';
			    			//caseDocVo.id
			    			//caseDocVo.caseDocComment
			    			var postValue='caseDocVo.id='+$('#caseDocVoId').val();
			    			postValue+='&caseDocVo.caseDocComment='+html;
			    			
			    			$.post(url,postValue,function(data){
			    				if(data.state!=0){
			    					alert(data.msg?data.msg:'更新批注后文本信息发生系统错误');
			    				}
			    			},'json');
						}
					}catch(err){}
				}
			});
        }
    });

    //创建一个button
    var btn = new UE.ui.Button({
        //按钮的名字
        name:uiName,
        //提示
        title:'先选择修改内容，然后点击此按钮进行批注',
        //需要添加的额外样式，指定icon图标，这里默认使用一个重复的icon
        cssRules :'background-position: -641px -40px;',
        //点击时执行的命令
        onclick:function () {
            //这里可以不用执行命令,做你自己的操作也可
           editor.execCommand(uiName);
        }
    });
    var preEndorseId;
    //当点到编辑内容上时，按钮要做的状态反射
    editor.addListener('click', function () {
    	var range = me.selection.getRange();
    	if(!range.collapsed) return false;
		var node=getEndorseNode(this);
		if(node){
			var clazz=node.className;
			if(clazz&&clazz.indexOf('endorseId_')===0){
				var endorseId=node.className.substring(10);
				if(browser.ie&&preEndorseId==endorseId){
					preEndorseId=null;
					return false;
				}
				preEndorseId=endorseId;
				$.dialog({
					id:'EndorseEditor',
					title:'批注信息',
					content:'url:'+serverCtx+'/zfdx/caseDocEndorse.jsp?docId='+$('#caseDocVoId').val()+'&endorseId='+endorseId,
					width:($(window).width()/2),
					height:($(window).height()/2),
					max:true,
					min:false,
					resize:false,
					zIndex:1000,
					close:function(){
						try{
							var iRet=this.content.getValue();
							if(iRet){
								$.dialog.tips('成功更新批注信息',2,'tips.gif');
							}
						}catch(err){alert(err);}
					}
				});
			}
		}
    });

    //因为你是添加button,所以需要返回这个button
    return btn;
});
/*index 指定添加到工具栏上的那个位置，默认时追加到最后,editorId 指定这个UI是那个编辑器实例上的，默认是页面上所有的编辑器都会添加这个按钮*/