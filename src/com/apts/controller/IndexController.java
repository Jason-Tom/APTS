package com.apts.controller;

import com.apts.jfinalbase.BaseController;
import com.apts.model.TbAdmin;

public class IndexController extends BaseController {

	public void index() {
		
		new TbAdmin().set("account", "haha").set("password", "123456").set("pwdsalt", "eeee").save();
		this.renderText( TbAdmin.dao.findById(1).get("account").toString() );
		
	}
}