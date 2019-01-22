package com.wry.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/wry")
public class TestController {
	
	@RequestMapping("/test")
	public String test(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("resultCode", 200);
		map.put("remark", "个人信息");
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("username", "张三");
		map1.put("age", "12");
		map1.put("address", "广东省广州市天河区天河路104号华普大厦7005");
		map.put("data", map1);
		return JSON.toJSONString(map);
	}
}
