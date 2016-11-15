package fundamental.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;
import fundamental.service.FundamentalService;

@Controller
public class PERbandController extends HttpServlet{
	@Autowired
	FundamentalService service;
	
	@RequestMapping(value = "/perband.do", method = RequestMethod.GET)
	public ModelAndView list(String code){
		ModelAndView mav = new ModelAndView();
		
		List<EnterpriseTotalDTO> codeList 		   = service.codeList();
		//ÁÖ½ÄÃÑ¼ö
		int totalStock =0;
		for(int i=0 ; i<codeList.size();i++){
			if(codeList.get(i).getCode().equals(code)){
				totalStock = codeList.get(i).getTotalstock();
			}
		}
		
		EnterpriseFinanceDTO 	 enterpriseFinance = service.enterpriseFinance(code);
		EpsDTO 					 eps 		       = service.eps(enterpriseFinance, totalStock, code);
		List<StockCloseWDTO> 	 stockCloseList    = service.stockCloseList(code);
		List<StockCloseWDTO>	 closeList		   = service.closeList(code);
		
		mav.addObject("closeList", closeList);
		mav.addObject("codeList", codeList);
		mav.addObject("enterpriseFinance",enterpriseFinance);
		mav.addObject("eps",eps);
		mav.addObject("stockCloseList",stockCloseList);
		mav.setViewName("chart_per");
		return mav;
	}
}
