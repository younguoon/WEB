package technical.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import technical.dto.RsiDTO;
import technical.dto.StockDInfoDTO;
import technical.service.TechnicalService;

@Controller
public class RsiController {
	@Autowired
	TechnicalService service;

	@RequestMapping(value = "/rsi.do", method = RequestMethod.GET)
	public ModelAndView run(HttpServletRequest req, String mode) {
		long start = System.currentTimeMillis(); //실행시간측정을 위한 변수
		

		// 검색 시작할 날짜 가져오기
		String day = service.getSearchStartDay(mode);
		// 종목 코드 리스트 저장
		List<String> codeList = service.getStockCodeList();

		
		List<StockDInfoDTO> resultStockInfoList = new ArrayList<StockDInfoDTO>();
		List<String> index = new ArrayList<String>();

		// 지정한 날짜까지 모든 종목의 주식정보 저장
		List<StockDInfoDTO> wholeStockInfoList = new ArrayList<StockDInfoDTO>();
		wholeStockInfoList = service.getWholeStockInfoList(day);
		
		int stockInfoIndex =0;
		for(int i=0; i<codeList.size();i++){
			//하나의 종목 주식정보를 담기위한 객체 
			List<StockDInfoDTO> stockInfoList = new ArrayList<StockDInfoDTO>();
			
			//전체 주식 정보에서 한 종목 주식정보를 stockInfoList에 저장
			while(true){
				if(codeList.get(i).equals(wholeStockInfoList.get(stockInfoIndex).getCode())){
					stockInfoList.add(wholeStockInfoList.get(stockInfoIndex));
					stockInfoIndex= stockInfoIndex+1;
					
				}
				if(stockInfoIndex>=wholeStockInfoList.size()){
					break;
				}
				if(!codeList.get(i).equals(wholeStockInfoList.get(stockInfoIndex).getCode()) & 
						codeList.get(i).equals(wholeStockInfoList.get(stockInfoIndex-1).getCode())){
					break;
				}

			}
			
			List<RsiDTO> rsiList = service.getRsiList(stockInfoList);
			
			Boolean isLowRsi = service.isLowRsi(rsiList, mode);
			
			if(isLowRsi){
				resultStockInfoList.add(stockInfoList.get(0));
			}
		
		}
		ModelAndView mav = new ModelAndView();
		mav.addObject("mode", mode);
		mav.addObject("resultlist",resultStockInfoList);
		mav.setViewName("rsi");

		return mav;	
		//return new ModelAndView("rsi", "mode", mode);

	}
}
