(function(g,l,h){var n=l.ActiveXObject&&!l.XMLHttpRequest,z=function(){},x=0,u=/^url:/,y,d,p=l.document,j="JDG"+(+new Date),q='<table class="ui_border"><tbody><tr><td class="ui_lt"></td><td class="ui_t"></td><td class="ui_rt"></td></tr><tr><td class="ui_l"></td><td class="ui_c"><div class="ui_inner"><table class="ui_dialog"><tbody><tr><td colspan="2"><div class="ui_title_bar"><div class="ui_title" unselectable="on"></div><div class="ui_title_buttons"><a class="ui_min" href="javascript:void(0);" title="\u6700\u5C0F\u5316"><b class="ui_min_b"></b></a><a class="ui_max" href="javascript:void(0);" title="\u6700\u5927\u5316"><b class="ui_max_b"></b></a><a class="ui_res" href="javascript:void(0);" title="\u8FD8\u539F"><b class="ui_res_b"></b><b class="ui_res_t"></b></a><a class="ui_close" href="javascript:void(0);" title="\u5173\u95ED(esc\u952E)">\xd7</a></div></div></td></tr><tr><td class="ui_icon"></td><td class="ui_main"><div class="ui_content"></div></td></tr><tr><td colspan="2"><div class="ui_buttons"></div></td></tr></tbody></table></div></td><td class="ui_r"></td></tr><tr><td class="ui_lb"></td><td class="ui_b"></td><td class="ui_rb"></td></tr></tbody></table>',s,f=(function(A,B,C){var e=A.length;for(;B<e;B++){C=!!p.querySelector?A[B].src:A[B].getAttribute("src",4);if(C.substr(C.lastIndexOf("/")).indexOf("lhgdialog")!==-1){break}}C=C.split("?");s=C[1];return C[0].substr(0,C[0].lastIndexOf("/")+1)})(p.getElementsByTagName("script"),0),o=function(B){if(s){var D=s.split("&"),C=0,A=D.length,e;for(;C<A;C++){e=D[C].split("=");if(B===e[0]){return e[1]}}}return null},k=o("skin")||"default",b,r=(function(A){try{b=A.top.document;b.getElementsByTagName}catch(B){b=A.document;return A}if(o("self")==="true"||b.getElementsByTagName("frameset").length>0){b=A.document;return A}return A.top})(l),i=b.documentElement,m=b.compatMode==="BackCompat";_$doc=g(b),_$top=g(r),_$html=g(b.getElementsByTagName("html")[0]);try{b.execCommand("BackgroundImageCache",false,true)}catch(v){}(function(A){if(!A){var e=b.getElementsByTagName("head")[0],B=b.createElement("link");B.href=f+"skins/"+k+".css";B.rel="stylesheet";B.id="lhgdialoglink";e.insertBefore(B,e.firstChild)}})(b.getElementById("lhgdialoglink"));n&&(function(e){if(_$html.css(e)!=="fixed"){_$html.css({zoom:1,backgroundImage:"url(about:blank)",backgroundAttachment:"fixed"})}})("backgroundAttachment");var a=function(e){e=e||{};var C,B=a.setting;for(var A in B){if(e[A]===h){e[A]=B[A]}}e.id=e.id||j+x;C=a.list[e.id];if(C){return C.zindex().focus()}e.button=e.button||[];e.ok&&e.button.push({id:"ok",name:e.okVal,callback:e.ok,focus:e.focus});e.cancel&&e.button.push({id:"cancel",name:e.cancelVal,callback:e.cancel});a.setting.zIndex=e.zIndex;x++;return a.list[e.id]=y?y._init(e):new a.fn._init(e)};a.fn=a.prototype={constructor:a,_init:function(e){var D=this,C,B=e.content,A=u.test(B);D.opener=l;D.config=e;D.DOM=C=D.DOM||D._getDOM();D.closed=false;D.data=e.data;if(e.icon&&!A){e.min=false;e.max=false;C.icon[0].style.display="";C.icon[0].innerHTML='<img src="'+e.path+"skins/icons/"+e.icon+'" class="ui_icon_bg"/>'}else{C.icon[0].style.display="none"}C.wrap.addClass(e.skin);C.rb[0].style.cursor=e.resize?"se-resize":"auto";C.title[0].style.cursor=e.drag?"move":"auto";C.max[0].style.display=e.max?"inline-block":"none";C.min[0].style.display=e.min?"inline-block":"none";C.close[0].style.display=e.cancel===false?"none":"inline-block";C.content[0].style.padding=e.padding;D.button.apply(D,e.button);D.title(e.title).content(B,true,A).size(e.width,e.height).position(e.left,e.top).time(e.time)[e.show?"show":"hide"](true).zindex();e.focus&&D.focus();e.lock&&D.lock();D._ie6PngFix()._addEvent();y=null;if(!A&&e.init){e.init.call(D,l)}return D},button:function(){var D=this,J=D.DOM,G=J.buttons[0],F="ui_state_highlight",H=D._listeners=D._listeners||{},A=[].slice.call(arguments),B=0,K,I,e,E,C;for(;B<A.length;B++){K=A[B];I=K.name;e=K.id||I;E=!H[e];C=!E?H[e].elem:b.createElement("input");C.type="button";if(!H[e]){H[e]={}}if(I){C.value=I}if(K.callback){H[e].callback=K.callback}if(K.focus){D._focus&&D._focus.removeClass(F);D._focus=g(C).addClass(F);D.focus()}C[j+"callback"]=e;C.disabled=!!K.disabled;if(E){H[e].elem=C;G.appendChild(C)}}G.style.display=A.length?"":"none";D._ie6SelectFix();return D},title:function(C){if(C===h){return this}var A=this.DOM,e=A.border,B=A.title[0];if(C===false){B.style.display="none";B.innerHTML="";e.addClass("ui_state_tips")}else{B.style.display="";B.innerHTML=C;e.removeClass("ui_state_tips")}return this},content:function(C,K,H){if(C===h){return this}var F=this,L=F.DOM,A=L.wrap[0],B=A.offsetWidth,J=A.offsetHeight,D=parseInt(A.style.left),G=parseInt(A.style.top),I=A.style.width,e=L.content,E=a.setting.content;if(H){e[0].innerHTML=E;F._iframe(C.split("url:")[1])}else{e.html(C)}if(!K){B=A.offsetWidth-B;J=A.offsetHeight-J;D=D-B/2;G=G-J/2;A.style.left=Math.max(D,0)+"px";A.style.top=Math.max(G,0)+"px";if(I&&I!=="auto"){A.style.width=A.offsetWidth+"px"}F._autoPositionType()}F._ie6SelectFix();return F},size:function(C,e){var E=this,D=E.DOM,B=D.wrap[0],A=D.main[0].style;B.style.width="auto";if(typeof C==="number"){C=C+"px"}if(typeof e==="number"){e=e+"px"}A.width=C;A.height=e;if(C!=="auto"){B.style.width=B.offsetWidth+"px"}E._ie6SelectFix();return E},position:function(G,M){var L=this,F=L.config,B=L.DOM.wrap[0],A=B.style,H=n?false:F.fixed,K=n&&F.fixed,E=_$top.scrollLeft(),O=_$top.scrollTop(),J=H?0:E,C=H?0:O,I=_$top.width(),e=_$top.height(),D=B.offsetWidth,N=B.offsetHeight;if(G||G===0){L._left=G.toString().indexOf("%")!==-1?G:null;G=L._toNumber(G,I-D);if(typeof G==="number"){G=K?(G+=E):G+J;G=Math.max(G,J)+"px"}A.left=G}if(M||M===0){L._top=M.toString().indexOf("%")!==-1?M:null;M=L._toNumber(M,e-N);if(typeof M==="number"){M=K?(M+=O):M+C;M=Math.max(M,C)+"px"}A.top=M}if(G!==h&&M!==h){L._autoPositionType()}return L},time:function(e,C){var A=this,B=A._timer;B&&clearTimeout(B);C&&C.call(A);if(e){A._timer=setTimeout(function(){A._click("cancel")},1000*e)}return A},show:function(e){this.DOM.wrap[0].style.visibility="visible";this.DOM.border.addClass("ui_state_visible");if(!e&&this._lock){g("#ldg_lockmask",b)[0].style.display=""}return this},hide:function(e){this.DOM.wrap[0].style.visibility="hidden";this.DOM.border.removeClass("ui_state_visible");if(!e&&this._lock){g("#ldg_lockmask",b)[0].style.display="none"}return this},zindex:function(){var B=this,A=B.DOM,C=B._load,D=a.focus,e=a.setting.zIndex++;A.wrap[0].style.zIndex=e;D&&D.DOM.border.removeClass("ui_state_focus");a.focus=B;A.border.addClass("ui_state_focus");if(C&&C.style.zIndex){C.style.display="none"}if(D&&D!==B&&D.iframe){D._load.style.display=""}return B},focus:function(){try{elemFocus=this._focus&&this._focus[0]||this.DOM.close[0];elemFocus&&elemFocus.focus()}catch(A){}return this},lock:function(){var D=this,E,B=a.setting.zIndex-1,A=D.config,e=g("#ldg_lockmask",b)[0],C=e?e.style:"",F=n?"absolute":"fixed";if(!e){E='<iframe src="javascript:\'\'" style="width:100%;height:100%;position:absolute;top:0;left:0;z-index:-1;filter:alpha(opacity=0)"></iframe>';e=b.createElement("div");e.id="ldg_lockmask";e.style.cssText="position:"+F+";left:0;top:0;width:100%;height:100%;overflow:hidden;";C=e.style;if(n){e.innerHTML=E}b.body.appendChild(e)}if(F==="absolute"){C.width=_$top.width();C.height=_$top.height();C.top=_$top.scrollTop();C.left=_$top.scrollLeft();D._setFixed(e)}C.zIndex=B;C.display="";D.zindex();D.DOM.border.addClass("ui_state_lock");D._lock=true;return D},unlock:function(){var C=this,B=C.config,e=g("#ldg_lockmask",b)[0];if(e&&C._lock){if(B.parent&&B.parent._lock){var A=B.parent.DOM.wrap[0].style.zIndex;e.style.zIndex=parseInt(A,10)-1}else{e.style.display="none"}C.DOM.border.removeClass("ui_state_lock")}C._lock=false;return C},close:function(){var D=this,C=D.DOM,B=C.wrap,E=a.list,A=D.config.close;D.time();if(D.iframe){if(typeof A==="function"&&A.call(D,D.iframe.contentWindow,l)===false){return D}g(D.iframe).unbind("load",D._fmLoad).attr("src","javascript:''").remove();C.content.removeClass("ui_state_full");if(D._frmTimer){clearTimeout(D._frmTimer)}}else{if(typeof A==="function"&&A.call(D,l)===false){return D}}D.unlock();if(D._maxState){_$html.removeClass("ui_lock_scroll");C.res[0].style.display="none"}if(a.focus===D){a.focus=null}D._removeEvent();delete E[D.config.id];if(y){B.remove()}else{y=D;if(D._minState){C.main[0].style.display="";C.buttons[0].style.display="";C.dialog[0].style.width=""}C.wrap[0].style.cssText="left:0;top:0;";C.wrap[0].className="";C.border.removeClass("ui_state_focus");C.title[0].innerHTML="";C.content.html("");C.icon[0].innerHTML="";C.buttons[0].innerHTML="";D.hide(true)._setAbsolute();for(var e in D){if(D.hasOwnProperty(e)&&e!=="DOM"){delete D[e]}}}D.closed=true;return D},max:function(){var C=this,H,I=C.DOM,E=I.wrap[0].style,A=I.main[0].style,G=I.rb[0].style,F=I.title[0].style,e=C.config,D=_$top.scrollTop(),B=_$top.scrollLeft();if(!C._maxState){_$html.addClass("ui_lock_scroll");if(C._minState){C.min()}C._or={t:E.top,l:E.left,w:A.width,h:A.height,d:e.drag,r:e.resize,rc:G.cursor,tc:F.cursor};E.top=D+"px";E.left=B+"px";H=C._maxSize();C.size(H.w,H.h)._setAbsolute();if(n&&m){E.width=_$top.width()+"px"}e.drag=false;e.resize=false;G.cursor="auto";F.cursor="auto";I.max[0].style.display="none";I.res[0].style.display="inline-block";C._maxState=true}else{_$html.removeClass("ui_lock_scroll");E.top=C._or.t;E.left=C._or.l;C.size(C._or.w,C._or.h)._autoPositionType();e.drag=C._or.d;e.resize=C._or.r;G.cursor=C._or.rc;F.cursor=C._or.tc;I.res[0].style.display="none";I.max[0].style.display="inline-block";delete C._or;C._maxState=false}return C},min:function(){var E=this,D=E.DOM,e=D.main[0].style,C=D.buttons[0].style,B=D.dialog[0].style,F=D.rb[0].style.cursor,A=E.config.resize;if(!E._minState){if(E._maxState){E.max()}E._minRz={rzs:A,btn:C.display};e.display="none";C.display="none";B.width=e.width;F.cursor="auto";A=false;E._minState=true}else{e.display="";C.display=E._minRz.btn;B.width="";A=E._minRz;F.cursor=E._minRz.rzs?"se-resize":"auto";delete E._minRz;E._minState=false}E._ie6SelectFix();return E},get:function(A,e){if(a.list[A]){if(e===1){return a.list[A]}else{return a.list[A].content||null}}return null},reload:function(C,A,D){C=C||l;try{C.location.href=A?A:C.location.href}catch(B){A=this.iframe.src;g(this.iframe).attr("src",A)}D&&D.call(this);return this},_iframe:function(B){var J=this,I,P,D,G,H,C,e,A=J.DOM.content,E=J.config,F=J._load=g(".ui_loading",A[0])[0],N="position:absolute;left:-9999em;border:none 0;background:transparent",M="width:100%;height:100%;border:none 0;";if(E.cache===false){var L=(new Date).getTime(),K=B.replace(/([?&])_=[^&]*/,"$1_="+L);B=K+((K===B)?(/\?/.test(B)?"&":"?")+"_="+L:"")}I=J.iframe=b.createElement("iframe");I.name=E.id;I.style.cssText=N;I.setAttribute("frameborder",0,0);P=g(I);A[0].appendChild(I);J._frmTimer=setTimeout(function(){P.attr("src",B)},1);var O=J._fmLoad=function(){A.addClass("ui_state_full");var S=J.DOM,U,R=S.lt[0].offsetHeight,Q=S.main[0].style;F.style.cssText="display:none;position:absolute;background:#FFF;opacity:0;filter:alpha(opacity=0);z-index:1;width:"+Q.width+";height:"+Q.height+";";try{D=J.content=I.contentWindow;G=g(D.document);H=g(D.document.body)}catch(T){I.style.cssText=M;return}C=E.width==="auto"?G.width()+(n?0:parseInt(H.css("marginLeft"))):E.width;e=E.height==="auto"?G.height():E.height;setTimeout(function(){I.style.cssText=M},0);if(!J._maxState){J.size(C,e).position(E.left,E.top)}F.style.width=Q.width;F.style.height=Q.height;E.init&&E.init.call(J,D,r)};J.iframe.api=J;P.bind("load",O)},_getDOM:function(){var E=b.createElement("div"),A=b.body;E.style.cssText="position:absolute;left:0;top:0;visibility:hidden;";E.innerHTML=q;var B,D=0,F={wrap:g(E)},C=E.getElementsByTagName("*"),e=C.length;for(;D<e;D++){B=C[D].className.split("ui_")[1];if(B){F[B]=g(C[D])}}A.insertBefore(E,A.firstChild);return F},_toNumber:function(e,A){if(typeof e==="number"){return e}if(e.indexOf("%")!==-1){e=parseInt(A*e.split("%")[0]/100)}return e},_maxSize:function(){var E=this,D=E.DOM,A=D.wrap[0],e=D.main[0],C,B;C=_$top.width()-A.offsetWidth+e.offsetWidth;B=_$top.height()-A.offsetHeight+e.offsetHeight;return{w:C,h:B}},_ie6PngFix:function(){if(n){var A=0,C,F,B,e,E=a.setting.path+"/skins/",D=this.DOM.wrap[0].getElementsByTagName("*");for(;A<D.length;A++){C=D[A];F=C.currentStyle.png;if(F){B=E+F;e=C.runtimeStyle;e.backgroundImage="none";e.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader(src='"+B+"',sizingMethod='scale')"}}}return this},_ie6SelectFix:n?function(){var A=this.DOM.wrap,D=A[0],E=E+"iframeMask",C=A[E],B=D.offsetWidth,e=D.offsetHeight;B=B+"px";e=e+"px";if(C){C.style.width=B;C.style.height=e}else{C=D.appendChild(b.createElement("iframe"));A[E]=C;C.src="javascript:''";C.style.cssText="position:absolute;z-index:-1;left:0;top:0;filter:alpha(opacity=0);width:"+B+";height:"+e}}:z,_autoPositionType:function(){this[this.config.fixed?"_setFixed":"_setAbsolute"]()},_setFixed:function(D){var C=D?D.style:this.DOM.wrap[0].style;if(n){var B=_$top.scrollLeft(),A=_$top.scrollTop(),F=parseInt(C.left)-B,E=parseInt(C.top)-A,e=m?"this.ownerDocument.body":"this.ownerDocument.documentElement";this._setAbsolute();C.setExpression("left",e+".scrollLeft +"+F);C.setExpression("top",e+".scrollTop +"+E)}else{C.position="fixed"}},_setAbsolute:function(){var e=this.DOM.wrap[0].style;if(n){e.removeExpression("left");e.removeExpression("top")}e.position="absolute"},_click:function(e){var B=this,A=B._listeners[e]&&B._listeners[e].callback;return typeof A!=="function"||A.call(B,l)!==false?B.close():B},_reset:function(){var G=!!l.ActiveXObject,E,D=this,C=_$top.width(),F=_$top.height(),e=D._winSize||C*F,B=D._lockDocW||C,A=D._left,H=D._top;if(G){if(D._lock&&n){g("#ldg_lockmask",b).css({width:C+"px",height:F+17+"px"})}newWidth=D._lockDocW=C;E=D._winSize=C*F;if(e===E){return}}if(D._maxState){var I=D._maxSize();D.size(I.w,I.h)}if(G&&Math.abs(B-newWidth)===17){return}if(A||H){D.position(A,H)}},_addEvent:function(){var e,C=this,A=C.config,B=C.DOM;C._winResize=function(){e&&clearTimeout(e);e=setTimeout(function(){C._reset()},140)};_$top.bind("resize",C._winResize);B.wrap.bind("click",function(E){var F=E.target,D;if(F.disabled){return false}if(F===B.close[0]){C._click("cancel");return false}else{if(F===B.max[0]||F===B.res[0]||F===B.max_b[0]||F===B.res_b[0]||F===B.res_t[0]){C.max();return false}else{if(F===B.min[0]||F===B.min_b[0]){C.min();return false}else{D=F[j+"callback"];D&&C._click(D)}}}}).bind("mousedown",function(D){C.zindex();var E=D.target;if(A.drag!==false&&E===B.title[0]||A.resize!==false&&E===B.rb[0]){w(D);return false}});if(A.max){B.title.bind("dblclick",function(){C.max();return false})}},_removeEvent:function(){var A=this,e=A.DOM;e.wrap.unbind();e.title.unbind();_$top.unbind("resize",A._winResize)}};a.fn._init.prototype=a.fn;a.focus=null;a.list={};d=function(A){var C=A.target,e=a.focus,B=A.keyCode;if(!e||!e.config.esc||e.config.cancel===false){return}B===27&&e._click(e.config.cancelVal)};_$doc.bind("keydown",d);r!=l&&g(l).bind("unload",function(){var A=a.list;for(var e in A){if(A[e]){A[e].close()}}y&&y.DOM.wrap.remove();_$doc.unbind("keydown",d);g("#ldg_lockmask",b)[0]&&g("#ldg_lockmask",b).remove();g("#ldg_dragmask",b)[0]&&g("#ldg_dragmask",b).remove()});a.setting={content:'<div class="ui_loading"><span>loading...</span></div>',title:"\u89C6\u7A97 ",button:null,ok:null,cancel:null,init:null,close:null,okVal:"\u786E\u5B9A",cancelVal:"\u53D6\u6D88",skin:"",esc:true,show:true,width:"auto",height:"auto",icon:null,path:f,lock:false,focus:true,parent:null,padding:"10px",fixed:false,left:"50%",top:"38.2%",max:true,min:true,zIndex:1976,resize:true,drag:true,cache:true,data:null,extendDrag:false};var w,c="setCapture" in i,t="onlosecapture" in i;a.dragEvent={onstart:z,start:function(A){var e=a.dragEvent;_$doc.bind("mousemove",e.move).bind("mouseup",e.end);e._sClientX=A.clientX;e._sClientY=A.clientY;e.onstart(A.clientX,A.clientY);return false},onmove:z,move:function(A){var e=a.dragEvent;e.onmove(A.clientX-e._sClientX,A.clientY-e._sClientY);return false},onend:z,end:function(A){var e=a.dragEvent;_$doc.unbind("mousemove",e.move).unbind("mouseup",e.end);e.onend(A.clientX,A.clientY);return false}};w=function(e){var E,F,L,B,H,J,G=a.focus,C=G.config,M=G.DOM,A=M.wrap[0],I=M.title,D=M.main[0],N=a.dragEvent,K="getSelection" in r?function(){r.getSelection().removeAllRanges()}:function(){try{b.selection.empty()}catch(O){}};N.onstart=function(O,P){if(J){F=D.offsetWidth;L=D.offsetHeight}else{B=A.offsetLeft;H=A.offsetTop}_$doc.bind("dblclick",N.end);!n&&t?I.bind("losecapture",N.end):_$top.bind("blur",N.end);c&&I[0].setCapture();M.border.addClass("ui_state_drag");G.focus()};N.onmove=function(P,V){if(J){var S=A.style,R=D.style,Q=P+F,O=V+L;S.width="auto";C.width=R.width=Math.max(0,Q)+"px";S.width=A.offsetWidth+"px";C.height=R.height=Math.max(0,O)+"px";G._load&&g(G._load).css({width:R.width,height:R.height})}else{var R=A.style,U=P+B,T=V+H;C.left=Math.max(E.minX,Math.min(E.maxX,U));C.top=Math.max(E.minY,Math.min(E.maxY,T));R.left=C.left+"px";R.top=C.top+"px"}K()};N.onend=function(O,P){_$doc.unbind("dblclick",N.end);!n&&t?I.unbind("losecapture",N.end):_$top.unbind("blur",N.end);c&&I[0].releaseCapture();n&&G._autoPositionType();M.border.removeClass("ui_state_drag")};J=e.target===M.rb[0]?true:false;E=(function(S){var Q=A.offsetWidth,T=I[0].offsetHeight||20,U=_$top.width(),O=_$top.height(),P=S?0:_$top.scrollLeft(),R=S?0:_$top.scrollTop();maxX=U-Q+P;maxY=O-T+R;return{minX:P,minY:R,maxX:maxX,maxY:maxY}})(A.style.position==="fixed");N.start(e)};g(function(){setTimeout(function(){if(x){return}a({left:"-9999em",time:9,fixed:false,lock:false,focus:false})},150);a.setting.extendDrag&&(function(B){var e=b.createElement("div"),A=e.style,C=n?"absolute":"fixed";e.id="ldg_dragmask";A.cssText="display:none;position:"+C+";left:0;top:0;width:100%;height:100%;cursor:move;filter:alpha(opacity=0);opacity:0;background:#FFF;pointer-events:none;";b.body.appendChild(e);B._start=B.start;B._end=B.end;B.start=function(){var F=a.focus,D=F.DOM.main[0],E=F.iframe;B._start.apply(this,arguments);A.display="block";A.zIndex=a.setting.zIndex+3;if(C==="absolute"){A.width=_$top.width()+"px";A.height=_$top.height()+"px";A.left=_$doc.scrollLeft()+"px";A.top=_$doc.scrollTop()+"px"}if(E&&D.offsetWidth*D.offsetHeight>307200){D.style.visibility="hidden"}};B.end=function(){var D=a.focus;B._end.apply(this,arguments);A.display="none";if(D){D.DOM.main[0].style.visibility="visible"}}})(a.dragEvent)});g.fn.dialog=function(){var e=arguments;this.bind("click",function(){a.apply(this,e);return false});return this};l.lhgdialog=g.dialog=a})(this.jQuery||this.lhgcore,this);(function(c,b,d){var a=function(){return b.setting.zIndex};b.alert=function(f,g,e){return b({title:"警告",id:"Alert",zIndex:a(),icon:"alert.gif",fixed:true,lock:true,content:f,ok:true,resize:false,close:g,parent:e||null})};b.msg=function(h,g,f,j){var i=true;var e=f;if(j){i=j}else{if(c.isFunction(g)){i=g}else{if(c.isFunction(e)){i=e;e=null}}}return b({title:"提示信息",id:"LBSMSG",zIndex:a(),icon:(typeof g=="string")?g:"confirm.gif",fixed:true,lock:true,content:h,ok:function(){},resize:false,close:i,parent:e})};b.confirm=function(f,h,g,e){return b({title:"确认",id:"confirm.gif",zIndex:a(),icon:"confirm.gif",fixed:true,lock:true,content:f,resize:false,parent:e||null,ok:function(i){return h.call(this,i)},cancel:function(i){return g&&g.call(this,i)}})};b.prompt=function(g,i,h,f){h=h||"";var e;return b({title:"提问",id:"Prompt",zIndex:a(),icon:"prompt.gif",fixed:true,lock:true,parent:f||null,content:['<div style="margin-bottom:5px;font-size:12px">',g,"</div>","<div>",'<input value="',h,'" style="width:18em;padding:6px 4px" />',"</div>"].join(""),init:function(){e=this.DOM.content[0].getElementsByTagName("input")[0];e.select();e.focus()},ok:function(j){return i&&i.call(this,e.value,j)},cancel:true})};b.tips=function(g,h,f,i){var e=f?function(){this.DOM.icon[0].innerHTML='<img src="'+this.config.path+"skins/icons/"+f+'" class="ui_icon_bg"/>';this.DOM.icon[0].style.display="";if(i){this.config.close=i}}:function(){this.DOM.icon[0].style.display="none";if(i){this.config.close=i}};return b({id:"Tips",zIndex:a(),title:false,cancel:false,fixed:true,lock:false,resize:false}).content(g).time(h||1.5,e)}})(this.jQuery||this.lhgcore,this.lhgdialog);