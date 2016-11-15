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
		long start = System.currentTimeMillis(); //����ð������� ���� ����
		

		// �˻� ������ ��¥ ��������
		String day = service.getSearchStartDay(mode);
		// ���� �ڵ� ����Ʈ ����
		List<String> codeList = service.getStockCodeList();

		
		List<StockDInfoDTO> resultStockInfoList = new ArrayList<StockDInfoDTO>();
		List<String> index = new ArrayList<String>();

		// ������ ��¥���� ��� ������ �ֽ����� ����
		List<StockDInfoDTO> wholeStockInfoList = new ArrayList<StockDInfoDTO>();
		wholeStockInfoList = service.getWholeStockInfoList(day);
		
		int stockInfoIndex =0;
		for(int i=0; i<codeList.size();i++){
			//�ϳ��� ���� �ֽ������� ������� ��ü 
			List<StockDInfoDTO> stockInfoList = new ArrayList<StockDInfoDTO>();
			
			//��ü �ֽ� �������� �� ���� �ֽ������� stockInfoList�� ����
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
