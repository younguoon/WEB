package member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import member.service.MemberService;


@Controller
public class DeleteController{
	@Autowired
	MemberService servicve;
	
	@RequestMapping("/memberdelete.do")
	protected String showList(HttpServletRequest req, HttpServletResponse res, String id) throws Exception {
		servicve.delete(id);
		return "redirect:memberlist.do";
	}
}
