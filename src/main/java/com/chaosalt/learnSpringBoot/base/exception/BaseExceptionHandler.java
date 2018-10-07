package com.chaosalt.learnSpringBoot.base.exception;

import java.nio.file.FileSystemNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 * 
 * @author jiang
 *
 */
@ControllerAdvice
public class BaseExceptionHandler {
	/**
	 * 拦截Exception类的异常
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, Object> exceptionHandler(Exception e) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("respCode", "9999");
		result.put("respMsg", e.getMessage());
		return result;
	}

	/**
	 * 拦截 CommonException 的异常
	 * 
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(FileSystemNotFoundException.class)
	@ResponseBody
	public Map<String, Object> exceptionHandler(FileSystemNotFoundException e) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("respCode", "9999");
		result.put("respMsg", e.getMessage());
		return result;
	}
}
