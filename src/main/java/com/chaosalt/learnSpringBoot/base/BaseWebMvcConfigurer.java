package com.chaosalt.learnSpringBoot.base;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 注册拦截器
 * 
 * @author jiang
 *
 */
public class BaseWebMvcConfigurer implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 注册拦截器 拦截规则
		// 多个拦截器时 以此添加 执行顺序按添加顺序
		registry.addInterceptor(getLoginHandlerInterceptor()).addPathPatterns("/*");
	}

	@Bean
	public static HandlerInterceptor getLoginHandlerInterceptor() {
		return new LoginHandlerInterceptor();
	}
}
