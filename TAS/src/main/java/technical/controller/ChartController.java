package technical.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import technical.dto.StockDInfoDTO;
import technical.service.TechnicalService;

@Controller
public class ChartController {
	@Autowired
	TechnicalService service;

	@RequestMapping(value = "/stockchart.do", method = RequestMethod.GET)
	public ModelAndView run(HttpServletRequest req,String code) {
		
		List<StockDInfoDTO> stockInfoList = service.getStockInfoList(code);
		return new ModelAndView("stockChart", "stockInfoList", stockInfoList);
		
	}

}
