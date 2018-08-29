package com.example.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(Exception.class)
	public String result(Model model){
		Map<String, Object> map = new HashMap<>();
		map.put("errcode", 500);
		map.put("errmsg", "系统内部异常！");
		model.addAttribute("error", map);
		return "error";
	}
}
