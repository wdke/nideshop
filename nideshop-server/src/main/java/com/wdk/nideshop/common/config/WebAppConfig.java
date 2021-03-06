package com.wdk.nideshop.common.config;

import com.wdk.nideshop.web.interceptor.TokenInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {


	@Autowired
	private TokenInterceptor tokenInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//注册自定义拦截器，添加拦截路径和排除拦截路径
		registry.addInterceptor(tokenInterceptor).addPathPatterns("/**");
		super.addInterceptors(registry);
	}
}

