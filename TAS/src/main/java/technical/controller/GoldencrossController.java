package technical.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import technical.dto.MovingAverageDTO;
import technical.dto.StockDInfoDTO;
import technical.service.TechnicalService;

@Controller
public class GoldencrossController {
	@Autowired
	TechnicalService service;
	
	@RequestMapping(value="/goldencross.do", method=RequestMethod.GET)
	public ModelAndView run(HttpServletRequest req, String mode) throws ParseException{
		long start = System.currentTimeMillis(); //실행시간측정을 위한 변수
		
		//검색 시작할 날짜 가져오기
		String day= service.getSearchStartDay(mode);
		
		//지정한 날짜까지 모든 종목의 주식정보 저장
		List<StockDInfoDTO> wholeStockInfoList = service.getWholeStockInfoList(day);
		

		//DB 로딩 시간측정
		long dbEnd = System.currentTimeMillis();
		//System.out.println( "DB불러오기 실행 시간 : " + ( dbEnd - start )/1000.0 );
		
		//종목 코드 리스트 저장
		List<String> codeList = service.getStockCodeList();
		
		List<StockDInfoDTO> resultStockInfoList = new ArrayList<StockDInfoDTO>();
		
		
		//골든 크로스 체크 시작 시간
		long isGoldencrossstart = System.currentTimeMillis();
		
		int stockInfoIndex =0;
		for(int i=0; i<codeList.size();i++){
			//하나의 종목 주식정보를 담기위한 객체 
			List<StockDInfoDTO> stockInfoList = new ArrayList<StockDInfoDTO>();
			
			//전체 주식 정보에서 한 종목 주식정보를 stockInfoList에 저장
			//주식 정보는 최근 날짜순으로 정렬 되어있음(list 인덱스가 0일때 가장 최근 정보)
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
			List<MovingAverageDTO> movingAvgList = service.getMovingAvgList(stockInfoList);
			Boolean isGoldencross = service.isGoldencross(movingAvgList, mode);
			
			if(isGoldencross){
				resultStockInfoList.add(stockInfoList.get(0));
			}
			
		}
		
		long isGoldencrossEnd = System.currentTimeMillis();
		//System.out.println("골든크로스 체크 실행 시간 : " + ( isGoldencrossEnd - isGoldencrossstart )/1000.0 );
		
		//실행시간측정
		long logicEnd = System.currentTimeMillis();
		//System.out.println( "총 실행 시간 : " + ( logicEnd - start )/1000.0 );
		
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("mode", mode);
		mav.addObject("resultlist",resultStockInfoList);
		mav.setViewName("goldencross");
		
		//System.out.println("완료"+resultStockInfoList.size());
		return mav;
	}

}
