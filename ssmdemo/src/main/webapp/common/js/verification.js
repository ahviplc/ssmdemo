/** 
 * 验证
 * $Author: ZDK
 * $Id: verfication.js 
 * $Time : 2016-05-25 17:42:00
*/


/**
 * 错误提示对象
 */
errorTips = {
	userNameNull : "请输入登陆账号！", passwordNull : "请输入密码！", roleNull : "请选择角色!", mobileWrong : "请输入正确的手机号！", passwordWrong : "密码长度为(6-20)位！", passwordNosame : "两次密码不一样！", notNull : "此处为必填", PhoneWrong : "请输入正确的联系电话", emailWrong : "请输入正确的电子邮箱", timesWrong : "结束时间不能比开始时间小", imagesTypeWrong : "图片类型必须是gif,jpeg,jpg,png中的一种", imagesSizeWrong : "图片大小不可以超过1M", categoryNotNull : "一、二、三级为必选项", sourceNotNull : "案件来源不能为空", numberWrong : "只能输入数字", number1Wrong : "只能输入一位数字", number4Wrong : "只能输入四位数字", numberOrletterWrong : "只能输入数字和字母"
};


/**
 * 提交条件对象
 */
submitEffect = {
	userName : false, password : false, password2 : false, userPassword : false, role : false, userPhone : false, userType : false, signupName : false, signupNum : false, signupSex : false, signupParam : false, signupNj : false, signupBj : false, signupPhone : false, signupProfile : false, signupEnergy : false, signupCause : false, discussCaseId : false, student : false, discussName : false, discussNameDes : false, CaseNote : false,  condition1 : false, condition2 : false, condition3 : false, condition4 : false, condition5 : false, condition6 : false, condition7 : false, condition8 : false, condition9 : false, condition10 : false
};


/**
 * 正则表达式对象
 */
