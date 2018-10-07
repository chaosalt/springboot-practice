package com.chaosalt.learnSpringBoot.base;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注册filter
 * 
 * @author jiang
 *
 */
@Configuration
public class BaseWebComponentConfig {
	@Bean
	public FilterRegistrationBean AccessFilterRegistrationBean() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		// 当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，这样不可自动注入过滤器使用的其他bean类。
		// 当然，若无其他bean需要获取时，可直接new CustomFilter()，也可使用getBean的方式。
		registration.setFilter(AccessFilter());
		// 过滤器名称
		registration.setName("accessFilter");
		// 拦截路径
		registration.addUrlPatterns("/*");
		// 设置顺序
		registration.setOrder(1);
		return registration;
	}

	@Bean
	public FilterRegistrationBean LoginFilterRegistrationBean() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		// 当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，这样不可自动注入过滤器使用的其他bean类。
		// 当然，若无其他bean需要获取时，可直接new CustomFilter()，也可使用getBean的方式。
		registration.setFilter(LoginFilter());
		// 过滤器名称
		registration.setName("loginFilter");
		// 拦截路径
		registration.addUrlPatterns("/*");
		// 设置顺序
		registration.setOrder(2);
		return registration;
	}

	@Bean
	public Filter AccessFilter() {
		return new AccessFilter();
	}

	@Bean
	public Filter LoginFilter() {
		return new LoginFilter();
	}

}
