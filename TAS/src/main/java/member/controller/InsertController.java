package member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import member.dto.MemberDTO;
import member.service.MemberService;

@Controller
public class InsertController {
	@Autowired
	MemberService service;
	
	//get������� ��û�ɶ� ������ �޼ҵ� - insert�������� response
	@RequestMapping(value="/memberinsert.do", method=RequestMethod.GET)
	public String showPage(){
		return "memberinput/form";
	}
	
	//post������� ��û�ɶ� ������ �޼ҵ� - ���� db�� insert�� �ϱ� ���� ����� ����
	@RequestMapping(value="/memberinsert.do", method=RequestMethod.POST)
	public ModelAndView runInsert(HttpServletRequest req, MemberDTO user, String id){
		
		service.insert(user);
		return new ModelAndView("redirect:memberlist.do");
	}
}

