package bigdata.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bigdata.dto.BigdataDTO;
import bigdata.service.BigdataService;

@Controller
public class IndustryNewsController {
	@Autowired
	BigdataService service;
	
	@RequestMapping(value="/industry.do", method=RequestMethod.GET)
	public ModelAndView topicnews(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		System.out.println("컨트롤러 동작");
		/*//List<BigdataDTO> industrylist=service.getIndustrynews();
	
		for(int i=0;i<industrylist.size();i++){
			System.out.println(industrylist.get(i));
		
		
		}
		mav.addObject("industrylist",industrylist);*/
		mav.setViewName("industry");
		return mav;
		
	}
	

}

