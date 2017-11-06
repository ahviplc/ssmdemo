package com.common.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 参数处理相关
 * @Title ParamHelper.java
 * @Package com.sinotn.online.commons
 * @Description 
 * Copyright: Copyright (c) 2015
 * Company:北京信诺软通
 * 
 * @author <a href="mailto:zoudasong@sinotn.com">邹大嵩</a>
 * @date 2016年4月6日 下午3:23:54
 * @version V1.0
 */
public class ParamHelper {
	
	protected Map<String, Object> params; 
	
	protected Map<String, Object> getP() {
		
		if (null == params) {
			params = new HashMap<String, Object>();
		}
		return params;
	}
	
	/**
	 * 获取属性集合
	 * @return
	 */
	public Map<String, Object> params() {
		return getP();
	}
	
	/**
	 * 获取属性集合
	 * @return
	 */
	public Map<String, Object> getParams() {
		return getP();
	}
	
	/**
	 * 获取字符串
	 * @param paramName
	 * @return
	 */
	public String getStr(String paramName) {
		return StringUtil.toString(getP().get(paramName));
	}
	
	/**
	 * 获取参数
	 * @param paramName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T get(String paramName) {
		return (T) getP().get(paramName);
	}
	
	/**
	 * 获取指定返回类型的参数
	 * @param paramName - 参数名称
	 * @param c - 返回类型
	 * @return - 参数值
	 * @throws - E711
	 */
	@SuppressWarnings("unchecked")
	public <T> T get(String paramName, Class<T> c) {
		
		Object r = getP().get(paramName);
		
		if (null != r && null != c) {
			if (!c.isAssignableFrom(r.getClass())) {
				String rn = r.getClass().getSimpleName();
				String cn = c.getSimpleName();
				String cause = String.format("参数[%s]当前类型[%s]转成目标类型[%s]异常:", paramName, rn, cn);
				throw Errors.clone(Errors.E711, cause);
			}
		}
		return (T) r;
	}
	
	/**
	 * 获取long类型参数 备注:可以为null
	 * 
	 * @param paramName - 参数名称
	 * @return - 参数值
	 * @throws - E711
	 */
	public Long getLong(String paramName) {
		Object r = getP().get(paramName);
		try {
			return StringUtil.strToLong(r);
		} catch (Exception ex) {
			String cause = String.format("参数[%s]转成目标Long类型异常:", paramName);
			throw Errors.clone(Errors.E711, cause + ex.getMessage());
		}
	}
	
	public Double getDouble(String paramName) {
		Object r = getP().get(paramName);
		try {
			return StringUtil.toDouble(r);
		} catch (Exception ex) {
			String cause = String.format("参数[%s]转成目标Double类型异常:", paramName);
			throw Errors.clone(Errors.E711, cause + ex.getMessage());
		}
	}
	
	
	/**
	 * 日期转换
	 * 
	 * @param paramName - 参数名称
	 * @return 参数值
	 * @throws - E711
	 */
	public Date getDate(String cname) {
		Date backValue = null;
		Object dateTime = null;
		try {
			dateTime = getP().get(cname);
			if (null != dateTime) {
				backValue = DateUtil.convert(dateTime.toString(), DateUtil.DATETIME_FORMAT);
			}
		} catch (Exception ex) {
			String cause = String.format("参数[%s]当前类型[%s]转成目标类型[%s]异常:", cname, dateTime.getClass(), Date.class);
			throw Errors.clone(Errors.E711, cause);
		}
		return backValue;
	}   
	    
	/**
	 * 获取int类型参数 备注:可以为null
	 * 
	 * @param paramName
	 *            - 参数名称
	 * @return - 参数值
	 */
	public Integer getInt(String paramName) {
		Object r = getP().get(paramName);
		try {
			return StringUtil.strToInteger(r);
		} catch (Exception ex) {
			String cause = String.format("参数[%s]转成目标Integer类型异常:", paramName);
			throw Errors.clone(Errors.E711, cause + ex.getMessage());
		}
	}
	
