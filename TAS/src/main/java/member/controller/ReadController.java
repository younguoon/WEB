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
public class ReadController {
	@Autowired
	MemberService service;
	
	
	@RequestMapping(value="/memberread.do", method=RequestMethod.GET)
	public ModelAndView runRead(HttpServletRequest req, MemberDTO user, String id){
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", service.read(id));
		mav.setViewName("memberdetail");
		return mav;
	}
	
	@RequestMapping(value="/memberread.do", method=RequestMethod.POST)
	public ModelAndView runUdateRead(HttpServletRequest req, MemberDTO user){
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", user);
		mav.setViewName("memberupdate");
		return mav;
	}

}
