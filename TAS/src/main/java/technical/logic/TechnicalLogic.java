package technical.logic;

import java.util.List;

import technical.dto.MovingAverageDTO;
import technical.dto.RsiDTO;
import technical.dto.StockDInfoDTO;

public interface TechnicalLogic {
	
	List<MovingAverageDTO> getMovingAvgList(List<StockDInfoDTO> stockInfoList);
	
	List<MovingAverageDTO> getMovingAvgListOderByOld(List<StockDInfoDTO> stockInfoList);
	
	Boolean isGoldencross(List<MovingAverageDTO> movingAvgList, String mode);
	
	String getSearchStartDay(String mode);
	
	List<RsiDTO> getRsiList(List<StockDInfoDTO> stockInfoList);
	
	Boolean isLowRsi(List<RsiDTO> rsiList, String mode);

}
