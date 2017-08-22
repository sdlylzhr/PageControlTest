package com.lanou.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Message;
import com.lanou.service.MessageService;
import com.lanou.utils.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

@Resource
	private MessageService messageService;
	
	@RequestMapping(value="/")
	public String frontPage(){

		return "messageBoard";
	}
	
	@RequestMapping(value="/findall")
	@ResponseBody
	public List<Message> findAllMsg(){
		List<Message> messages = messageService.findAllMsg();
		return messages;
	}

	@RequestMapping(value = "/pagetest")
	@ResponseBody
	public PageInfo<Message> pagetest(){
		return messageService.queryPage(1, 2);
	}

	@RequestMapping(value = "/test")
	@ResponseBody
	public String gittest(){
		return "bbb";
	}

	public void test(){

		System.out.println(1111);
	}

	// 编辑代码
	@RequestMapping(value = "/branch")
	@ResponseBody
	public String branchTest(){

		return "branch";
	}



}








