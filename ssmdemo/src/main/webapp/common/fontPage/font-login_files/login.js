/* ========================================================================
 * Bootstrap: transition.js v3.3.5
 * http://getbootstrap.com/javascript/#transitions
 * ========================================================================
 * Copyright 2011-2015 Twitter, Inc.
 * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
 * ======================================================================== */

/* ========================================================================
 * Bootstrap: modal.js v3.3.5
 * http://getbootstrap.com/javascript/#modals
 * ========================================================================
 * Copyright 2011-2015 Twitter, Inc.
 * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
 * ======================================================================== */

/* ========================================================================
 * Bootstrap: dropdown.js v3.3.5
 * http://getbootstrap.com/javascript/#dropdowns
 * ========================================================================
 * Copyright 2011-2015 Twitter, Inc.
 * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
 * ======================================================================== */

/* ========================================================================
 * Bootstrap: collapse.js v3.3.5
 * http://getbootstrap.com/javascript/#collapse
 * ========================================================================
 * Copyright 2011-2015 Twitter, Inc.
 * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
 * ======================================================================== */

/* ========================================================================
 * Bootstrap (plugin): validator.js v0.9.0
 * ========================================================================
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Cina Saffary.
 * Made by @1000hz in the style of Bootstrap 3 era @fat
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * ======================================================================== */

