package member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {
	//get방식으로 요청될때 실행할 메소드 - insert페이지를 response
	@RequestMapping(value="/logout.do", method=RequestMethod.GET)
	public String logout(HttpServletRequest req){
		HttpSession ses = req.getSession(false);
  		if(ses!=null){
  			//세션을 제거하기
  			ses.invalidate();
  		}
  		//첫번째 페이지로 리다이렉트
		return "index";
	}
}

