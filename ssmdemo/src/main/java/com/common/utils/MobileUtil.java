package com.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 电话号码工具类
 * @Title MobileUtil.java
 * @Package com.sinotn.online.util
 * @Description 
 * Copyright: Copyright (c) 2015
 * Company:北京信诺软通
 * 
 * @author <a href="mailto:zouds@sinotn.com">邹大嵩</a>
 * @date 2016年5月9日 下午3:35:08
 * @version V1.0
 */
public class MobileUtil {
	
	private static final String MOBILE_REGEX = "^[1][0-9]{10}$";
	
	/**
	 * 
	 * 判断字符串是否是手机号
	 * @param str
	 * @return
	 * @auth <a href="mailto:zouds@sinotn.com">邹大嵩</a>
	 * @date 2016年5月9日 下午3:36:09
	 */
	public static boolean isMobile(String str) {
		if (StringUtil.isEmpty(str)) {
			return false;
		}
		try { 
			Pattern regex = Pattern.compile(MOBILE_REGEX);
			Matcher matcher = regex.matcher(str);
			return matcher.matches();
		} catch (Exception e) {
			return false;
		}
	}
}
