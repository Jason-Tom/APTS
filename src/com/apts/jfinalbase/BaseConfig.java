package com.apts.jfinalbase;

import com.apts.controller.IndexController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.render.ViewType;

public class BaseConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		this.loadPropertyFile("config.properties");
		me.setDevMode( this.getPropertyToBoolean("devMode", false) );
		me.setViewType( ViewType.FREE_MARKER );
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/index", IndexController.class);
	}

	@Override
	public void configPlugin(Plugins me) {

	}

	@Override
	public void configInterceptor(Interceptors me) {

	}

	@Override
	public void configHandler(Handlers me) {

	}

	/**
	 * mian方法启动项目
	 * @param args
	 */
	public static void main(String[] args){
		JFinal.start("WebRoot", 80, "/", 5);
	}
	
}
