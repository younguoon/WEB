package technical.service;

import java.util.List;

import technical.dto.MovingAverageDTO;
import technical.dto.RsiDTO;
import technical.dto.StockDInfoDTO;

public interface TechnicalService {
	
	//주식 종목 코드 리스트 
	List<String> getStockCodeList();
	
	//해당 종목의 주식정보 리스트
	List<StockDInfoDTO> getStockInfoList(String code);
	
	//모든 종목 틍정 날짜부터 주식정보 가져오기
	List<StockDInfoDTO> getWholeStockInfoList(String day);

	
	//5,20,60,120 일 평균 종가 계산(주식정보 리스트 인덱스가 0일때 가장 최근 날짜 정보 )
	List<MovingAverageDTO> getMovingAvgList(List<StockDInfoDTO> stockInfoList);
	
	//5,20,60,120 일 평균 종가 계산(주식정보 리스트 인덱스가 0일때 가장 오래된 날짜 정보 )
	List<MovingAverageDTO> getMovingAvgListOderByOld(List<StockDInfoDTO> stockInfoList);
	
	//골든크로스 체크
	Boolean isGoldencross(List<MovingAverageDTO> movingAvgList, String mode);
	
	//주식정보 검색 시작일 
	String getSearchStartDay(String mode);
	
	//rsi 계산
	List<RsiDTO> getRsiList(List<StockDInfoDTO> stockInfoList);
	
	//low Rsi체크
	Boolean isLowRsi(List<RsiDTO> rsiList,String mode);
}
