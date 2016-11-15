package member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import member.service.MemberService;

@Controller
public class SearchController {
	@Autowired
	MemberService service;
	
	
	@RequestMapping(value="/membersearch.do", method=RequestMethod.GET)
	public String showPage(){
		return "membersearch";
	}

	@RequestMapping(value="/memberearch.do", method=RequestMethod.POST)
	public ModelAndView runSearch(HttpServletRequest req, String search){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userlist", service.findByAddr(search));
		mav.setViewName("membersearchlist");
		return mav;
	}
}
