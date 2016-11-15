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
import fundamental.dto.StockCloseWDTO;
import fundamental.service.FundamentalService;

@Controller
public class PBRbandController extends HttpServlet{
	@Autowired
	FundamentalService service;
	
	@RequestMapping(value = "/pbrband.do", method = RequestMethod.GET)
	public ModelAndView list(String code){
		ModelAndView mav = new ModelAndView();
		List<EnterpriseTotalDTO> codeList 		   = service.codeList();
		//ÁÖ½ÄÃÑ¼ö
		int totalStock =0;
		for(int i=0 ; i<codeList.size();i++){
			if(codeList.get(i).getCode().equals(code)){
				totalStock = codeList.get(i).getTotalstock();
//				System.out.println("controller - code :"+code+", name : "+codeList.get(i).getName());
				
			}
		}
		EnterpriseFinanceDTO 	 enterpriseFinance = service.enterpriseFinance(code);
		List<StockCloseWDTO> 	 stockCloseList    = service.stockCloseList(code);
		List<StockCloseWDTO>	 closeList		   = service.closeList(code);
		BpsDTO 					 bps 		       = service.bps(enterpriseFinance, totalStock, code);
		
		
		mav.addObject("closeList", closeList);
		mav.addObject("codeList", codeList);
		mav.addObject("enterpriseFinance",enterpriseFinance);
		mav.addObject("bps",bps);
		mav.addObject("stockCloseList",stockCloseList);
		mav.setViewName("chart_pbr");
		return mav;
		
	}
}



