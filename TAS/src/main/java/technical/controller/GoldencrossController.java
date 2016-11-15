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
		long start = System.currentTimeMillis(); //����ð������� ���� ����
		
		//�˻� ������ ��¥ ��������
		String day= service.getSearchStartDay(mode);
		
		//������ ��¥���� ��� ������ �ֽ����� ����
		List<StockDInfoDTO> wholeStockInfoList = service.getWholeStockInfoList(day);
		

		//DB �ε� �ð�����
		long dbEnd = System.currentTimeMillis();
		//System.out.println( "DB�ҷ����� ���� �ð� : " + ( dbEnd - start )/1000.0 );
		
		//���� �ڵ� ����Ʈ ����
		List<String> codeList = service.getStockCodeList();
		
		List<StockDInfoDTO> resultStockInfoList = new ArrayList<StockDInfoDTO>();
		
		
		//��� ũ�ν� üũ ���� �ð�
		long isGoldencrossstart = System.currentTimeMillis();
		
		int stockInfoIndex =0;
		for(int i=0; i<codeList.size();i++){
			//�ϳ��� ���� �ֽ������� ������� ��ü 
			List<StockDInfoDTO> stockInfoList = new ArrayList<StockDInfoDTO>();
			
			//��ü �ֽ� �������� �� ���� �ֽ������� stockInfoList�� ����
			//�ֽ� ������ �ֱ� ��¥������ ���� �Ǿ�����(list �ε����� 0�϶� ���� �ֱ� ����)
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
		//System.out.println("���ũ�ν� üũ ���� �ð� : " + ( isGoldencrossEnd - isGoldencrossstart )/1000.0 );
		
		//����ð�����
		long logicEnd = System.currentTimeMillis();
		//System.out.println( "�� ���� �ð� : " + ( logicEnd - start )/1000.0 );
		
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("mode", mode);
		mav.addObject("resultlist",resultStockInfoList);
		mav.setViewName("goldencross");
		
		//System.out.println("�Ϸ�"+resultStockInfoList.size());
		return mav;
	}

}
