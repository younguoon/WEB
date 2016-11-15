package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.dto.BoardDTO;
import board.service.BoardService;

@Controller
public class BoardController  {
	@Autowired
	BoardService service;
	
	@RequestMapping(value="/board_list.do", method=RequestMethod.GET)
	public ModelAndView list(){
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("brdlists",service.list());
		mav.setViewName("board");
		return mav;
	}
	
	@RequestMapping(value="/board_write.do", method=RequestMethod.GET)
	public String insert(){
		return "board_write";
	}
	
	@RequestMapping(value="/board_reg.do", method=RequestMethod.POST)
	public ModelAndView reg(BoardDTO brd){
		System.out.println(brd);
		service.insert(brd);
		return new ModelAndView("redirect:board_list.do");
	}
	
	@RequestMapping(value="/boardread.do", method=RequestMethod.GET)
	public ModelAndView read(String board_no){
		ModelAndView mav = new ModelAndView();
		System.out.println("�Խ��� ��ȣ"+board_no);
		service.countup(board_no);
		mav.addObject("boardinfo",service.read(board_no));
		mav.setViewName("board_read");
		return mav;
	}
	
	@RequestMapping(value="/board_update.do", method=RequestMethod.GET)
	public ModelAndView brdupdate(String board_no){
		System.out.println("������Ʈ ���� "+board_no);
		ModelAndView mav = new ModelAndView();
		//board_read ���񽺸� ȣ���Ͽ� �����о����
		mav.addObject("boardinforead",service.read(board_no));
		mav.setViewName("board_update");
		return mav;
	}
	
	@RequestMapping(value="/board_infoupdate.do", method=RequestMethod.POST)
	public ModelAndView brdinfoupdate(BoardDTO brd){
		System.out.println("������Ʈ ���� "+brd);
		//board_read ���񽺸� ȣ���Ͽ� �����о����
		service.update(brd);
		return new ModelAndView("redirect:board_list.do");
	}
	
	@RequestMapping(value="/board_delete.do", method=RequestMethod.GET)
	public ModelAndView delete(String board_no){
		System.out.println("������Ʈ ���� "+board_no);
		service.delete(board_no);
		return new ModelAndView("redirect:board_list.do");
	}
}


