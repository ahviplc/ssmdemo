package com.common.utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串工具类
 * @Title StringUtil.java
 * @Package com.sinotn.online.util
 * @Description 
 * Copyright: Copyright (c) 2015
 * Company:北京信诺软通
 * 
 * @author <a href="mailto:zoudasong@sinotn.com">邹大嵩</a>
 * @date 2016年4月6日 下午4:06:59
 * @version V1.0
 */
@SuppressWarnings("all")
public final class StringUtil {
	 
	private static final String EMAIL_REGEX = "^([a-z0-9A-Z]+[-_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

	private static final String MOBILE_REGEX = "^[1][0-9]{10}$";
	
	private static final String IPv6_REGEX = "^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$"; 
	
	private static final String IPv4_REGEX =  "(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})";
	
	private static final String IMG_REGEX = ".+\\.(jpg|jpeg|png|gif|bmp)$";
	
	private static final String NUMERIC_REGEX = "[0-9]*" ;
	
	private static final String AGE_REGEX = "120|((1[0-1]|\\d)?\\d)" ;
	
	/**
	 * 将其他类型转成字符串
	 * 
	 * @param obj
	 *            - 其他类型对象
	 * @return - 字符串
	 */
	public static String toString(Object obj) {

		if (null != obj) {
			return obj.toString();
		}
		return null;
	}

	/**
	 * 将属于字符串类型的对象转成Integer对象
	 * 
	 * @param o
	 *            - 字符串类型的对象
	 * @return - Integer对象
	 */
	public static Integer strToInteger(Object o) {

		if (null == o || o.equals("")) {
			return null;
		}
		if (o instanceof Integer) {
			return (Integer) o;
		}
		return toInteger(o.toString());
	}

	/**
	 * 将字符串转成Integer对象
	 * 
	 * @param o
	 *            - 字符串
	 * @return - Integer对象
	 */
	public static Integer toInteger(String o) {

		if (null == o || "".equals(o.trim())) {
			return null;
		}
		Integer t = Integer.valueOf(o);
		return t;
	}

	/**
	 * 将属于字符串类型的对象转成Long对象
	 * 
	 * @param o
	 *            - 字符串类型的对象
	 * @return - Long对象
	 */
	public static Long strToLong(Object o) {

		if (null == o  || o.equals("")) {
			return null;
		}
		if (o instanceof Long) {
			return (Long) o;
		}
		if (o instanceof Integer) {
			Integer i = (Integer) o;
			return Long.valueOf(i.longValue());
		}
		if(o instanceof Double){
			Double d = (Double) o ;
			return d.longValue() ;
		}
		if(o instanceof Float){
			Float f = (Float) o ;
			return f.longValue() ;
		}
		return toLong(o.toString());
	}

	/**
	 * 将字符串转成Long对象
	 * 
	 * @param o
	 *            - 字符串
	 * @return - Long对象
	 */
	public static Long toLong(String o) {

		if (null == o || "".equals(o.trim())) {
			return null;
		}
		Long t = Long.valueOf(o);
		return t;
	}

