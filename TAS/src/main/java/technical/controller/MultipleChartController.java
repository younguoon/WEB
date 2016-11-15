package technical.controller;

import java.util.ArrayList;
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
public class MultipleChartController {
	@Autowired
	TechnicalService service;

	@RequestMapping(value = "/stockmultiplechart.do", method = RequestMethod.GET)
	public ModelAndView run(HttpServletRequest req, String code) {
		long start = System.currentTimeMillis(); // 실행시간측정을 위한 변수

		//주식 정보는 과거 날짜순으로 정렬 되어있음(list 인덱스가 0일때 가장 오래된 날짜 정보)
		List<StockDInfoDTO> stockInfoList = service.getStockInfoList(code);
		List<MovingAverageDTO> movingAvgList = service.getMovingAvgListOderByOld(stockInfoList);

		// 실행시간측정
		long logicEnd = System.currentTimeMillis();
		//System.out.println("총 실행 시간 : " + (logicEnd - start) / 1000.0);

		return new ModelAndView("stockMultipleChart", "movingAvgList",movingAvgList);

	}

}
