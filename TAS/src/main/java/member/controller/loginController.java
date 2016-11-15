package member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import member.dto.MemberDTO;
import member.service.MemberService;

@Controller
public class loginController {
	@Autowired
	MemberService service;
	
	//get방식으로 요청될때 실행할 메소드 - insert페이지를 response
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String showPage(){
		return "login/form";
	}
	
	//post방식으로 요청될때 실행할 메소드 - 실제 db에 insert를 하기 위한 기능을 수행
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(HttpServletRequest req, MemberDTO user){
		System.out.println(user+"-----------");
		String url="";
		MemberDTO loginUser = service.login(user);
		if(loginUser!=null){
			req.getSession().setAttribute("loginUser", loginUser);
			url="index";
		}else{
			url="login/form";
		}
		return url;
		
		
	}
}

