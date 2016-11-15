package member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {
	//get������� ��û�ɶ� ������ �޼ҵ� - insert�������� response
	@RequestMapping(value="/logout.do", method=RequestMethod.GET)
	public String logout(HttpServletRequest req){
		HttpSession ses = req.getSession(false);
  		if(ses!=null){
  			//������ �����ϱ�
  			ses.invalidate();
  		}
  		//ù��° �������� �����̷�Ʈ
		return "index";
	}
}

