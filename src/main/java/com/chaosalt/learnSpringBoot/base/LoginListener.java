package com.chaosalt.learnSpringBoot.base;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@WebListener
public class LoginListener implements ServletRequestListener {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		log.info("监听器：销毁");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		log.info("监听器：初始化");
	}

}
