package com.apts.mapper;

import com.apts.model.TbAdmin;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * 数据表映射
 * 
 * @author lwh
 * @date 2016-03-15
 */
public final class TableMapper {

	public static final void mapperConfig(ActiveRecordPlugin arp) {
		
		arp.addMapping("tb_admin", TbAdmin.class);
		
		
	}

}