	/**
	 * 半角转全角
	 * <p>
	 * 半角：Single Byte Character case,全角：Double Byte Character case
	 * <p>
	 * 全角空格为12288，半角空格为32
	 * <p>
	 * 其他字符半角(33-126)与全角(65281-65374)的对应关系是：均相差65248
	 * 
	 * @param input
	 *            - 半角字符串
	 * @return - 全角字符串
	 */
	public static String toDoubleCase(String input) {

		if (null != input) {
			char[] chars = input.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				char c = chars[i];
				if (c == 32) {
					chars[i] = (char) 12288;
				} else if (c >= 33 && c <= 126) {
					chars[i] = (char) ((int) c + 65248);
				}
			}
			return new String(chars);
		}
		return null;
	}

	/**
	 * 全角转半角
	 * <p>
	 * 全角空格为12288，半角空格为32
	 * <p>
	 * 其他字符半角(33-126)与全角(65281-65374)的对应关系是：均相差65248
	 * 
	 * @param input
	 *            - 全角字符串
	 * @return - 半角字符串
	 */
	public static String toSingleCase(String input) {

		if (null != input) {
			char[] chars = input.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				char c = chars[i];
				if (c == 12288) {
					chars[i] = (char) 32;
				} else if (c >= 65281 && c <= 65374) {
					chars[i] = (char) ((int) c - 65248);
				}
			}
			return new String(chars);
		}
		return null;
	}

	/**
	 * 编码转换,将源字符串转换成unicode字符串,和native2ascii 功能相同
	 * 
	 * @param source
	 *            - 源字符串,可以是任意字符,包括汉字
	 * @return unicode - 转换之后的unicode字符串
	 */
	public static String native2ascii(String source) {

		if (null == source) {
			return null;
		}
		StringBuilder unicode = new StringBuilder(source.length() * 5);
		for (char ch : source.toCharArray()) {
			unicode.append("\\u").append(Integer.toHexString(ch));

		}
		return unicode.toString();
	}

	/**
	 * 判断字符串是否为空，null 或者 "" 或者 " "（只有空格）都算是空
	 * 
	 * @param s
	 *            - 字符串
	 * @return - 为空返回true,否则返回false
	 */
	public static boolean isEmpty(String s) {

		if (null == s || "".equals(s.trim())) {
			return true;
		}
		return false;
	}

	/**
	 * 判断值和对象是否为空
	 * 
	 * @param obj
	 * @return
	 */

	public static boolean isEmpty(Collection obj) {

		if (obj == null) {
			return true;
		}

		return obj.isEmpty();
	}

	public static boolean isEmpty(List obj) {

		if (obj == null) {
			return true;
		}

		return obj.isEmpty();
	}

	public static boolean isEmpty(Map m) {

		if (null == m) {
			return true;
		}
		return m.isEmpty();
	}

	public static boolean isEmpty(Object o) {

		if (null == o) {
			return true;
		}
		if (o.getClass().isArray()) {
			return Array.getLength(o) == 0;
		}
		if(o instanceof String){
			return isEmpty((String)o);
		}
		if(o instanceof List){
			return isEmpty((List)o);
		}
		if(o instanceof Collection){
			return isEmpty((Collection)o);
		}
		return false;
	}

	/**
	 * 判断是否是纯数字([0,9])字符串
	 * 
	 * @param o - 待判断字符串
	 * @return - true, 数字字符串
	 */
	public static boolean isDigitStr(Object o) {
		
		if (isEmpty(o)) {
			return false;
		}
		String str = o.toString();
		for (int i = str.length(); --i >= 0;) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 判断字符串是否是邮箱
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str) {
		
		if (isEmpty(str)) {
			return false;
		}
		boolean flag = false;
		try { 
			Pattern regex = Pattern.compile(EMAIL_REGEX);
			Matcher matcher = regex.matcher(str);
			return matcher.matches();
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * 判断字符串是否是手机号
	 * @param str
	 * @return
	 */
	public static boolean isMobile(String str) {

		if (isEmpty(str)) {
			return false;
		}
		boolean flag = false;
		try { 
			Pattern regex = Pattern.compile(MOBILE_REGEX);
			Matcher matcher = regex.matcher(str);
			return matcher.matches();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 判断字符串是否是图片名
	 * @param str
	 * @return
	 */
	public static boolean isImg(String str) {

		if (isEmpty(str)) {
			return false;
		}
		boolean flag = false;
		try { 
			Pattern regex = Pattern.compile(IMG_REGEX);
			Matcher matcher = regex.matcher(str.toLowerCase());
			return matcher.matches();
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * 判断字符串是否IPV4地址
	 * @param str
	 * @return
	 */
	public static boolean isIp(String str) {
		
		if (isEmpty(str)) {
			return false;
		}

		Pattern p1 = Pattern.compile(IPv4_REGEX);
		Matcher m1 = p1.matcher(str);
		if (m1.matches()) {
			return true;
		}
		
		Pattern p2 = Pattern.compile(IPv6_REGEX);
		Matcher m2 = p2.matcher(str);
		return m2.matches();
	}

	/**
	 * 获取6位数字随机码
	 * 
	 * @return - 6位数字随机码
	 */
	public static String randomN6() {

		Random r = new Random();
		int x = r.nextInt(1000000);
		String rv = String.format("%06d", Integer.valueOf(x));
		return rv;
	}
	
	/**
	 * 将邮箱部分用**加密
	 * @param email
	 * @return
	 */
	public static String decriptEmail(String email){
		if(!isEmail(email)){
			return null ;
		}
		String[] emailCodes = email.split("@");
		email = emailCodes[0];
		StringBuffer decriptEmail = new StringBuffer("");
		char hideCode = '*';
		int emailLength = email.length();
		for (int i = 0; i < emailLength; i++) {
			if (i < 2 || i > emailLength - 3) {
				decriptEmail.append(email.charAt(i));
			} else {
				decriptEmail.append(hideCode);
			}
		}
		return decriptEmail.toString() + "@" + emailCodes[1];
	}
	
	/**
	 * 将手机部分用**加密
	 * @param mobile
	 * @return
	 */
	public static String decriptMobile(String mobile){
		if(!isMobile(mobile)){
			return null ;
		}
		StringBuffer decriptMobile = new StringBuffer("");
		char hideCode = '*';
		int mobileLength = mobile.length();
		for (int i = 0; i < mobileLength; i++) {
			if (i < 3 || i > mobileLength - 4) {
				decriptMobile.append(mobile.charAt(i));
			} else {
				decriptMobile.append(hideCode);
			}
		}
		return decriptMobile.toString() ;
	}
	
	public static String getEncoding(String str) {
		String encode = "GB2312";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s = encode;
				return s;
			}
		} catch (Exception exception) {
		}
		encode = "ISO-8859-1";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s1 = encode;
				return s1;
			}
		} catch (Exception exception1) {
		}
		encode = "UTF-8";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s2 = encode;
				return s2;
			}
		} catch (Exception exception2) {
		}
		encode = "GBK";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s3 = encode;
				return s3;
			}
		} catch (Exception exception3) {
		}
		return "";
	}
	
	public static void  filterLabel(){
		
		
	}
	

	private final static String regxpForHtml = "<([^>]*)>"; // 过滤所有以<开头以>结尾的标签  
	
	/**
	 * 
	 * @Description: 过滤所有以<开头，>结尾的标签 
	 * @param str
	 * @return
	 * String
	 * @throws 
	 * @author rongjianping
	 * 2015年4月29日上午10:49:48
	 */
    public static String filterHtml(String str) {   
        Pattern pattern = Pattern.compile(regxpForHtml);   
        Matcher matcher = pattern.matcher(str);   
        StringBuffer sb = new StringBuffer();   
        boolean result1 = matcher.find();   
        while (result1) {   
            matcher.appendReplacement(sb, "");   
            result1 = matcher.find();   
        }   
        matcher.appendTail(sb);   
        return sb.toString();   
    } 
    
	public static Double toDouble(Object o) {

		if (null == o  || o.equals("")) {
			return null;
		}
		if (o instanceof Double) {
			return (Double) o;
		}
		if (o instanceof Integer) {
			Integer i = (Integer) o;
			return i.doubleValue();
		}
		if(o instanceof Float){
			Float f = (Float) o ;
			return f.doubleValue();
		}
		if(o instanceof String){
			String s=(String)o;
			return Double.parseDouble(s);
		}
		return null;
	}
	
	/**
	 * 
	 * 判断字符串是否以数字组成
	 * @param str
	 * @return
	 * @auth <a href="mailto:zouds@sinotn.com">邹大嵩</a>
	 * @date 2016年5月10日 下午2:39:02
	 */
	public static boolean isNumeric(String str){
		if (isEmpty(str)) {
			return false;
		}
		boolean flag = false;
		try { 
			Pattern regex = Pattern.compile(NUMERIC_REGEX);
			Matcher matcher = regex.matcher(str);
			return matcher.matches();
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * 
	 * 判断字符串是否年龄
	 * @param str
	 * @return
	 * @auth <a href="mailto:zouds@sinotn.com">邹大嵩</a>
	 * @date 2016年6月30日 上午10:47:03
	 */
	public static boolean isAge(String str){
		if (isEmpty(str)) {
			return false;
		}
		boolean flag = false;
		try { 
			Pattern regex = Pattern.compile(AGE_REGEX);
			Matcher matcher = regex.matcher(str);
			return matcher.matches();
		} catch (Exception e) {
			return false;
		}
	}
    
    	
	/**
	 * 防止非法实例化
	 */
	private StringUtil() {
	}
	
	public static void main(String[] args){
		//System.out.println(StringUtil.isEmail("ruanhuoxing_3@126.com"));
		//System.out.println(StringUtil.isNumeric("160510150529289450"));
		Pattern regex = Pattern.compile("^[\\s\\S]{0,19}$") ;
		Matcher matcher = regex.matcher("工工工工工工工工工工工工工工工工工工工");
		System.out.println(matcher.matches());
	}
	
}
