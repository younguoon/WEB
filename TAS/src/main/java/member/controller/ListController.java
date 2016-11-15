package member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import member.dto.MemberDTO;
import member.service.MemberService;
@Controller
public class ListController{
	@Autowired
	MemberService servicve;
	
	@RequestMapping("/memberlist.do")
	protected ModelAndView showList(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mav = new ModelAndView();
		List<MemberDTO> userlist = servicve.getMemberList();
		mav.addObject("userlist", userlist);
		mav.setViewName("memberlist");
		return mav;
	}
}
