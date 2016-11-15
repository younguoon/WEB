package member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import member.service.MemberService;


@Controller
public class CountControllet{
	@Autowired
	MemberService service;
	
	@RequestMapping("/membercount.do")
	public String getCount(){
		int result = service.count();
		System.out.println("ÀÎ¿ø¼ö==>"+result);
		return "index";
	}
}
