package com.apts.controller;

import com.apts.jfinalbase.BaseController;
import com.apts.model.TbAdmin;

public class IndexController extends BaseController {

	public void index() {
		//操作数据库
//		new TbAdmin().set("account", "haha").set("password", "123456").set("pwdsalt", "eeee").save();//插入数据
//		this.renderText( TbAdmin.dao.findById(1).get("account").toString() );//读取数据
		this.renderText("aa" );
		
	}
}