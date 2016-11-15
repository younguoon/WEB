package technical.service;

import java.util.List;

import technical.dto.MovingAverageDTO;
import technical.dto.RsiDTO;
import technical.dto.StockDInfoDTO;

public interface TechnicalService {
	
	//�ֽ� ���� �ڵ� ����Ʈ 
	List<String> getStockCodeList();
	
	//�ش� ������ �ֽ����� ����Ʈ
	List<StockDInfoDTO> getStockInfoList(String code);
	
	//��� ���� �v�� ��¥���� �ֽ����� ��������
	List<StockDInfoDTO> getWholeStockInfoList(String day);

	
	//5,20,60,120 �� ��� ���� ���(�ֽ����� ����Ʈ �ε����� 0�϶� ���� �ֱ� ��¥ ���� )
	List<MovingAverageDTO> getMovingAvgList(List<StockDInfoDTO> stockInfoList);
	
	//5,20,60,120 �� ��� ���� ���(�ֽ����� ����Ʈ �ε����� 0�϶� ���� ������ ��¥ ���� )
	List<MovingAverageDTO> getMovingAvgListOderByOld(List<StockDInfoDTO> stockInfoList);
	
	//���ũ�ν� üũ
	Boolean isGoldencross(List<MovingAverageDTO> movingAvgList, String mode);
	
	//�ֽ����� �˻� ������ 
	String getSearchStartDay(String mode);
	
	//rsi ���
	List<RsiDTO> getRsiList(List<StockDInfoDTO> stockInfoList);
	
	//low Rsiüũ
	Boolean isLowRsi(List<RsiDTO> rsiList,String mode);
}
