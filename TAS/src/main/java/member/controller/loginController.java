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
	
	//get������� ��û�ɶ� ������ �޼ҵ� - insert�������� response
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String showPage(){
		return "login/form";
	}
	
	//post������� ��û�ɶ� ������ �޼ҵ� - ���� db�� insert�� �ϱ� ���� ����� ����
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