	/**
	 * 获取布尔值
	 * @param paramName - 参数名
	 * @return
	 */
	public boolean getBool(String paramName) {
		
		Object r = getP().get(paramName);
		if (null == r ) {
			return false;
		}
		if (r instanceof Boolean) {
			Boolean b = (Boolean)r;
			return b.booleanValue();
		} 
		if (r instanceof String) {
			String s = r.toString().trim().toLowerCase();
			if ("1".equals(s) || "true".equals(s)) {
				return true;
			}
			return false;
		} 
		try {
			Integer i = StringUtil.strToInteger(r);
			if (i.intValue() == 1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception ex) {
			return false;
		}
	}
	
	/**
	 * 获取非空int数值
	 * 
	 * @param paramName
	 *            - 参数名
	 * @return - 参数值
	 * @throws - E711,E100
	 */
	public Integer getNotNullInteger(String paramName) {
		Object v = getP().get(paramName);
		if (null == v) {
			throw Errors.clone(Errors.E700, paramName + "参数不能为空");
		}
		try {
			Integer i = StringUtil.strToInteger(v);
			return i;
		} catch (Exception ex) {
			String d = "参数[%s]的值[%s]不是数字异常:";
			String cause = String.format(d, paramName, v) + ex.getMessage();
			throw Errors.clone(Errors.E711, cause);
		}
	}
	
	public Double getNotNullDouble(String paramName) {
		Object v = getP().get(paramName);
		if (null == v) {
			throw Errors.clone(Errors.E700, paramName + "参数不能为空");
		}
		try {
			Double d = StringUtil.toDouble(v);
			return d;
		} catch (Exception ex) {
			String d = "参数[%s]的值[%s]不是数字异常:";
			String cause = String.format(d, paramName, v) + ex.getMessage();
			throw Errors.clone(Errors.E711, cause);
		}
	}
	
	/**
	 * 获取非空long数值
	 * 
	 * @param paramName
	 *            - 参数名
	 * @return - 参数值
	 * @throws - E711,E100
	 */
	public Long getNotNullLong(String paramName) {
		
		Object v = getP().get(paramName);
		if (null == v) {
			throw Errors.clone(Errors.E700, paramName + "参数不能为空");
		}
		try {
			Long l = StringUtil.strToLong(v);
			return l;
		} catch (Exception ex) {
			String d = "参数[%s]的值[%s]不是数字异常:";
			String cause = String.format(d, paramName, v) + ex.getMessage();
			throw Errors.clone(Errors.E711, cause);
		}
	}
	
	/**
	 * 获取非空Date对象
	 * 
	 * @param paramName
	 *            - 参数名
	 * @return - 参数值
	 * @throws - E711,E100
	 */
	public Date getNotNullDate(String paramName) {
		String tmp = getNotNullStr(paramName);
		try {
			Date logTimeTmp = DateUtil.convert(tmp);
			return logTimeTmp;
		} catch (Exception ex) {
			String d = "参数[%s]的值[%s]不是时间格式字符串异常:";
			String cause = String.format(d, paramName, tmp) + ex.getMessage();
			throw Errors.clone(Errors.E711, cause);
		}
	}
	
	/**
	 * 获取非空字符串
	 * 
	 * @param paramName
	 *            - 参数名
	 * @return - 参数值
	 * @throws - E700
	 */
	public String getNotNullStr(String paramName) {
		
		String rv = StringUtil.toString(getP().get(paramName));
		if (StringUtil.isEmpty(rv)) {
			throw Errors.clone(Errors.E700, paramName + "参数不能为空");
		}
		return rv;
	}
	 
	/**
	 * 获取非空字符串
	 * 
	 * @param paramName
	 *            - 参数名
	 * @return - 参数值
	 * @throws - E700
	 */
	public String getNotNullStr(String paramName, int maxLen) {
		return getNotNullStr(paramName, 0, maxLen);
	}
	 
	/**
	 * 获取非空字符串
	 * 
	 * @param paramName
	 *            - 参数名
	 * @return - 参数值
	 * @throws - E700
	 */
	public String getNotNullStr(String paramName, int minLen, int maxLen) {
		
		if (minLen < 0 || minLen > maxLen) {
			String info = "参数minLen[%s], maxLen[%s]不正确";
			info = String.format(info, minLen, maxLen);
			throw Errors.clone(Errors.E700, info);
		}
		
		String rv = StringUtil.toString(getP().get(paramName));
		if (StringUtil.isEmpty(rv)) {
			throw Errors.clone(Errors.E700, paramName + "参数不能为空");
		}
		int l = rv.length();
		if (l < minLen ) {
			String info = "参数[%s]的长度[%s]小于必须的长度[%s]";
			info = String.format(info, paramName, l, minLen);
			throw Errors.clone(Errors.E706, info);
		}
		if (l > maxLen) {
			String info = "参数[%s]的长度[%s]大于最大长度[%s]";
			info = String.format(info, paramName, l, maxLen);
			throw Errors.clone(Errors.E707, info);
		}
		return rv;
	}
	
	/**
	 * 获取字符串, 若不为空则校验长度
	 * 
	 * @param paramName
	 *            - 参数名
	 * @return - 参数值
	 * @throws - E700
	 */
	public String getStr(String paramName, int maxLen) {
		return getStr(paramName, 0, maxLen);
	}
	
	/**
	 * 获取字符串, 若不为空则校验长度
	 * 
	 * @param paramName
	 *            - 参数名
	 * @return - 参数值
	 * @throws - E700
	 */
	public String getStr(String paramName, int minLen, int maxLen) {
		
		if (minLen < 0 || minLen > maxLen) {
			String info = "参数minLen[%s], maxLen[%s]不正确";
			info = String.format(info, minLen, maxLen);
			throw Errors.clone(Errors.E700, info);
		}
		
		String rv = StringUtil.toString(getP().get(paramName));
		if (StringUtil.isEmpty(rv)) {
			return null;
		}
		int l = rv.length();
		if (l < minLen ) {
			String info = "参数[%s]的长度[%s]小于必须的长度[%s]";
			info = String.format(info, paramName, l, minLen);
			throw Errors.clone(Errors.E706, info);
		}
		if (l > maxLen) {
			String info = "参数[%s]的长度[%s]大于最大长度[%s]";
			info = String.format(info, paramName, l, maxLen);
			throw Errors.clone(Errors.E707, info);
		}
		return rv;
	}
	
	/**
	 * 获取非空map
	 * 
	 * @param paramName
	 *            - 参数名
	 * @return - 参数值
	 * @throws - E700,E102
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> getNotNullMap(String paramName) {
		
		Object tmp = getP().get(paramName);
		if (StringUtil.isEmpty(tmp)) {
			throw Errors.clone(Errors.E700, paramName + "参数不能为空");
		}
		
		try {
			Map<String, Object> m = (Map<String, Object>) tmp;
			return m;
		} catch (Exception ex) {
			String cause = paramName + "参数非JSON对象异常";
			throw Errors.clone(Errors.E102, cause);
		}
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> getMap(String paramName) {
		
		Object tmp = getP().get(paramName);
		
		try {
			Map<String, Object> m = (Map<String, Object>) tmp;
			return m;
		} catch (Exception ex) {
			String cause = paramName + "参数非JSON对象异常";
			throw Errors.clone(Errors.E102, cause);
		}
	}
	
	/**
	 * 
	 * @Description: 获取list 
	 * @param paramName
	 * @return
	 * List
	 * @throws 
	 * @author rongjianping
	 * 2015年5月19日上午10:52:56
	 */
	@SuppressWarnings("rawtypes")
	public List getList(String paramName) {
		
		Object tmp = getP().get(paramName);
		if(tmp==null){
			return null;
		}		
		try {
			if(tmp instanceof List){
				List list = (List) tmp;
				return list;
			}else if(tmp instanceof String){
				List list = JsonUtil.toBean(tmp.toString(), List.class) ;
				return list ;
			}else{
				throw new Exception() ;
			}
		} catch (Exception ex) {
			String cause = paramName + "参数非JSON对象异常";
			throw Errors.clone(Errors.E102, cause);
		}
	} 
	
	/**
	 * 获取非空List
	 * 
	 * @param paramName
	 *            - 参数名
	 * @return - 参数值
	 * @throws - E700,E102
	 */
	@SuppressWarnings("rawtypes")
	public List getNotNullList(String paramName) {
		
		Object tmp = getP().get(paramName);
		if (StringUtil.isEmpty(tmp)) {
			throw Errors.clone(Errors.E700, paramName + "参数不能为空");
		}
		
		try {
			if(tmp instanceof List){
				List list = (List) tmp;
				return list;
			}else if(tmp instanceof String){
				List list = JsonUtil.toBean(tmp.toString(), List.class) ;
				return list ;
			}else{
				throw new Exception() ;
			}
		} catch (Exception ex) {
			String cause = paramName + "参数非JSON对象异常";
			throw Errors.clone(Errors.E102, cause);
		}
	} 
	
	/**
	 * 获取非空Set
	 * 
	 * @param paramName
	 *            - 参数名
	 * @return - 参数值
	 * @throws - E700,E102
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Set getNotNullSet(String paramName) {
		return new HashSet(getNotNullList(paramName));
	} 
	                   
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("@").append(this.getClass().getSimpleName()).append("{");
		sb.append("\n params:").append(params); 
		sb.append(" }");

		return sb.toString();
	}
	
	
	public ParamHelper(Map<String, Object> params) { 
		if (null == params) {
			params = new HashMap<String, Object>();
		}
		this.params = params ;
	} 
}
