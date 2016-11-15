package bigdata.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bigdata.dto.BigdataDTO;
import bigdata.service.BigdataService;

@Controller
public class TopicNewsController {
	@Autowired
	BigdataService service;

	
	@RequestMapping(value = "/bigdata.do", method = RequestMethod.GET)
	public ModelAndView topicnews(HttpServletRequest req, String ndate) {
		System.out.println("컨트롤러 동작");
		
		if(ndate==null){
			SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
			Date currentTime = new Date();
			ndate = date1.format(currentTime);
		}
		
		ModelAndView mav = new ModelAndView();
		List<BigdataDTO> topiclist;
		List<BigdataDTO> industrylist;
		List<BigdataDTO> largelist;
		List<BigdataDTO> mediumlist;
		List<BigdataDTO> smalllist;
	
		topiclist = service.getTopicnews(ndate);
		industrylist = service.getIndustrynews(ndate);
		largelist = service.getLargenews(ndate);
		mediumlist = service.getMediumnews(ndate);
		smalllist = service.getSmallnews(ndate);
		
		
		mav.addObject("ndate", ndate);
		mav.addObject("topiclist", topiclist);
		mav.addObject("industrylist", industrylist);
		mav.addObject("largelist", largelist);
		mav.addObject("mediumlist", mediumlist);
		mav.addObject("smalllist", smalllist);
		
		/*for(int i=0;i<industrylist.size();i++){
			System.out.println(industrylist.get(i));
		}*/
		return mav;
		

		

	}

}
