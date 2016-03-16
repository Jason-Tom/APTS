package com.apts.jfinalbase;

import com.apts.constant.AppBaseInfo;
import com.apts.constant.AppConstant;
import com.apts.controller.IndexController;
import com.apts.mapper.TableMapper;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

/**
 * JFinal基本配置
 * 
 * @author lwh @2016-03-16
 */
public class BaseConfig extends JFinalConfig {

	/**
	 * 常量配置
	 */
	@Override
	public void configConstant(Constants me) {
		// 常量初始化
		AppBaseInfo.initConstant(this.loadPropertyFile("config.properties"));
		me.setViewType(ViewType.FREE_MARKER);
		me.setDevMode(this.getPropertyToBoolean(AppConstant.DevMode, false));
	}

	/**
	 * 路由配置
	 */
	@Override
	public void configRoute(Routes me) {
		me.add("/index", IndexController.class);//非根路径无法访问
		me.add("/", IndexController.class);//最好加上根路径
		//有时会无法访问访问是因为eclipse内置配置有问题，重装即可，文件要删除干净，服务也可以删掉不碍事
	}

	/**
	 * 插件配置
	 */
	@Override
	public void configPlugin(Plugins me) {
		// 作业调度配置
		// QuartzPlugin quartzPlugin = new QuartzPlugin("job.properties");
		// me.add(quartzPlugin);

		// 配置C3p0数据库连接池插件
		C3p0Plugin c3p0Plugin = new C3p0Plugin(this.getProperty(AppConstant.JdbcUrl),
				this.getProperty(AppConstant.User), this.getProperty(AppConstant.Password));
		me.add(c3p0Plugin);

		// 在应用中使用 ActiveRecord 插件非常方便地操作数据库
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
		me.add(arp);
		
		// 配置数据表映射
		TableMapper.mapperConfig(arp);

	}

	/**
	 * AOP配置
	 */
	@Override
	public void configInterceptor(Interceptors me) {

	}

	/**
	 * 处理器配置
	 */
	@Override
	public void configHandler(Handlers me) {

	}

	/**
	 * mian方法启动项目
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JFinal.start("WebRoot", 80, "/", 5);
	}

}
