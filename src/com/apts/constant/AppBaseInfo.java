package com.apts.constant;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 项目常量初始化赋值
 * @author lwh
 * @date 2016-03-15
 */
public final class AppBaseInfo {
	//常量(key:value)集
	private static final Map<String,String> map = new HashMap<String,String>();
	
	/**
	 * 常量初始化配置
	 * @author lwh
	 * @date 2016-03-15
	 */
	public static void initConstant( Properties prop ){
//		AppBaseInfo.setValue(key, prop.getProperty(  ));
	}
	
	//配置某一常量
	public static void setValue(String key, String value){
		map.put(key, value);
	}
	
	//获取某一常量值
	public static String getValue(String key){
		return map.get(key);
	}
	
}
