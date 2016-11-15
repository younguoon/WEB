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
public class UpdateController {
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/memberupdate.do", method=RequestMethod.POST)
	public ModelAndView runUdate(HttpServletRequest req, MemberDTO user){
		service.update(user);
		return new ModelAndView("redirect:memberlist.do");
	}
}
