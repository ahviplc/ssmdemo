package com.common.utils;

import java.util.Collection;

/**
 * 集合工具类
 * @Title CollectionUtil.java
 * @Package com.sinotn.online.util
 * @Description 
 * Copyright: Copyright (c) 2015
 * Company:北京信诺软通
 * 
 * @author <a href="mailto:zouds@sinotn.com">邹大嵩</a>
 * @date 2016年5月9日 下午3:29:40
 * @version V1.0
 */
@SuppressWarnings("all")
public class CollectionUtil {
	
	/**
	 * 
	 * 判断集合是否为空
	 * @param obj
	 * @return
	 * @auth <a href="mailto:zouds@sinotn.com">邹大嵩</a>
	 * @date 2016年5月9日 下午3:31:30
	 */
	public static boolean isEmpty(Collection obj) {
		if (obj == null) {
			return true;
		}
		return obj.isEmpty();
	}
}
