package com.apts.controller;

import com.apts.jfinalbase.BaseController;
import com.apts.model.TbAdmin;

public class IndexController extends BaseController {

	public void index() {
		//操作数据库
//		new TbAdmin().set("password", "123456").set("pwdsalt", "eeee").save();//插入数据，（小心数据不能重复）
//		this.renderText( TbAdmin.dao.findById(1).get("account").toString() );//读取数据,(审核正确)
		//		this.renderText("aa" );
//		new TbAdmin().dao.deleteById(5); //删除id值为5的记录
//		new TbAdmin().dao.findById(1).set("account", "James").update(); //修改数据，是findById，官方文档有错	
		new TbAdmin();
//		TbAdmin admin = TbAdmin.dao.findByIdLoadColumns (2, "account, password");//录入了数据之后如何读取
	}
}