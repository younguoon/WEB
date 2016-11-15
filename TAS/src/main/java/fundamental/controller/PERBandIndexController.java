package fundamental.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;
import fundamental.service.FundamentalService;

@Controller
public class PERBandIndexController extends HttpServlet{
	@Autowired
	FundamentalService service;
	
	@RequestMapping(value = "/perbandindex.do", method = RequestMethod.GET)
	public ModelAndView list(String code){
		ModelAndView mav = new ModelAndView();
		
		List<EnterpriseTotalDTO> codeList 		   = service.codeList();
		EnterpriseFinanceDTO 	 enterpriseFinance = service.enterpriseFinance(codeList.get(0).getCode());
		EpsDTO 					 eps 		       = service.eps(enterpriseFinance, codeList.get(15).getTotalstock(), codeList.get(0).getCode());
		List<StockCloseWDTO> 	 stockCloseList    = service.stockCloseList(codeList.get(0).getCode());
		List<StockCloseWDTO>	 closeList		   = service.closeList(codeList.get(0).getCode());
		
		mav.addObject("closeList", closeList);
		mav.addObject("codeList", codeList);
		mav.addObject("enterpriseFinance",enterpriseFinance);
		mav.addObject("eps",eps);
		mav.addObject("stockCloseList",stockCloseList);
		mav.setViewName("chart_per_layout");
		return mav;
	}
}
