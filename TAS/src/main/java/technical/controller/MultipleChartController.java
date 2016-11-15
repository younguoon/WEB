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
		long start = System.currentTimeMillis(); // ����ð������� ���� ����

		//�ֽ� ������ ���� ��¥������ ���� �Ǿ�����(list �ε����� 0�϶� ���� ������ ��¥ ����)
		List<StockDInfoDTO> stockInfoList = service.getStockInfoList(code);
		List<MovingAverageDTO> movingAvgList = service.getMovingAvgListOderByOld(stockInfoList);

		// ����ð�����
		long logicEnd = System.currentTimeMillis();
		//System.out.println("�� ���� �ð� : " + (logicEnd - start) / 1000.0);

		return new ModelAndView("stockMultipleChart", "movingAvgList",movingAvgList);

	}

}