regular = {
	trimStr : /(^\s*)|(\s*$)/g,
	mobile : /^(1[3-9])[0-9]{9}$/,
	phone : /^([0-9]{3,4}-)?[0-9]{7,8}$/,
	password : /^[\dA-Za-z(!@#$%&)]{6,20}$/,
	email : /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/,
	images : /.(gif|jpg|jpeg|png|gif|jpg|png)$/
};


/**
 * 登录验证提交
 */
$("#login-btn").click(function(){
	// 验证用户名
	if(inputIsNull("userId")){
		errorTip("user-name-tips",errorTips.userNameNull);
		submitEffect.userName = false;
	}else{
		errorTip("user-name-tips","");
		submitEffect.userName = true;
	}
	// 验证密码
	if(inputIsNull("password")){
		errorTip("password-tips",errorTips.passwordNull);
		submitEffect.password = false;
	}else{
		errorTip("password-tips","");
		submitEffect.password = true;
	}
	// 验证角色
	/*if(inputIsNull("role")){
		errorTip("role-tips",errorTips.roleNull);
		submitEffect.role = false;
		return false;
	}else{
		errorTip("role-tips","");
		submitEffect.role = true;
	}*/
	// 基础验证通过提交表单
	if(submitEffect.userName && submitEffect.password){
		$("#login-form").submit();
	}
});


/**
 * 注册验证提交
 */
$("#register-btn").click(function(){
	// 验证手机号
	if(inputIsNull("user-emial")){
		errorTip("user-emial-tips",errorTips.notNull);
		submitEffect.userEmial = false;
	}else if(!(regular.email.test($("#user-emial").val()))){
		errorTip("user-emial-tips",errorTips.mobileWrong);
		submitEffect.userEmial = false;
	}else{
		errorTip("user-emial-tips","");
		submitEffect.userEmial = true;
	}
	// 验证密码
	if(inputIsNull("user-password")){
		errorTip("user-password-tips",errorTips.notNull);
		submitEffect.password = false;
	}else if(!(regular.password.test($("#user-password").val()))){
		errorTip("user-password-tips",errorTips.passwordWrong);
		submitEffect.password = false;
	}else{
		errorTip("user-password-tips","");
		submitEffect.password = true;
	}
	// 验证密码确认
	if(inputIsNull("password2")){
		errorTip("password2-tips",errorTips.notNull);
		submitEffect.password2 = false;
	}else if($("#password2").val() != $("#user-password").val()){
		errorTip("password2-tips",errorTips.passwordUnlike);
		submitEffect.password2 = false;
	}else{
		errorTip("password2-tips","");
		submitEffect.password2 = true;
	}
	// 验证角色
	/*if(inputIsNull("user-type")){
		errorTip("user-type-tips",errorTips.roleNull);
		submitEffect.userType = false;
		return false;
	}else{
		errorTip("user-type-tips","");
		submitEffect.userType = true;
	}*/
	// 基础验证通过提交表单
	if(submitEffect.userEmial && submitEffect.password && submitEffect.password2){
		$("#register-from").submit();
	}
});


/**
 * 注册后-学生完善用户资料
 */
$("#add-person-user-btn-s").click(function(){
	// 验证姓名
	if(inputIsNull("person-name")){
		errorTip("person-name-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("person-name-tips","");
		submitEffect.condition1 = true;
	}
	// 验证账号
	if(inputIsNull("person-num")){
		errorTip("person-num-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else if(!/^[a-zA-Z0-9]*$/.test($("#person-num").val())){
		errorTip("person-num-tips",errorTips.numberOrletterWrong);
		submitEffect.condition2 = false;
	}else{
		errorTip("person-num-tips","");
		submitEffect.condition2 = true;
	}
	// 验证性别
	if($('input:radio[name="personVo.personSex"]:checked').val() == "" || $('input:radio[name="personVo.personSex"]:checked').val() == undefined){
		errorTip("person-sex-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("person-sex-tips","");
		submitEffect.condition3 = true;
	}
	// 验证地址
	if(inputIsNull("person-address")){
		errorTip("person-address-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("person-address-tips","");
		submitEffect.condition4 = true;
	}
	// 验证邮件
	if(inputIsNull("person-email")){
		errorTip("person-email-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else if(!(regular.email.test($("#person-email").val()))){
		errorTip("person-email-tips",errorTips.emailWrong);
		submitEffect.condition5 = false;
	}else{
		errorTip("person-email-tips","");
		submitEffect.condition5 = true;
	}
	// 验证微信账号
	if(inputIsNull("person-message")){
		errorTip("person-message-tips",errorTips.notNull);
		submitEffect.condition6 = false;
	}else{
		errorTip("person-message-tips","");
		submitEffect.condition6 = true;
	}
	// 验证院系
	if(inputIsNull("person-yx")){
		errorTip("person-yx-tips",errorTips.notNull);
		submitEffect.condition7 = false;
	}else{
		errorTip("person-yx-tips","");
		submitEffect.condition7 = true;
	}
	// 验证年级
	if(inputIsNull("person-nj")){
		errorTip("person-nj-tips",errorTips.notNull);
		submitEffect.condition8 = false;
	}else if(!/^[0-9]{4}$/.test($("#person-nj").val())){
		errorTip("person-nj-tips",errorTips.number4Wrong);
		submitEffect.condition8 = false;
	}else{
		errorTip("person-nj-tips","");
		submitEffect.condition8 = true;
	}
	// 验证班级
	if(inputIsNull("person-bj")){
		errorTip("person-bj-tips",errorTips.notNull);
		submitEffect.condition9 = false;
	}else if(!/^[0-9]{1}$/.test($("#person-bj").val())){
		errorTip("person-bj-tips",errorTips.number1Wrong);
		submitEffect.condition9 = false;
	}else{
		errorTip("person-bj-tips","");
		submitEffect.condition9 = true;
	}
	
	// 基础验证通过提交表单
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5 && submitEffect.condition6 && submitEffect.condition7 && submitEffect.condition8 && submitEffect.condition9){
		$("#form-horizontal").submit();
	}
});


/**
 * 注册后-教师完善用户资料
 */
$("#add-person-user-btn-t").click(function(){
	// 验证姓名
	if(inputIsNull("person-name")){
		errorTip("person-name-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("person-name-tips","");
		submitEffect.condition1 = true;
	}
	// 验证账号
	if(inputIsNull("person-num")){
		errorTip("person-num-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("person-num-tips","");
		submitEffect.condition2 = true;
	}
	// 验证性别
	if($('input:radio[name="personVo.personSex"]:checked').val() == "" || $('input:radio[name="personVo.personSex"]:checked').val() == undefined){
		errorTip("person-sex-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("person-sex-tips","");
		submitEffect.condition3 = true;
	}
	// 验证地址
	if(inputIsNull("person-address")){
		errorTip("person-address-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("person-address-tips","");
		submitEffect.condition4 = true;
	}
	// 验证邮件
	if(inputIsNull("person-email")){
		errorTip("person-email-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else if(!(regular.email.test($("#person-email").val()))){
		errorTip("person-email-tips",errorTips.emailWrong);
		submitEffect.condition5 = false;
	}else{ 
		errorTip("person-email-tips","");
		submitEffect.condition5 = true;
	}
	// 验证微信账号
	if(inputIsNull("person-message")){
		errorTip("person-message-tips",errorTips.notNull);
		submitEffect.condition6 = false;
	}else{
		errorTip("person-message-tips","");
		submitEffect.condition6 = true;
	}
	// 基础验证通过提交表单
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5 && submitEffect.condition6){
		$("#form-horizontal").submit();
	}
});


/**
 * 登录后-学生补全用户资料
 */
$("#addPerson-info-s").click(function(){
	// 验证姓名
	if(inputIsNull("person-name")){
		errorTip("person-name-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("person-name-tips","");
		submitEffect.condition1 = true;
	}
	// 验证账号
	if(inputIsNull("person-num")){
		errorTip("person-num-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else if(!/^[a-zA-Z0-9]*$/.test($("#person-num").val())){
		errorTip("person-num-tips",errorTips.numberOrletterWrong);
		submitEffect.condition2 = false;
	}else{
		errorTip("person-num-tips","");
		submitEffect.condition2 = true;
	}
	// 验证性别
	if($('input:radio[name="personVo.personSex"]:checked').val() == "" || $('input:radio[name="personVo.personSex"]:checked').val() == undefined){
		errorTip("person-sex-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("person-sex-tips","");
		submitEffect.condition3 = true;
	}
	// 验证地址
	if(inputIsNull("person-address")){
		errorTip("person-address-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("person-address-tips","");
		submitEffect.condition4 = true;
	}
	// 验证邮件
	if(inputIsNull("person-email")){
		errorTip("person-email-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else if(!(regular.email.test($("#person-email").val()))){
		errorTip("person-email-tips",errorTips.emailWrong);
		submitEffect.condition5 = false;
	}else{
		errorTip("person-email-tips","");
		submitEffect.condition5 = true;
	}
	// 验证微信账号
	if(inputIsNull("person-message")){
		errorTip("person-message-tips",errorTips.notNull);
		submitEffect.condition6 = false;
	}else{
		errorTip("person-message-tips","");
		submitEffect.condition6 = true;
	}
	// 验证院系
	if(inputIsNull("person-yx")){
		errorTip("person-yx-tips",errorTips.notNull);
		submitEffect.condition7 = false;
	}else{
		errorTip("person-yx-tips","");
		submitEffect.condition7 = true;
	}
	// 验证年级
	if(inputIsNull("person-nj")){
		errorTip("person-nj-tips",errorTips.notNull);
		submitEffect.condition8 = false;
	}else if(!/^[0-9]{4}$/.test($("#person-nj").val())){
		errorTip("person-nj-tips",errorTips.number4Wrong);
		submitEffect.condition8 = false;
	}else{
		errorTip("person-nj-tips","");
		submitEffect.condition8 = true;
	}
	// 验证班级
	if(inputIsNull("person-bj")){
		errorTip("perso-bj-tips",errorTips.notNull);
		submitEffect.condition9 = false;
	}else if(!/^[0-9]{1}$/.test($("#person-bj").val())){
		errorTip("person-bj-tips",errorTips.number1Wrong);
		submitEffect.condition9 = false;
	}else{
		errorTip("person-bj-tips","");
		submitEffect.condition9 = true;
	}
	// 验证手机
	if(inputIsNull("person-phone")){
		errorTip("person-phone-tips",errorTips.notNull);
		submitEffect.condition10 = false;
	}else if(!(regular.mobile.test($("#person-phone").val()))){
		errorTip("person-phone-tips",errorTips.mobileWrong);
		submitEffect.condition10 = false;
	}else{
		errorTip("person-phone-tips","");
		submitEffect.condition10 = true;
	}
	// 基础验证通过提交表单
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5 && submitEffect.condition6 && submitEffect.condition7 && submitEffect.condition8 && submitEffect.condition9 && submitEffect.condition10){
		$("#form-addPerson-info").submit();
	}
});



/**
 * 登录后-教师完善用户资料
 */
$("#addPerson-info-t").click(function(){
	// 验证姓名
	if(inputIsNull("person-name")){
		errorTip("person-name-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("person-name-tips","");
		submitEffect.condition1 = true;
	}
	// 验证账号
	if(inputIsNull("person-num")){
		errorTip("person-num-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("person-num-tips","");
		submitEffect.condition2 = true;
	}
	// 验证性别
	if($('input:radio[name="personVo.personSex"]:checked').val() == "" || $('input:radio[name="personVo.personSex"]:checked').val() == undefined){
		errorTip("person-sex-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("person-sex-tips","");
		submitEffect.condition3 = true;
	}
	// 验证地址
	if(inputIsNull("person-address")){
		errorTip("person-address-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("person-address-tips","");
		submitEffect.condition4 = true;
	}
	// 验证邮件
	if(inputIsNull("person-email")){
		errorTip("person-email-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else if(!(regular.email.test($("#person-email").val()))){
		errorTip("person-email-tips",errorTips.emailWrong);
		submitEffect.condition5 = false;
	}else{
		errorTip("person-email-tips","");
		submitEffect.condition5 = true;
	}
	// 验证微信账号
	if(inputIsNull("person-message")){
		errorTip("person-message-tips",errorTips.notNull);
		submitEffect.condition6 = false;
	}else{
		errorTip("person-message-tips","");
		submitEffect.condition6 = true;
	}
	// 验证手机
	if(inputIsNull("person-phone")){
		errorTip("person-phone-tips",errorTips.notNull);
		submitEffect.condition7 = false;
	}else if(!(regular.mobile.test($("#person-phone").val()))){
		errorTip("person-phone-tips",errorTips.mobileWrong);
		submitEffect.condition7 = false;
	}else{
		errorTip("person-phone-tips","");
		submitEffect.condition7 = true;
	}
	// 基础验证通过提交表单
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5 && submitEffect.condition6 && submitEffect.condition7){
		$("#form-addPerson-info").submit();
	}
});


/**
 * 密码找回-未完成
 */
$(function(){
	$("#send_1").click(function(){
		$("#show_1").show();
	});
});


/**
 * 密码找回-提交手机验证码
 */
$("#velidate-message-btn").click(function(){
	// 验证手机号
	if(inputIsNull("phone")){
		errorTip("tel-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else if(!(regular.mobile.test($("#phone").val()))){
		errorTip("tel-tips",errorTips.mobileWrong);
		submitEffect.condition1 = false;
	}else{
		errorTip("tel-tips","");
		submitEffect.condition1 = true;
	}
	// 验证验证码
	if(inputIsNull("ver-code")){
		errorTip("code-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("code-tips","");
		submitEffect.condition2 = true;
	}
	// 基础验证通过提交表单
	if(submitEffect.condition1 && submitEffect.condition2){
		$("#form-velidate-message").submit();
	}
});


/**
 * 密码找回-密码重置
 */
$("#reset-password-btn").click(function(){
	// 验证密码
	if(inputIsNull("password")){
		errorTip("password-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else if(!(regular.password.test($("#password").val()))){
		errorTip("password-tips",errorTips.passwordWrong);
		submitEffect.condition1 = false;
	}else{
		errorTip("password-tips","");
		submitEffect.condition1 = true;
	}
	// 验证再次输入密码
	if(inputIsNull("password-again")){
		errorTip("password-again-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else if($("#password-again").val() != $("#password").val()){
		errorTip("password-again-tips",errorTips.passwordNosame);
		submitEffect.condition2 = false;
	}else{
		errorTip("password-again-tips","");
		submitEffect.condition2 = true;
	}
	// 基础验证通过提交表单
	if(submitEffect.condition1 && submitEffect.condition2){
		$("#form-reset-password").submit();
	}
});



/**
 * 填写报名信息返回上一步
 */
$("#back_listkc,#go-back").click(function(){
	window.history.go(-1);
});


/**
 * 提交报名信息
 */
$("#sign-up-btn").click(function(){
	
	// 判断图片不为空则获取其大小
	if($('#signup-upload-url').val() != ""){
		file = $('#signup-upload-url').get(0).files[0];
		fileSize = (Math.round(file.size * 100 / 1024) / 100).toString(); //获取图片大小
	}
	// 验证姓名
	if(inputIsNull("signup-name")){
		errorTip("signup-name-tips",errorTips.notNull);
		submitEffect.signupName = false;
	}else{
		errorTip("signup-name-tips","");
		submitEffect.signupName = true;
	}
	// 验证学号
	if(inputIsNull("signup-num")){
		errorTip("signup-num-tips",errorTips.notNull);
		submitEffect.signupNum = false;
	}else{
		errorTip("signup-num-tips","");
		submitEffect.signupNum = true;
	}
	// 验证性别
	if($('input:radio[name="signupVo.signupSex"]:checked').val() == "" || $('input:radio[name="signupVo.signupSex"]:checked').val() == undefined){
		errorTip("signup-sex-tips",errorTips.notNull);
		submitEffect.signupSex = false;
	}else{
		errorTip("signup-sex-tips","");
		submitEffect.signupSex = true;
	}
	// 验证所在院系
	if(inputIsNull("signup-param")){
		errorTip("signup-param-tips",errorTips.notNull);
		submitEffect.signupParam = false;
	}else{
		errorTip("signup-param-tips","");
		submitEffect.signupParam = true;
	}
	// 验证所在年级
	if(inputIsNull("signup-nj")){
		errorTip("signup-nj-tips",errorTips.notNull);
		submitEffect.signupNj = false;
	}else if(!/^[0-9]{4}$/.test($("#signup-nj").val())){
		errorTip("signup-nj-tips",errorTips.number4Wrong);
		submitEffect.signupNj = false;
	}else{
		errorTip("signup-nj-tips","");
		submitEffect.signupNj = true;
	}
	// 验证所在班级
	if(inputIsNull("signup-bj")){
		errorTip("signup-bj-tips",errorTips.notNull);
		submitEffect.signupBj = false;
	}else if(!/^[0-9]{1}$/.test($("#signup-bj").val())){
		errorTip("signup-bj-tips",errorTips.number1Wrong);
		submitEffect.signupBj = false;
	}else{
		errorTip("signup-bj-tips","");
		submitEffect.signupBj = true;
	}
	// 验证联系电话
	if(inputIsNull("signup-phone")){
		errorTip("signup-phone-tips",errorTips.notNull);
		submitEffect.signupPhone = false;
	}else if(!(regular.mobile.test($("#signup-phone").val()) || regular.phone.test($("#signup-phone").val()))){
		errorTip("signup-phone-tips",errorTips.PhoneWrong);
		submitEffect.signupPhone = false;
	}else{
		errorTip("signup-phone-tips","");
		submitEffect.signupPhone = true;
	}
	// 验证Email
	if(inputIsNull("signup-email")){
		errorTip("signup-email-tips",errorTips.notNull);
		submitEffect.signupEmail = false;
	}else if(!(regular.email.test($("#signup-email").val()))){
		errorTip("signup-email-tips",errorTips.emailWrong);
		submitEffect.signupEmail = false;
	}else{
		errorTip("signup-email-tips","");
		submitEffect.signupEmail = true;
	}
	//验证个人简介
	if(inputIsNull("signup-profile")){
		errorTip("signup-profile-tips",errorTips.notNull);
		submitEffect.signupProfile = false;
	}else{
		errorTip("signup-profile-tips","");
		submitEffect.signupProfile = true;
	}
	//验证主要经历
	if(inputIsNull("signup-energy")){
		errorTip("signup-energy-tips",errorTips.notNull);
		submitEffect.signupEnergy = false;
	}else{
		errorTip("signup-energy-tips","");
		submitEffect.signupEnergy = true;
	}
	// 验证报名原因
	if(inputIsNull("signup-cause")){
		errorTip("signup-cause-tips",errorTips.notNull);
		submitEffect.signupCause = false;
	}else{
		errorTip("signup-cause-tips","");
		submitEffect.signupCause = true;
	}
	// 验证成绩单
	if(inputIsNull("signup-upload-url")){
		errorTip("signup-upload-url-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else if(!(regular.images.test($("#signup-upload-url").val()))){
		errorTip("signup-upload-url-tips",errorTips.imagesTypeWrong);
		submitEffect.condition1 = false;
	}else if(fileSize > 1024){
		errorTip("signup-upload-url-tips",errorTips.imagesSizeWrong);
		submitEffect.condition1 = false;
	}else{
		errorTip("signup-upload-url-tips","");
		submitEffect.condition1 = true;
	}
	// 校验通过提交表单
	if(submitEffect.signupName && submitEffect.signupNum && submitEffect.signupSex && submitEffect.signupParam && submitEffect.signupNj && submitEffect.signupBj && submitEffect.signupPhone && submitEffect.signupEmail && submitEffect.signupProfile && submitEffect.signupEnergy && submitEffect.signupCause && submitEffect.condition1){
		$("#sign-up-btn").attr("disabled",true);
		$("#form-horizontal").submit();
		setTimeout(function(){
			$("#sign-up-btn").removeAttr("disabled");
		},5000);
	}
});


/**
 * 创建值班信息
 */
$("#addduty-btn").click(function(){
	var dutyDateBegin = $("#duty-date-begin").val(); // 开始时间
	var dutyDateBegins = (new Date(dutyDateBegin)).getTime(); // 开始时间戳
	var dutyDateEnd = $("#duty-date-end").val(); //结束时间
	var dutyDateEnds = (new Date(dutyDateEnd)).getTime(); // 结束时间戳
	// 结束日期
	if(inputIsNull("duty-date-end")){
		errorTip("duty-date-end-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else if(dutyDateEnd < dutyDateBegin){
		errorTip("duty-date-end-tips",errorTips.timesWrong);
		submitEffect.condition1 = false;
	}else{
		errorTip("duty-date-end-tips","");
		submitEffect.condition1 = true;
	}
	// 验证接待组别
	if(inputIsNull("select")){
		errorTip("select-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("select-tips","");
		submitEffect.condition2 = true;
	}
	// 验证接待组员
	if(inputIsNull("input2")){
		errorTip("input2-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("input2-tips","");
		submitEffect.condition3 = true;
	}
	// 验证小组负责人
	if(inputIsNull("select4")){
		errorTip("select4-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("select4-tips","");
		submitEffect.condition4 = true;
	}
	// 验证联系方式
	if(inputIsNull("dutyPhone")){
		errorTip("dutyPhone-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else if(!(regular.mobile.test($("#dutyPhone").val()))){
		errorTip("dutyPhone-tips",errorTips.mobileWrong);
		submitEffect.condition5 = false;
	}else{
		errorTip("dutyPhone-tips","");
		submitEffect.condition5 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5){
		$("#mainForm").submit();
	}
});


/**
 * 修改值班信息
 */
$("#update-duty-btn").click(function(){
	var dutyDateBegin = $("#duty-date-begin").val(); // 开始时间
	var dutyDateBegins = (new Date(dutyDateBegin)).getTime(); // 开始时间戳
	var dutyDateEnd = $("#duty-date-end").val(); //结束时间
	var dutyDateEnds = (new Date(dutyDateEnd)).getTime(); // 结束时间戳
		
	// 结束日期
	if(inputIsNull("duty-date-end")){
		errorTip("duty-date-end-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else if(dutyDateEnd < dutyDateBegin){
		errorTip("duty-date-end-tips",errorTips.timesWrong);
		submitEffect.condition1 = false;
	}else{
		errorTip("duty-date-end-tips","");
		submitEffect.condition1 = true;
	}
	// 验证接待组别
	if(inputIsNull("select")){
		errorTip("select-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("select-tips","");
		submitEffect.condition2 = true;
	}
	// 验证接待组员
	if(inputIsNull("input2")){
		errorTip("input2-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("input2-tips","");
		submitEffect.condition3 = true;
	}
	// 验证小组负责人
	if(inputIsNull("select4")){
		errorTip("select4-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("select4-tips","");
		submitEffect.condition4 = true;
	}
	// 验证联系方式
	if(inputIsNull("dutyPhone")){
		errorTip("dutyPhone-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else if(!(regular.mobile.test($("#dutyPhone").val()))){
		errorTip("dutyPhone-tips",errorTips.mobileWrong);
		submitEffect.condition5 = false;
	}else{
		errorTip("dutyPhone-tips","");
		submitEffect.condition5 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5){
		$("#mainForm").submit();
	}
});



/**
 * 提交问卷
 */
$("#toAddTitle").click(function(){
	// 验证案件
	if(inputIsNull("title")){
		errorTip("title-tips",errorTips.notNull);
		submitEffect.title = false;
	}else{
		errorTip("title-tips","");
		submitEffect.title = true;
	}
	// 校验通过提交表单
	if(submitEffect.title){
		$("#form-horizontal").submit();
	}
});

/**
 * 提交问卷
 */
$("#toAddQuestion").click(function(){
	// 验证案件
	if(inputIsNull("name")){
		errorTip("name-tips",errorTips.notNull);
		submitEffect.name = false;
	}else{
		errorTip("name-tips","");
		submitEffect.name = true;
	}
	// 校验通过提交表单
	if(submitEffect.name){
		$("#form-horizontal").submit();
	}
});

/**
 * 提交密码修改
 */
$("#updatePassword").click(function(){
	// 验证原密码
	if(inputIsNull("password2")){
		errorTip("password2-tips",errorTips.notNull);
		submitEffect.password2 = false;
	}else{
		errorTip("password2-tips","");
		submitEffect.password2 = true;
	}
	// 验证新密码
	if(inputIsNull("userPassword")){
		errorTip("userPassword-tips",errorTips.notNull);
		submitEffect.userPassword = false;
	}else if(!(regular.password.test($("#userPassword").val()))){
		errorTip("userPassword-tips",errorTips.passwordWrong);
		submitEffect.userPassword = false;
	}else{
		errorTip("userPassword-tips","");
		submitEffect.userPassword = true;
	}
	// 验证再次输入密码
	if(inputIsNull("password")){
		errorTip("password-tips",errorTips.notNull);
		submitEffect.password = false;
	}else if($("#password").val() != $("#userPassword").val()){
		errorTip("password-tips",errorTips.passwordNosame);
		submitEffect.password = false;
	}else{
		errorTip("password-tips","");
		submitEffect.password = true;
	}
	// 校验通过提交表单
	if(submitEffect.password2 && submitEffect.userPassword && submitEffect.password){
		$("#form-updatePassword").submit();
	}
});


/**
 * 提交值班详情备注
 */
$("#toUpdateCaseNote").click(function(){
	// 验证备注
	if(inputIsNull("CaseNote")){
		errorTip("CaseNote-tips",errorTips.notNull);
		submitEffect.CaseNote = false;
	}else{
		errorTip("CaseNote-tips","");
		submitEffect.CaseNote = true;
	}
	// 校验通过提交表单
	if(submitEffect.CaseNote){
		$("#form-toUpdateCaseNote").submit();
	}
});


/**
 * 点击生成案件名
 */
$("#generate-case-name").click(function(){
	// 验证当事人姓名
	if(inputIsNull("case-pepole")){
		errorTip("casePepole-tips",errorTips.notNull);
		submitEffect.condition6 = false;
	}else{
		errorTip("casePepole-tips","");
		submitEffect.condition6 = true;
	}
	
	// 验证联动案件类型
	if(inputIsNull("category_one")){
		errorTip("aj-type-tips",errorTips.categoryNotNull);
		submitEffect.condition1 = false;
	}else if(inputIsNull("category_two")){
		errorTip("aj-type-tips",errorTips.categoryNotNull);
		submitEffect.condition1 = false;
	}else if(inputIsNull("category_three")){
		errorTip("aj-type-tips",errorTips.categoryNotNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("aj-type-tips","");
		submitEffect.condition1 = true;
	}

	// 校验通过提交表单
	if(submitEffect.condition1 && submitEffect.condition6){
		var case_pepole = $("#case-pepole").val();
		var category_one = $("#category_one").find("option:selected").text(); // 一级
		var category_two = $("#category_two").find("option:selected").text(); // 二级
		var category_three = $("#category_three").find("option:selected").text(); // 三级
		var category_four = $("#category_four").find("option:selected").text(); // 四级
		var category_four_val = $("#category_four").val(); // 四级val值
		var case_else = $("#case-else").val(); // 其他
		if(category_four_val != ""){
			$("#caseName").val(case_pepole + category_one + category_two + category_three + category_four + case_else);
		}else{
			$("#caseName").val(case_pepole + category_one + category_two + category_three + case_else);
		}
	}
});


/**
 * 创建案件
 */
$("#addCaseLaw").click(function(){
	subCase("#form-addCaseLaw");
});


/**
 * 修改案件
 */
$("#updateCaseLaw-btn").click(function(){
	subCase("#form-updateCaseLaw");
});


/**
 * 案情创建
 */
$("#addCaseDetail-btn").click(function(){
	// 验证联动案件类型
	if(inputIsNull("category_one")){
		errorTip("aj-type-tips",errorTips.categoryNotNull);
		submitEffect.condition1 = false;
	}else if(inputIsNull("category_two")){
		errorTip("aj-type-tips",errorTips.categoryNotNull);
		submitEffect.condition1 = false;
	}else if(inputIsNull("category_three")){
		errorTip("aj-type-tips",errorTips.categoryNotNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("aj-type-tips","");
		submitEffect.condition1 = true;
	}
	// 验证案件来源
	if(inputIsNull("select1")){
		errorTip("source-tips",errorTips.sourceNotNull);
		submitEffect.condition2 = false;
	}else if(inputIsNull("select2")){
		errorTip("source-tips",errorTips.sourceNotNull);
		submitEffect.condition2 = false;
	}
	/*else if(inputIsNull("detail-addre")){
		errorTip("source-tips",errorTips.sourceNotNull);
		submitEffect.condition2 = false;
	}
	else{
		errorTip("source-tips","");
		submitEffect.condition2 = true;
	}*/
	// 验证当事人姓名
	if(inputIsNull("case-pepole")){
		errorTip("casePepole-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("casePepole-tips","");
		submitEffect.condition3 = true;
	}
	// 验证当事人联系方式
	if(inputIsNull("caseDetailPepolePhone")){
		errorTip("caseDetailPepolePhone-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else if(!(regular.mobile.test($("#caseDetailPepolePhone").val()))){
		errorTip("caseDetailPepolePhone-tips",errorTips.mobileWrong);
		submitEffect.condition4 = false;
	}else{
		errorTip("caseDetailPepolePhone-tips","");
		submitEffect.condition4 = true;
	}
	// 验证当事人性别
	if($('input:radio[name="caseDetailVo.caseDetailPepoleSex"]:checked').val() == "" || $('input:radio[name="caseDetailVo.caseDetailPepoleSex"]:checked').val() == undefined){
		errorTip("caseDetailPepoleSex-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else{
		errorTip("caseDetailPepoleSex-tips","");
		submitEffect.condition5 = true;
	}
	// 验证当事人年龄
	if(inputIsNull("caseDetailPepoleAge")){
		errorTip("caseDetailPepoleAge-tips",errorTips.notNull);
		submitEffect.condition6 = false;
	}else{
		errorTip("caseDetailPepoleAge-tips","");
		submitEffect.condition6 = true;
	}
	// 验证当事人民族
	if(inputIsNull("paramByCaseDetailPepoleFam")){
		errorTip("paramByCaseDetailPepoleFam-tips",errorTips.notNull);
		submitEffect.condition7 = false;
	}else{
		errorTip("paramByCaseDetailPepoleFam-tips","");
		submitEffect.condition7 = true;
	}
	// 验证当事人职业
	if(inputIsNull("caseDetailPepoleWork")){
		errorTip("caseDetailPepoleWork-tips",errorTips.notNull);
		submitEffect.condition8 = false;
	}else{
		errorTip("caseDetailPepoleWork-tips","");
		submitEffect.condition8 = true;
	}
	// 验证接待组别
	if(inputIsNull("select_1")){
		errorTip("select_1-tips",errorTips.notNull);
		submitEffect.condition9 = false;
	}else{
		errorTip("select_1-tips","");
		submitEffect.condition9 = true;
	}
	// 验证接待组员
	if(inputIsNull("input2")){
		errorTip("input1-tips",errorTips.notNull);
		submitEffect.condition10 = false;
	}else{
		errorTip("input1-tips","");
		submitEffect.condition10 = true;
	}
	// 验证接待方式
	if(inputIsNull("paramByCaseDetailPepoleRece")){
		errorTip("paramByCaseDetailPepoleRece-tips",errorTips.notNull);
		submitEffect.condition11 = false;
	}else{
		errorTip("paramByCaseDetailPepoleRece-tips","");
		submitEffect.condition11 = true;
	}
	// 验证指导老师
	if(inputIsNull("caseDetailVoT")){
		errorTip("caseDetailVoT-tips",errorTips.notNull);
		submitEffect.condition12 = false;
	}else{
		errorTip("caseDetailVoT-tips","");
		submitEffect.condition12 = true;
	}
	// 验证案情简述
	if(inputIsNull("caseDetailName")){
		errorTip("caseDetailName-tips",errorTips.notNull);
		submitEffect.condition13 = false;
	}else{
		errorTip("caseDetailName-tips","");
		submitEffect.condition13 = true;
	}
	// 通过验证提交表单
	if(submitEffect.condition1 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5 && submitEffect.condition6 && submitEffect.condition7 && submitEffect.condition8 && submitEffect.condition9 && submitEffect.condition10 && submitEffect.condition11 && submitEffect.condition12 && submitEffect.condition13){
		$("#form-addCaseDetail").submit();
	}
});


/**
 * 证据创建
 */
$("#addCaseProof-btn").click(function(){
	// 验证证据名称
	if(inputIsNull("caseProofName")){
		errorTip("caseProofName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("caseProofName-tips","");
		submitEffect.condition1 = true;
	}
	// 验证证据来源
	if(inputIsNull("caseProofSource")){
		errorTip("caseProofSource-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("caseProofSource-tips","");
		submitEffect.condition2 = true;
	}
	// 验证证据类型
	if(inputIsNull("paramId")){
		errorTip("paramId-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("paramId-tips","");
		submitEffect.condition3 = true;
	}
	// 验证证据描述
	if(inputIsNull("caseProofDes")){
		errorTip("caseProofDes-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("caseProofDes-tips","");
		submitEffect.condition4 = true;
	}
	// 通过验证提交表单
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4){
		$("#form-addCaseProof").submit();
	}
});



/**
 * 文书创建
 */
$("#addCaseDoc-btn").click(function(){
	// 验证文书名称
	if(inputIsNull("caseDocName")){
		errorTip("caseDocName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("caseDocName-tips","");
		submitEffect.condition1 = true;
	}
	// 验证文书类型
	if(inputIsNull("paramId")){
		errorTip("paramId-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("paramId-tips","");
		submitEffect.condition2 = true;
	}
	// 验证指导老师
	if(inputIsNull("usersByTeacher")){
		errorTip("usersByTeacher-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("usersByTeacher-tips","");
		submitEffect.condition3 = true;
	}
	// 验证文书
	if(inputIsNull("caseDocDes")){
		errorTip("caseDocDes-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("caseDocDes-tips","");
		submitEffect.condition4 = true;
	}
	// 通过验证提交表单
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4){
		$("#form-addCaseDoc").submit();
	}
});


/**
 * 笔记创建
 */
$("#addCaseNote-btn").click(function(){
	// 验证笔记名称
	if(inputIsNull("caseNoteName")){
		errorTip("caseNoteName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("caseNoteName-tips","");
		submitEffect.condition1 = true;
	}
	if(submitEffect.condition1){
		$("#form-addCaseNote").submit();
	}
});


/**
 * 音频创建
 */
$("#addCaseMedia-btn").click(function(){
	// 验证笔记名称
	if(inputIsNull("caseMediaName")){
		errorTip("caseMediaName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("caseMediaName-tips","");
		submitEffect.condition1 = true;
	}
	if(submitEffect.condition1){
		$("#form-addCaseMedia").submit();
	}
});


/**
 * 资料创建
 */
$("#addCaseData-btn").click(function(){
	// 验证笔记名称
	if(inputIsNull("caseDataName")){
		errorTip("caseDataName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("caseDataName-tips","");
		submitEffect.condition1 = true;
	}
	if(submitEffect.condition1){
		$("#form-addCaseData").submit();
	}
});


/**
 * 小组创建-管理员
 */
$("#addGroup-btn").click(function(){
	groupCreation("#form-addGroup");
});


/**
 * 小组修改-管理员
 */
$("#updateGroup-btn").click(function(){
	groupCreation("#form-updateGroup");
});
/**
 * 小组创建-教师
 */
$("#addGroup-btn-js").click(function(){
	groupCreationjs("#form-addGroup-js");
});


/**
 * 小组修改-教师
 */
$("#updateGroup-btn-js").click(function(){
	groupCreationjs("#form-updateGroup-js");
});

/**
 * 创建讨论组
 */
$("#addGroupDiscuss-btn").click(function(){
	GroupDiscuss("#form-addGroupDiscuss");
});


/**
 * 修改讨论组
 */
$("#updateGroupDiscuss-btn").click(function(){
	GroupDiscuss("#form-updateGroupDiscuss");
});


/**
 * 创建用户
 */
$("#addUsers-btn").click(function(){
	userOperation("#form-addUsers");
});


/**
 * 修改用户
 */
$("#modifyUsers-btn").click(function(){
	userOperation("#form-modifyUsers");
});


$("#modifyPassword-btn").click(function(){
	userOperation2("#form-modifyPassword");
});


$("#modifycategory-btn").click(function(){
	categoryOperation("#form-modifycategory");
});

$("#modifyType-btn").click(function(){
	typeOperation("#form-modifytype");
});


/**
 * 模块创建
 */
$("#addModule-btn").click(function(){
	operatioModule("#form-addModule");
});


/**
 * 模块修改
 */
$("#modifyModule-btn").click(function(){
	operatioModule("#form-modifyModule");
});


/**
 * 角色创建
 */
$("#addRole-btn").click(function(){
	operatioRole("#form-addRole");
});


/**
 * 角色修改
 */
$("#modifyRole-btn").click(function(){
	operatioRole("#form-modifyRole");
});


/**
 * 人员修改
 */
$("#modifyPerson-btn").click(function(){
	// 验证姓名
	if(inputIsNull("personName")){
		errorTip("personName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("personName-tips","");
		submitEffect.condition1 = true;
	}
	// 验证账号
	if(inputIsNull("personNum")){
		errorTip("personNum-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("personNum-tips","");
		submitEffect.condition2 = true;
	}
	// 验证手机
	if(inputIsNull("personPhone")){
		errorTip("personPhone-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else if(!(regular.mobile.test($("#personPhone").val()))){
		errorTip("personPhone-tips",errorTips.mobileWrong);
		submitEffect.condition3 = false;
	}else{
		errorTip("personPhone-tips","");
		submitEffect.condition3 = true;
	}
	// 验证微信账号
	if(inputIsNull("personMessage")){
		errorTip("personMessage-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("personMessage-tips","");
		submitEffect.condition4 = true;
	}
	// 验证邮件
	if(inputIsNull("personEmail")){
		errorTip("personEmail-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else if(!(regular.email.test($("#personEmail").val()))){
		errorTip("personEmail-tips",errorTips.emailWrong);
		submitEffect.condition5 = false;
	}else{
		errorTip("personEmail-tips","");
		submitEffect.condition5 = true;
	}
	// 验证性别
	if($('input:radio[name="personVo.personSex"]:checked').val() == "" || $('input:radio[name="personVo.personSex"]:checked').val() == undefined){
		errorTip("personSex-tips",errorTips.notNull);
		submitEffect.condition6 = false;
	}else{
		errorTip("personSex-tips","");
		submitEffect.condition6 = true;
	}
	// 验证地址
	if(inputIsNull("personAddress")){
		errorTip("personAddress-tips",errorTips.notNull);
		submitEffect.condition7 = false;
	}else{
		errorTip("personAddress-tips","");
		submitEffect.condition7 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5 && submitEffect.condition6 && submitEffect.condition7){
		$("#form-modifyPerson").submit();
	}
});



/**
 * 人员修改-学生
 */
$("#modifyPersonS-btn").click(function(){
	// 验证姓名
	if(inputIsNull("personName")){
		errorTip("personName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("personName-tips","");
		submitEffect.condition1 = true;
	}
	// 验证账号
	if(inputIsNull("personNum")){
		errorTip("personNum-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("personNum-tips","");
		submitEffect.condition2 = true;
	}
	// 验证手机
	if(inputIsNull("personPhone")){
		errorTip("personPhone-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else if(!(regular.mobile.test($("#personPhone").val()))){
		errorTip("personPhone-tips",errorTips.mobileWrong);
		submitEffect.condition3 = false;
	}else{
		errorTip("personPhone-tips","");
		submitEffect.condition3 = true;
	}
	// 验证微信账号
	if(inputIsNull("personMessage")){
		errorTip("personMessage-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("personMessage-tips","");
		submitEffect.condition4 = true;
	}
	// 验证邮件
	if(inputIsNull("personEmail")){
		errorTip("personEmail-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else if(!(regular.email.test($("#personEmail").val()))){
		errorTip("personEmail-tips",errorTips.emailWrong);
		submitEffect.condition5 = false;
	}else{
		errorTip("personEmail-tips","");
		submitEffect.condition5 = true;
	}
	// 验证性别
	if($('input:radio[name="personVo.personSex"]:checked').val() == "" || $('input:radio[name="personVo.personSex"]:checked').val() == undefined){
		errorTip("personSex-tips",errorTips.notNull);
		submitEffect.condition6 = false;
	}else{
		errorTip("personSex-tips","");
		submitEffect.condition6 = true;
	}
	// 验证地址
	if(inputIsNull("personAddress")){
		errorTip("personAddress-tips",errorTips.notNull);
		submitEffect.condition7 = false;
	}else{
		errorTip("personAddress-tips","");
		submitEffect.condition7 = true;
	}
	// 验证院系
	if(inputIsNull("personYx")){
		errorTip("personYx-tips",errorTips.notNull);
		submitEffect.condition8 = false;
	}else{
		errorTip("personYx-tips","");
		submitEffect.condition8 = true;
	}
	// 验证年级
	if(inputIsNull("personNj")){
		errorTip("personNj-tips",errorTips.notNull);
		submitEffect.condition9 = false;
	}else{
		errorTip("personNj-tips","");
		submitEffect.condition9 = true;
	}
	// 验证班级
	if(inputIsNull("personBj")){
		errorTip("personBj-tips",errorTips.notNull);
		submitEffect.condition10 = false;
	}else{
		errorTip("personBj-tips","");
		submitEffect.condition10 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5 && submitEffect.condition6 && submitEffect.condition7 && submitEffect.condition8 && submitEffect.condition9 && submitEffect.condition10){
		$("#form-modifyPerson").submit();
	}
});


/**
 * 管理员课程创建
 */
$("#addKc-btn").click(function(){
	courseOperation("#form-addKc");
});


/**
 * 管理员课程修改
 */
$("#updateKc-btn").click(function(){
	courseOperation("#form-updateKc");
});

/**
 * 教师课程创建
 */
$("#addKc-btn-js").click(function(){
	courseOperationjs("#form-addKc");
});


/**
 * 教师课程修改
 */
$("#updateKc-btn-js").click(function(){
	courseOperationjs("#form-updateKcForjs");
});


/**
 * 学期创建
 */
$("#addBatch-btn").click(function(){
	termOperation("#form-addBatch");
});


/**
 * 学期修改
 */
$("#updateBatch-btn").click(function(){
	termOperation("#form-updateBatch");
});
/**
 * 问题答复-学生
 */
$("#updateReplyDiscussd-btn").click(function(){
	// 验证问题答复
	if(inputIsNull("discussReply")){
		errorTip("discussReply-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("discussReply-tips","");
		submitEffect.condition1 = true;
	}
	if(submitEffect.condition1){
		$("#form-updateReplyDiscuss").submit();
		top.updateIframe('1');
	}
});



/**
 * 留言-学生
 */
$("#addDiscuss-btn").click(function(){
	// 验证案件
	if(inputIsNull("discussCaseId")){
		errorTip("discussCaseId-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("discussCaseId-tips","");
		submitEffect.condition1 = true;
	}
	// 验证学生
	if(inputIsNull("usersByDiscussReplyUserId")){
		errorTip("usersByDiscussReplyUserId-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("usersByDiscussReplyUserId-tips","");
		submitEffect.condition2 = true;
	}
	// 验证问题名称
	if(inputIsNull("discussName")){
		errorTip("discussName-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("discussName-tips","");
		submitEffect.condition3 = true;
	}
	// 验证问题描述
	if(inputIsNull("discussNameDes")){
		errorTip("discussNameDes-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("discussNameDes-tips","");
		submitEffect.condition4 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4){
		$("#form-addDiscuss").submit();
	}
});


/**
 * 讨论组意见
 */
$("#addSuggest-btn").click(function(){
	// 验证教师指导意见
	if(inputIsNull("groupDiscussTeacherSuggest")){
		errorTip("groupDiscussTeacherSuggest-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("groupDiscussTeacherSuggest-tips","");
		submitEffect.condition1 = true;
	}
	// 验证小组讨论意见
	if(inputIsNull("groupDiscussGroupSuggest")){
		errorTip("groupDiscussGroupSuggest-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("groupDiscussGroupSuggest-tips","");
		submitEffect.condition2 = true;
	}
	// 验证答复方式
	if(inputIsNull("groupDiscussReply")){
		errorTip("groupDiscussReply-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("groupDiscussReply-tips","");
		submitEffect.condition3 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3){
		$("#form-addSuggest").submit();
	}
});


/**
 * 查看批改-教师
 */
$("#checkCaseDoc-btn").click(function(){
	// 验证教师批注
	if(inputIsNull("caseDocComment")){
		errorTip("caseDocComment-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("caseDocComment-tips","");
		submitEffect.condition1 = true;
	}
	if(submitEffect.condition1){
		$("#form-checkCaseDoc").submit();
	}
});
















//======================= 函数方法区 ======================= //

/**
 * 判断输入框是否为空
 * @param id 标签ID
 */
function inputIsNull(id){
	var idObj = $("#" + id);
	if(trimStr(idObj.val()).length < 1){
		return true;
	}else{
		return false;
	}
}


/**
 * 去掉字符串两边空格
 * @param str 字符串
 */
function trimStr(str){
	return str.replace(regular.trimStr,"");
}

/**
 * 校验错误反馈
 * @param id 标签ID
 * @param tips 提示内容
 */
function errorTip(id,tips){
	var idObj = $("#" + id);
	if(tips){
		idObj.html(tips);
	}else{
		idObj.html("");
	}
}


/**
 * 切换登录、注册、密码找回
 * @param id 标签ID
 */
function show_box(id) {
	$('#'+id).removeClass("none").siblings(".content-box").addClass("none");
}


/**
 * 密码找回--发送验证码
 * @param obj 当前对象
 */
var countdown=60; 
function settime(obj) { 
	var phone = $("#phone").val();
	// 验证手机号
	if(inputIsNull("phone")){
		errorTip("tel-tips",errorTips.notNull);
		submitEffect.userPhone = false;
	}else if(!(regular.mobile.test($("#phone").val()))){
		errorTip("tel-tips",errorTips.mobileWrong);
		submitEffect.userPhone = false;
	}else{
		errorTip("tel-tips","");
		submitEffect.userPhone = true;
	}
	if(submitEffect.userPhone){
		$.post("/ZFDXFLZS/login/message.action",{"userVo.userPhone":phone},function(data){
			if(data.fflag == "false"){
				alert(data.flag);
			}
		});
		settime2(obj);
	}
}

/**
 * 密码找回--倒计时
 * @param obj2 当前对象
 */
function settime2(obj2) { 
	if (countdown == 0) {
	   obj2.removeAttribute("disabled");    
	   obj2.value="免费获取验证码"; 
	   countdown = 60; 
	   return;
	} else { 
        obj2.setAttribute("disabled", true); 
        obj2.value="重新发送(" + countdown + ")"; 
        countdown--; 
		setTimeout(function(){
			settime2(obj2);
		},1000);
	}
}


/**
 * 返回浏览器名称
 */
function myBrowser(){
	var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
	   var isOpera = userAgent.indexOf("Opera") > -1;
	if (isOpera) {
	    return "Opera"
	}; //判断是否Opera浏览器
	if (userAgent.indexOf("Firefox") > -1) {
		return "FF";
	} //判断是否Firefox浏览器
	if (userAgent.indexOf("Chrome") > -1){
		return "Chrome";
	}
	if (userAgent.indexOf("Safari") > -1) {
		return "Safari";
	} //判断是否Safari浏览器
	if (userAgent.indexOf("compatible") > -1 || userAgent.indexOf("MSIE") > -1 || !isOpera) {
		return "IE";
	}; //判断是否IE浏览器
}


/**
 * 提交创建、修改案件表单
 * @param obj 选择器对象
 */
function subCase(obj){
	// 验证案件名
	if(inputIsNull("caseName")){
		errorTip("caseName-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("caseName-tips","");
		submitEffect.condition2 = true;
	}
	// 验证当事人姓名
	if(inputIsNull("case-pepole")){
		errorTip("casePepole-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("casePepole-tips","");
		submitEffect.condition3 = true;
	}
	// 验证指导老师
	if(inputIsNull("caseUser-teacher")){
		errorTip("caseUser-teacher-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("caseUser-teacher-tips","");
		submitEffect.condition4 = true;
	}
	// 验证联动案件类型
	if(inputIsNull("category_one")){
		errorTip("aj-type-tips",errorTips.categoryNotNull);
		submitEffect.condition5 = false;
	}else if(inputIsNull("category_two")){
		errorTip("aj-type-tips",errorTips.categoryNotNull);
		submitEffect.condition5 = false;
	}else if(inputIsNull("category_three")){
		errorTip("aj-type-tips",errorTips.categoryNotNull);
		submitEffect.condition5 = false;
	}else{
		errorTip("aj-type-tips","");
		submitEffect.condition5 = true;
	}
	
	// 校验通过提交表单
	if(submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5){
		$(obj).submit();
	}
}



/**
 * 创建小组、修改小组-管理员
 * @param obj 选择器对象
 */
function groupCreation(obj){
	// 验证小组编号
	if(inputIsNull("groupNum")){
		errorTip("groupNum-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("groupNum-tips","");
		submitEffect.condition1 = true;
	}
	// 验证小组名称
	if(inputIsNull("groupName")){
		errorTip("groupName-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("groupName-tips","");
		submitEffect.condition2 = true;
	}
	// 验证学期
	if(inputIsNull("groupBatchId")){
		errorTip("groupBatchId-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("groupBatchId-tips","");
		submitEffect.condition3 = true;
	}
	// 验证启用开关
	if($('input:radio[name="groupVo.groupEnable"]:checked').val() == "" || $('input:radio[name="groupVo.groupEnable"]:checked').val() == undefined){
		errorTip("groupEnable-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("groupEnable-tips","");
		submitEffect.condition4 = true;
	}
	// 验证教师
	if(inputIsNull("select")){
		errorTip("select-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else{
		errorTip("select-tips","");
		submitEffect.condition5 = true;
	}
	// 验证课程
	if(inputIsNull("groupKcId")){
		errorTip("groupKcId-tips",errorTips.notNull);
		submitEffect.condition7 = false;
	}else{
		errorTip("groupKcId-tips","");
		submitEffect.condition7 = true;
	}
	// 验证描述
	if(inputIsNull("groupDec")){
		errorTip("groupDec-tips",errorTips.notNull);
		submitEffect.condition8 = false;
	}else{
		errorTip("groupDec-tips","");
		submitEffect.condition8 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5 && submitEffect.condition7 && submitEffect.condition8){
		$(obj).submit();
	}
}
/**
 * 创建小组、修改小组-教师
 * @param obj 选择器对象
 */
function groupCreationjs(obj){
	// 验证小组编号
	if(inputIsNull("groupNum")){
		errorTip("groupNum-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("groupNum-tips","");
		submitEffect.condition1 = true;
	}
	// 验证小组名称
	if(inputIsNull("groupName")){
		errorTip("groupName-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("groupName-tips","");
		submitEffect.condition2 = true;
	}
	// 验证学期
	if(inputIsNull("groupBatchId")){
		errorTip("groupBatchId-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("groupBatchId-tips","");
		submitEffect.condition3 = true;
	}
	// 验证启用开关
	if($('input:radio[name="groupVo.groupEnable"]:checked').val() == "" || $('input:radio[name="groupVo.groupEnable"]:checked').val() == undefined){
		errorTip("groupEnable-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("groupEnable-tips","");
		submitEffect.condition4 = true;
	}
	// 验证课程
	if(inputIsNull("groupKcId")){
		errorTip("groupKcId-tips",errorTips.notNull);
		submitEffect.condition7 = false;
	}else{
		errorTip("groupKcId-tips","");
		submitEffect.condition7 = true;
	}
	// 验证描述
	if(inputIsNull("groupDec")){
		errorTip("groupDec-tips",errorTips.notNull);
		submitEffect.condition8 = false;
	}else{
		errorTip("groupDec-tips","");
		submitEffect.condition8 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition7 && submitEffect.condition8){
		$(obj).submit();
	}
}

/**
 * 创建讨论组、修改讨论组
 * @param obj 选择器对象
 */
function GroupDiscuss(obj){
	// 验证时间
	if(inputIsNull("groupDiscussTime")){
		errorTip("groupDiscussTime-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("groupDiscussTime-tips","");
		submitEffect.condition1 = true;
	}
	//验证讨论组名称
	if(inputIsNull("groupDiscussName")){
		errorTip("groupDiscussName-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("groupDiscussName-tips","");
		submitEffect.condition2 = true;
	}
	// 验证指导老师
	if(inputIsNull("tearcher")){
		errorTip("tearcher-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("tearcher-tips","");
		submitEffect.condition3 = true;
	}
	// 验证指导内容
	if(inputIsNull("groupDiscussContent")){
		errorTip("groupDiscussContent-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("groupDiscussContent-tips","");
		submitEffect.condition4 = true;
	}
	// 验证地点
	if(inputIsNull("groupDiscussAddress")){
		errorTip("groupDiscussAddress-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else{
		errorTip("groupDiscussAddress-tips","");
		submitEffect.condition5 = true;
	}
	// 验证通过提交
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5){
		$(obj).submit();
	}
}



/**
 * 创建用户、修改用户
 * @param obj 选择器对象
 */
function userOperation(obj){
	// 验证用户名
	if(inputIsNull("username")){
		errorTip("username-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("userName-tips","");
		submitEffect.condition1 = true;
	}
	// 验证账号名
	if(inputIsNull("password")){
		errorTip("password-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("password-tips","");
		submitEffect.condition2 = true;
	}
	// 验证密码
	if(inputIsNull("tel")){
		errorTip("tel-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("tel-tips","");
		submitEffect.condition3 = true;
	}
	
	if(inputIsNull("sex")){
		errorTip("sex-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("sex-tips","");
		submitEffect.condition4 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3&& submitEffect.condition4){
		$(obj).submit();
	}
}

/**
 * 修改类别
 * @param obj
 */

function categoryOperation(obj){
	// 验证用户
	if(inputIsNull("cname")){
		errorTip("cname-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("cname-tips","");
		submitEffect.condition1 = true;
	}
	// 验证账号名
	if(inputIsNull("cdesc")){
		errorTip("cdesc-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("cdesc-tips","");
		submitEffect.condition2 = true;
	}
	
	if(submitEffect.condition1 && submitEffect.condition2){
		$(obj).submit();
	}
}

function typeOperation(obj){
	// 验证用户
	if(inputIsNull("typename")){
		errorTip("typename-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("typename-tips","");
		submitEffect.condition1 = true;
	}
	if(submitEffect.condition1){
		$(obj).submit();
	}
}





/**
 * 创建用户、修改用户
 * @param obj 选择器对象
 */
function userOperation2(obj){
	// 原密码
	if(inputIsNull("oldpassword")){
		errorTip("oldpassword-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("oldpassword-tips","");
		submitEffect.condition1 = true;
	}
	// 新密码
	if(inputIsNull("password")){
		errorTip("newpassword-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("newpassword-tips","");
		submitEffect.condition2 = true;
	}
	
	// 验证密码确认
	// 验证密码
	if(inputIsNull("password2")){
		errorTip("password2-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else if($("#password2").val() != $("#password").val()){
		errorTip("password2-tips",errorTips.passwordUnlike);
		submitEffect.condition3 = false;
	}else{
		errorTip("password2-tips","");
		submitEffect.condition3 = true;
	}
	
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3){
		$(obj).submit();
	}
}


/**
 * 创建模块、修改模块
 * @param obj 选择器对象
 */
function operatioModule(obj){
	// 验证模块名称
	if(inputIsNull("moduleName")){
		errorTip("moduleName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("moduleName-tips","");
		submitEffect.condition1 = true;
	}
	// 验证模块地址
	if(inputIsNull("moduleUrl")){
		errorTip("moduleUrl-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("moduleUrl-tips","");
		submitEffect.condition2 = true;
	}
	// 验证排序号
	if(inputIsNull("moduleOrderNum")){
		errorTip("moduleOrderNum-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("moduleOrderNum-tips","");
		submitEffect.condition3 = true;
	}
	// 验证模块描述
	if(inputIsNull("moduleNote")){
		errorTip("moduleNote-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("moduleNote-tips","");
		submitEffect.condition4 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4){
		$(obj).submit();
	}
}



/**
 * 创建角色、修改角色
 * @param obj 选择器对象
 */
function operatioRole(obj){
	// 验证角色名称
	if(inputIsNull("roleName")){
		errorTip("roleName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("roleName-tips","");
		submitEffect.condition1 = true;
	}
	// 验证角色描述
	if(inputIsNull("roleNote")){
		errorTip("roleNote-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("roleNote-tips","");
		submitEffect.condition2 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2){
		$(obj).submit();
	}
}



/**
 * 管理员创建课程、修改课程
 * @param obj 选择器对象
 */
function courseOperation(obj){
	// 验证课程名称
	if(inputIsNull("kcName")){
		errorTip("kcName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("kcName-tips","");
		submitEffect.condition1 = true;
	}
	// 验证教师
	if(inputIsNull("users")){
		errorTip("users-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}else{
		errorTip("users-tips","");
		submitEffect.condition2 = true;
	}
	// 验证启用开关
	if($('input:radio[name="kcVo.kcEnable"]:checked').val() == "" || $('input:radio[name="kcVo.kcEnable"]:checked').val() == undefined){
		errorTip("kcEnable-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("kcEnable-tips","");
		submitEffect.condition3 = true;
	}
	// 验证课程描述
	if(inputIsNull("kcDec")){
		errorTip("kcDec-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("kcDec-tips","");
		submitEffect.condition4 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4){
		$(obj).submit();
	}
}
/**
 * 教师创建课程、修改课程
 * @param obj 选择器对象
 */
function courseOperationjs(obj){
	// 验证课程名称
	if(inputIsNull("kcName")){
		errorTip("kcName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("kcName-tips","");
		submitEffect.condition1 = true;
	}
	// 验证启用开关
	if($('input:radio[name="kcVo.kcEnable"]:checked').val() == "" || $('input:radio[name="kcVo.kcEnable"]:checked').val() == undefined){
		errorTip("kcEnable-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("kcEnable-tips","");
		submitEffect.condition3 = true;
	}
	// 验证课程描述
	if(inputIsNull("kcDec")){
		errorTip("kcDec-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("kcDec-tips","");
		submitEffect.condition4 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition3 && submitEffect.condition4){
		$(obj).submit();
	}
}

/**
 * 创建学期、修改学期
 * @param obj 选择器对象
 */
function termOperation(obj){
	//验证学期名称
	if(inputIsNull("batchName")){
		errorTip("batchName-tips",errorTips.notNull);
		submitEffect.condition1 = false;
	}else{
		errorTip("batchName-tips","");
		submitEffect.condition1 = true;
	}
	// 验证学期编号
	if(inputIsNull("batchNum")){
		errorTip("batchNum-tips",errorTips.notNull);
		submitEffect.condition2 = false;
	}
/*	else if(!/^[0-9]*$/.test($("#batchNum").val())){
		errorTip("batchNum-tips",errorTips.numberWrong);
		submitEffect.condition2 = false;
	}*/
	else{
		errorTip("batchNum-tips","");
		submitEffect.condition2 = true;
	}
	// 验证学期年度
	if(inputIsNull("batchYear")){
		errorTip("batchYear-tips",errorTips.notNull);
		submitEffect.condition3 = false;
	}else{
		errorTip("batchYear-tips","");
		submitEffect.condition3 = true;
	}
	// 验证学期季度
	if(inputIsNull("batchType")){
		errorTip("batchType-tips",errorTips.notNull);
		submitEffect.condition4 = false;
	}else{
		errorTip("batchType-tips","");
		submitEffect.condition4 = true;
	}
	// 验证报名开关
	if($('input:radio[name="batchVo.batchSwitch"]:checked').val() == "" || $('input:radio[name="batchVo.batchSwitch"]:checked').val() == undefined){
		errorTip("batchSwitch-tips",errorTips.notNull);
		submitEffect.condition5 = false;
	}else{
		errorTip("batchSwitch-tips","");
		submitEffect.condition5 = true;
	}
	// 验证启学期状态
	if($('input:radio[name="batchVo.batchState"]:checked').val() == "" || $('input:radio[name="batchVo.batchState"]:checked').val() == undefined){
		errorTip("batchState-tips",errorTips.notNull);
		submitEffect.condition6 = false;
	}else{
		errorTip("batchState-tips","");
		submitEffect.condition6 = true;
	}
	// 验证课程状态
	if($('input:radio[name="batchVo.batchKcState"]:checked').val() == "" || $('input:radio[name="batchVo.batchKcState"]:checked').val() == undefined){
		errorTip("batchKcState-tips",errorTips.notNull);
		submitEffect.condition7 = false;
	}else{
		errorTip("batchKcState-tips","");
		submitEffect.condition7 = true;
	}
	// 验证学期描述
	if(inputIsNull("batchDes")){
		errorTip("batchDes-tips",errorTips.notNull);
		submitEffect.condition8 = false;
	}else{
		errorTip("batchDes-tips","");
		submitEffect.condition8 = true;
	}
	if(submitEffect.condition1 && submitEffect.condition2 && submitEffect.condition3 && submitEffect.condition4 && submitEffect.condition5 && submitEffect.condition6 && submitEffect.condition7 && submitEffect.condition8){
		$(obj).submit();
	}
}






/**
 * 重定向首页
 * @param url 路径
 */
function redirectUrl(url){
	window.parent.location.href = url;
}