define("transition",["jquery","transition"],function(e){+function(e){"use strict";function t(){var e=document.createElement("bootstrap"),t={WebkitTransition:"webkitTransitionEnd",MozTransition:"transitionend",OTransition:"oTransitionEnd otransitionend",transition:"transitionend"};for(var n in t)if(e.style[n]!==undefined)return{end:t[n]};return!1}e.fn.emulateTransitionEnd=function(t){var n=!1,r=this;e(this).one("bsTransitionEnd",function(){n=!0});var i=function(){n||e(r).trigger(e.support.transition.end)};return setTimeout(i,t),this},e(function(){e.support.transition=t();if(!e.support.transition)return;e.event.special.bsTransitionEnd={bindType:e.support.transition.end,delegateType:e.support.transition.end,handle:function(t){if(e(t.target).is(this))return t.handleObj.handler.apply(this,arguments)}}})}(e)}),define("modal",["jquery","transition"],function(e){+function(e){"use strict";function n(n,r){return this.each(function(){var i=e(this),s=i.data("bs.modal"),o=e.extend({},t.DEFAULTS,i.data(),typeof n=="object"&&n);s||i.data("bs.modal",s=new t(this,o)),typeof n=="string"?s[n](r):o.show&&s.show(r)})}var t=function(t,n){this.options=n,this.$body=e(document.body),this.$element=e(t),this.$dialog=this.$element.find(".modal-dialog"),this.$backdrop=null,this.isShown=null,this.originalBodyPad=null,this.scrollbarWidth=0,this.ignoreBackdropClick=!1,this.options.remote&&this.$element.find(".modal-content").load(this.options.remote,e.proxy(function(){this.$element.trigger("loaded.bs.modal")},this))};t.VERSION="3.3.5",t.TRANSITION_DURATION=300,t.BACKDROP_TRANSITION_DURATION=150,t.DEFAULTS={backdrop:!0,keyboard:!0,show:!0},t.prototype.toggle=function(e){return this.isShown?this.hide():this.show(e)},t.prototype.show=function(n){var r=this,i=e.Event("show.bs.modal",{relatedTarget:n});this.$element.trigger(i);if(this.isShown||i.isDefaultPrevented())return;this.isShown=!0,this.checkScrollbar(),this.setScrollbar(),this.$body.addClass("modal-open"),this.escape(),this.resize(),this.$element.on("click.dismiss.bs.modal",'[data-dismiss="modal"]',e.proxy(this.hide,this)),this.$dialog.on("mousedown.dismiss.bs.modal",function(){r.$element.one("mouseup.dismiss.bs.modal",function(t){e(t.target).is(r.$element)&&(r.ignoreBackdropClick=!0)})}),this.backdrop(function(){var i=e.support.transition&&r.$element.hasClass("fade");r.$element.parent().length||r.$element.appendTo(r.$body),r.$element.show().scrollTop(0),r.adjustDialog(),i&&r.$element[0].offsetWidth,r.$element.addClass("in"),r.enforceFocus();var s=e.Event("shown.bs.modal",{relatedTarget:n});i?r.$dialog.one("bsTransitionEnd",function(){r.$element.trigger("focus").trigger(s)}).emulateTransitionEnd(t.TRANSITION_DURATION):r.$element.trigger("focus").trigger(s)})},t.prototype.hide=function(n){n&&n.preventDefault(),n=e.Event("hide.bs.modal"),this.$element.trigger(n);if(!this.isShown||n.isDefaultPrevented())return;this.isShown=!1,this.escape(),this.resize(),e(document).off("focusin.bs.modal"),this.$element.removeClass("in").off("click.dismiss.bs.modal").off("mouseup.dismiss.bs.modal"),this.$dialog.off("mousedown.dismiss.bs.modal"),e.support.transition&&this.$element.hasClass("fade")?this.$element.one("bsTransitionEnd",e.proxy(this.hideModal,this)).emulateTransitionEnd(t.TRANSITION_DURATION):this.hideModal()},t.prototype.enforceFocus=function(){e(document).off("focusin.bs.modal").on("focusin.bs.modal",e.proxy(function(e){this.$element[0]!==e.target&&!this.$element.has(e.target).length&&this.$element.trigger("focus")},this))},t.prototype.escape=function(){this.isShown&&this.options.keyboard?this.$element.on("keydown.dismiss.bs.modal",e.proxy(function(e){e.which==27&&this.hide()},this)):this.isShown||this.$element.off("keydown.dismiss.bs.modal")},t.prototype.resize=function(){this.isShown?e(window).on("resize.bs.modal",e.proxy(this.handleUpdate,this)):e(window).off("resize.bs.modal")},t.prototype.hideModal=function(){var e=this;this.$element.hide(),this.backdrop(function(){e.$body.removeClass("modal-open"),e.resetAdjustments(),e.resetScrollbar(),e.$element.trigger("hidden.bs.modal")})},t.prototype.removeBackdrop=function(){this.$backdrop&&this.$backdrop.remove(),this.$backdrop=null},t.prototype.backdrop=function(n){var r=this,i=this.$element.hasClass("fade")?"fade":"";if(this.isShown&&this.options.backdrop){var s=e.support.transition&&i;this.$backdrop=e(document.createElement("div")).addClass("modal-backdrop "+i).appendTo(this.$body),this.$element.on("click.dismiss.bs.modal",e.proxy(function(e){if(this.ignoreBackdropClick){this.ignoreBackdropClick=!1;return}if(e.target!==e.currentTarget)return;this.options.backdrop=="static"?this.$element[0].focus():this.hide()},this)),s&&this.$backdrop[0].offsetWidth,this.$backdrop.addClass("in");if(!n)return;s?this.$backdrop.one("bsTransitionEnd",n).emulateTransitionEnd(t.BACKDROP_TRANSITION_DURATION):n()}else if(!this.isShown&&this.$backdrop){this.$backdrop.removeClass("in");var o=function(){r.removeBackdrop(),n&&n()};e.support.transition&&this.$element.hasClass("fade")?this.$backdrop.one("bsTransitionEnd",o).emulateTransitionEnd(t.BACKDROP_TRANSITION_DURATION):o()}else n&&n()},t.prototype.handleUpdate=function(){this.adjustDialog()},t.prototype.adjustDialog=function(){var e=this.$element[0].scrollHeight>document.documentElement.clientHeight;this.$element.css({paddingLeft:!this.bodyIsOverflowing&&e?this.scrollbarWidth:"",paddingRight:this.bodyIsOverflowing&&!e?this.scrollbarWidth:""})},t.prototype.resetAdjustments=function(){this.$element.css({paddingLeft:"",paddingRight:""})},t.prototype.checkScrollbar=function(){var e=window.innerWidth;if(!e){var t=document.documentElement.getBoundingClientRect();e=t.right-Math.abs(t.left)}this.bodyIsOverflowing=document.body.clientWidth<e,this.scrollbarWidth=this.measureScrollbar()},t.prototype.setScrollbar=function(){var e=parseInt(this.$body.css("padding-right")||0,10);this.originalBodyPad=document.body.style.paddingRight||"",this.bodyIsOverflowing&&this.$body.css("padding-right",e+this.scrollbarWidth)},t.prototype.resetScrollbar=function(){this.$body.css("padding-right",this.originalBodyPad)},t.prototype.measureScrollbar=function(){var e=document.createElement("div");e.className="modal-scrollbar-measure",this.$body.append(e);var t=e.offsetWidth-e.clientWidth;return this.$body[0].removeChild(e),t};var r=e.fn.modal;e.fn.modal=n,e.fn.modal.Constructor=t,e.fn.modal.noConflict=function(){return e.fn.modal=r,this},e(document).on("click.bs.modal.data-api",'[data-toggle="modal"]',function(t){var r=e(this),i=r.attr("href"),s=e(r.attr("data-target")||i&&i.replace(/.*(?=#[^\s]+$)/,"")),o=s.data("bs.modal")?"toggle":e.extend({remote:!/#/.test(i)&&i},s.data(),r.data());r.is("a")&&t.preventDefault(),s.one("show.bs.modal",function(e){if(e.isDefaultPrevented())return;s.one("hidden.bs.modal",function(){r.is(":visible")&&r.trigger("focus")})}),n.call(s,o,this)})}(e)}),define("dropdown",["jquery","transition"],function(e){+function(e){"use strict";function i(t){var n=t.attr("data-target");n||(n=t.attr("href"),n=n&&/#[A-Za-z]/.test(n)&&n.replace(/.*(?=#[^\s]*$)/,""));var r=n&&e(n);return r&&r.length?r:t.parent()}function s(r){if(r&&r.which===3)return;e(t).remove(),e(n).each(function(){var t=e(this),n=i(t),s={relatedTarget:this};if(!n.hasClass("open"))return;if(r&&r.type=="click"&&/input|textarea/i.test(r.target.tagName)&&e.contains(n[0],r.target))return;n.trigger(r=e.Event("hide.bs.dropdown",s));if(r.isDefaultPrevented())return;t.attr("aria-expanded","false"),n.removeClass("open").trigger(e.Event("hidden.bs.dropdown",s))})}function o(t){return this.each(function(){var n=e(this),i=n.data("bs.dropdown");i||n.data("bs.dropdown",i=new r(this)),typeof t=="string"&&i[t].call(n)})}var t=".dropdown-backdrop",n='[data-toggle="dropdown"]',r=function(t){e(t).on("click.bs.dropdown",this.toggle)};r.VERSION="3.3.5",r.prototype.toggle=function(t){var n=e(this);if(n.is(".disabled, :disabled"))return;var r=i(n),o=r.hasClass("open");s();if(!o){"ontouchstart"in document.documentElement&&!r.closest(".navbar-nav").length&&e(document.createElement("div")).addClass("dropdown-backdrop").insertAfter(e(this)).on("click",s);var u={relatedTarget:this};r.trigger(t=e.Event("show.bs.dropdown",u));if(t.isDefaultPrevented())return;n.trigger("focus").attr("aria-expanded","true"),r.toggleClass("open").trigger(e.Event("shown.bs.dropdown",u))}return!1},r.prototype.keydown=function(t){if(!/(38|40|27|32)/.test(t.which)||/input|textarea/i.test(t.target.tagName))return;var r=e(this);t.preventDefault(),t.stopPropagation();if(r.is(".disabled, :disabled"))return;var s=i(r),o=s.hasClass("open");if(!o&&t.which!=27||o&&t.which==27)return t.which==27&&s.find(n).trigger("focus"),r.trigger("click");var u=" li:not(.disabled):visible a",a=s.find(".dropdown-menu"+u);if(!a.length)return;var f=a.index(t.target);t.which==38&&f>0&&f--,t.which==40&&f<a.length-1&&f++,~f||(f=0),a.eq(f).trigger("focus")};var u=e.fn.dropdown;e.fn.dropdown=o,e.fn.dropdown.Constructor=r,e.fn.dropdown.noConflict=function(){return e.fn.dropdown=u,this},e(document).on("click.bs.dropdown.data-api",s).on("click.bs.dropdown.data-api",".dropdown form",function(e){e.stopPropagation()}).on("click.bs.dropdown.data-api",n,r.prototype.toggle).on("keydown.bs.dropdown.data-api",n,r.prototype.keydown).on("keydown.bs.dropdown.data-api",".dropdown-menu",r.prototype.keydown)}(e)}),define("collapse",["jquery","./transition"],function(e){+function(e){"use strict";function n(t){var n,r=t.attr("data-target")||(n=t.attr("href"))&&n.replace(/.*(?=#[^\s]+$)/,"");return e(r)}function r(n){return this.each(function(){var r=e(this),i=r.data("bs.collapse"),s=e.extend({},t.DEFAULTS,r.data(),typeof n=="object"&&n);!i&&s.toggle&&/show|hide/.test(n)&&(s.toggle=!1),i||r.data("bs.collapse",i=new t(this,s)),typeof n=="string"&&i[n]()})}var t=function(n,r){this.$element=e(n),this.options=e.extend({},t.DEFAULTS,r),this.$trigger=e('[data-toggle="collapse"][href="#'+n.id+'"],'+'[data-toggle="collapse"][data-target="#'+n.id+'"]'),this.transitioning=null,this.options.parent?this.$parent=this.getParent():this.addAriaAndCollapsedClass(this.$element,this.$trigger),this.options.toggle&&this.toggle()};t.VERSION="3.3.5",t.TRANSITION_DURATION=350,t.DEFAULTS={toggle:!0},t.prototype.dimension=function(){var e=this.$element.hasClass("width");return e?"width":"height"},t.prototype.show=function(){if(this.transitioning||this.$element.hasClass("in"))return;var n,i=this.$parent&&this.$parent.children(".panel").children(".in, .collapsing");if(i&&i.length){n=i.data("bs.collapse");if(n&&n.transitioning)return}var s=e.Event("show.bs.collapse");this.$element.trigger(s);if(s.isDefaultPrevented())return;i&&i.length&&(r.call(i,"hide"),n||i.data("bs.collapse",null));var o=this.dimension();this.$element.removeClass("collapse").addClass("collapsing")[o](0).attr("aria-expanded",!0),this.$trigger.removeClass("collapsed").attr("aria-expanded",!0),this.transitioning=1;var u=function(){this.$element.removeClass("collapsing").addClass("collapse in")[o](""),this.transitioning=0,this.$element.trigger("shown.bs.collapse")};if(!e.support.transition)return u.call(this);var a=e.camelCase(["scroll",o].join("-"));this.$element.one("bsTransitionEnd",e.proxy(u,this)).emulateTransitionEnd(t.TRANSITION_DURATION)[o](this.$element[0][a])},t.prototype.hide=function(){if(this.transitioning||!this.$element.hasClass("in"))return;var n=e.Event("hide.bs.collapse");this.$element.trigger(n);if(n.isDefaultPrevented())return;var r=this.dimension();this.$element[r](this.$element[r]())[0].offsetHeight,this.$element.addClass("collapsing").removeClass("collapse in").attr("aria-expanded",!1),this.$trigger.addClass("collapsed").attr("aria-expanded",!1),this.transitioning=1;var i=function(){this.transitioning=0,this.$element.removeClass("collapsing").addClass("collapse").trigger("hidden.bs.collapse")};if(!e.support.transition)return i.call(this);this.$element[r](0).one("bsTransitionEnd",e.proxy(i,this)).emulateTransitionEnd(t.TRANSITION_DURATION)},t.prototype.toggle=function(){this[this.$element.hasClass("in")?"hide":"show"]()},t.prototype.getParent=function(){return e(this.options.parent).find('[data-toggle="collapse"][data-parent="'+this.options.parent+'"]').each(e.proxy(function(t,r){var i=e(r);this.addAriaAndCollapsedClass(n(i),i)},this)).end()},t.prototype.addAriaAndCollapsedClass=function(e,t){var n=e.hasClass("in");e.attr("aria-expanded",n),t.toggleClass("collapsed",!n).attr("aria-expanded",n)};var i=e.fn.collapse;e.fn.collapse=r,e.fn.collapse.Constructor=t,e.fn.collapse.noConflict=function(){return e.fn.collapse=i,this},e(document).on("click.bs.collapse.data-api",'[data-toggle="collapse"]',function(t){var i=e(this);i.attr("data-target")||t.preventDefault();var s=n(i),o=s.data("bs.collapse"),u=o?"toggle":i.data();r.call(s,u)})}(e)}),require(["jquery","modal","dropdown","transition","collapse"]),define("bootstrap",function(){}),define("bsAlert",["jquery","bootstrap"],function(e){function t(t){if(!e("#alert-modal").length){var n='<div class="modal fade" id="alert-modal" tabindex="-1" role="dialog"> <div class="modal-dialog modal-sm"> <div class="modal-content"> <div class="modal-header"> <button type="button" class="close" data-dismiss="modal" aria-label="Close"><spanaria-hidden="true">&times;</span></button> <h4 class="modal-title">提示</h4> </div> <div class="modal-body"> <p id="modal-text"></p> </div> <div class="modal-footer"> <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> </div> </div> </div> </div>';e("body").append(n)}e("#modal-text").html(t),e("#alert-modal").modal()}return t}),define("csrfToken",[],function(){function e(e){var t=e+"=",n=document.cookie.split(";");for(var r=0;r<n.length;r++){var i=n[r];while(i.charAt(0)==" ")i=i.substring(1);if(i.indexOf(t)!=-1)return i.substring(t.length,i.length)}return""}function t(){arguments.length==2?arguments[0].setRequestHeader("X-CSRFToken",e("csrftoken")):arguments.length==3&&(arguments[2]["X-CSRFToken"]=e("csrftoken"))}return t}),!function(e,t){typeof define=="function"&&define.amd?define("validator",["jquery"],t):t(e.jQuery)}(this,function(e){"use strict";function n(n){return this.each(function(){var r=e(this),i=e.extend({},t.DEFAULTS,r.data(),typeof n=="object"&&n),s=r.data("bs.validator");if(!s&&n=="destroy")return;s||r.data("bs.validator",s=new t(this,i)),typeof n=="string"&&s[n]()})}var t=function(n,r){this.$element=e(n),this.options=r,r.errors=e.extend({},t.DEFAULTS.errors,r.errors);for(var i in r.custom)if(!r.errors[i])throw new Error("Missing default error message for custom validator: "+i);e.extend(t.VALIDATORS,r.custom),this.$element.attr("novalidate",!0),this.toggleSubmit(),this.$element.on("input.bs.validator change.bs.validator focusout.bs.validator",e.proxy(this.validateInput,this)),this.$element.on("submit.bs.validator",e.proxy(this.onSubmit,this)),this.$element.find("[data-match]").each(function(){var t=e(this),n=t.data("match");e(n).on("input.bs.validator",function(e){t.val()&&t.trigger("input.bs.validator")})})};t.INPUT_SELECTOR=':input:not([type="submit"], button):enabled:visible',t.DEFAULTS={delay:500,html:!1,disable:!0,custom:{},errors:{match:"Does not match",minlength:"Not long enough"},feedback:{success:"glyphicon-ok",error:"glyphicon-remove"}},t.VALIDATORS={"native":function(e){var t=e[0];return t.checkValidity?t.checkValidity():!0},match:function(t){var n=t.data("match");return!t.val()||t.val()===e(n).val()},minlength:function(e){var t=e.data("minlength");return!e.val()||e.val().length>=t}},t.prototype.validateInput=function(t){var n=e(t.target),r=n.data("bs.validator.errors"),i;n.is('[type="radio"]')&&(n=this.$element.find('input[name="'+n.attr("name")+'"]')),this.$element.trigger(t=e.Event("validate.bs.validator",{relatedTarget:n[0]}));if(t.isDefaultPrevented())return;var s=this;this.runValidators(n).done(function(i){n.data("bs.validator.errors",i),i.length?s.showErrors(n):s.clearErrors(n);if(!r||i.toString()!==r.toString())t=i.length?e.Event("invalid.bs.validator",{relatedTarget:n[0],detail:i}):e.Event("valid.bs.validator",{relatedTarget:n[0],detail:r}),s.$element.trigger(t);s.toggleSubmit(),s.$element.trigger(e.Event("validated.bs.validator",{relatedTarget:n[0]}))})},t.prototype.runValidators=function(n){function o(e){return n.data(e+"-error")||n.data("error")||e=="native"&&n[0].validationMessage||s.errors[e]}var r=[],i=e.Deferred(),s=this.options;return n.data("bs.validator.deferred")&&n.data("bs.validator.deferred").reject(),n.data("bs.validator.deferred",i),e.each(t.VALIDATORS,e.proxy(function(e,t){if((n.data(e)||e=="native")&&!t.call(this,n)){var i=o(e);!~r.indexOf(i)&&r.push(i)}},this)),!r.length&&n.val()&&n.data("remote")?this.defer(n,function(){var t={};t[n.attr("name")]=n.val(),e.get(n.data("remote"),t).fail(function(e,t,n){r.push(o("remote")||n)}).always(function(){i.resolve(r)})}):i.resolve(r),i.promise()},t.prototype.validate=function(){var e=this.options.delay;return this.options.delay=0,this.$element.find(t.INPUT_SELECTOR).trigger("input.bs.validator"),this.options.delay=e,this},t.prototype.showErrors=function(t){var n=this.options.html?"html":"text";this.defer(t,function(){var r=t.closest(".form-group"),i=r.find(".help-block.with-errors"),s=r.find(".form-control-feedback"),o=t.data("bs.validator.errors");if(!o.length)return;o=e("<ul/>").addClass("list-unstyled").append(e.map(o,function(t){return e("<li/>")[n](t)})),i.data("bs.validator.originalContent")===undefined&&i.data("bs.validator.originalContent",i.html()),i.empty().append(o),r.addClass("has-error"),s.length&&s.removeClass(this.options.feedback.success)&&s.addClass(this.options.feedback.error)&&r.removeClass("has-success")})},t.prototype.clearErrors=function(e){var t=e.closest(".form-group"),n=t.find(".help-block.with-errors"),r=t.find(".form-control-feedback");n.html(n.data("bs.validator.originalContent")),t.removeClass("has-error"),r.length&&r.removeClass(this.options.feedback.error)&&r.addClass(this.options.feedback.success)&&t.addClass("has-success")},t.prototype.hasErrors=function(){function n(){return!!(e(this).data("bs.validator.errors")||[]).length}return!!this.$element.find(t.INPUT_SELECTOR).filter(n).length},t.prototype.isIncomplete=function(){function n(){return this.type==="checkbox"?!this.checked:this.type==="radio"?!e('[name="'+this.name+'"]:checked').length:e.trim(this.value)===""}return!!this.$element.find(t.INPUT_SELECTOR).filter("[required]").filter(n).length},t.prototype.onSubmit=function(e){this.validate(),(this.isIncomplete()||this.hasErrors())&&e.preventDefault()},t.prototype.toggleSubmit=function(){if(!this.options.disable)return;var t=e('button[type="submit"], input[type="submit"]').filter('[form="'+this.$element.attr("id")+'"]').add(this.$element.find('input[type="submit"], button[type="submit"]'));t.toggleClass("disabled",this.isIncomplete()||this.hasErrors())},t.prototype.defer=function(t,n){n=e.proxy(n,this);if(!this.options.delay)return n();window.clearTimeout(t.data("bs.validator.timeout")),t.data("bs.validator.timeout",window.setTimeout(n,this.options.delay))},t.prototype.destroy=function(){return this.$element.removeAttr("novalidate").removeData("bs.validator").off(".bs.validator"),this.$element.find(t.INPUT_SELECTOR).off(".bs.validator").removeData(["bs.validator.errors","bs.validator.deferred"]).each(function(){var t=e(this),n=t.data("bs.validator.timeout");window.clearTimeout(n)&&t.removeData("bs.validator.timeout")}),this.$element.find(".help-block.with-errors").each(function(){var t=e(this),n=t.data("bs.validator.originalContent");t.removeData("bs.validator.originalContent").html(n)}),this.$element.find('input[type="submit"], button[type="submit"]').removeClass("disabled"),this.$element.find(".has-error").removeClass("has-error"),this};var r=e.fn.validator;e.fn.validator=n,e.fn.validator.Constructor=t,e.fn.validator.noConflict=function(){return e.fn.validator=r,this},e(window).on("load",function(){e('form[data-toggle="validator"]').each(function(){var t=e(this);n.call(t,t.data())})})}),require(["jquery","bsAlert","csrfToken","validator"],function(e,t,n){var r=!1;e("form").validator().on("submit",function(r){if(!r.isDefaultPrevented()){var i=e("#username").val(),s=e("#password").val(),o=e("#tfa-code").val();return console.log(o),o.length&&o.length!=6?(t("验证码为六位数字"),!1):(e.ajax({beforeSend:n,url:"/api/login/",data:{username:i,password:s,tfa_code:o},dataType:"json",method:"post",success:function(n){if(!n.code){if(n.data=="tfa_required")return e("#tfa-area").show(),!1;function r(e){var t=unescape(location.search).split(e+"=")[1]||"";return t.indexOf("&")>=0?t.split("&")[0]:t}var i=r("__from");i!=""?window.location.href=i:location.href="/"}else t(n.data)},error:function(){t("额 好像出错了，请刷新页面重试。如还有问题，请填写页面导航栏上的反馈。")}}),!1)}})}),define("login_11_pack",function(){});