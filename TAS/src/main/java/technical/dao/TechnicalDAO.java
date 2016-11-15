package technical.dao;

import java.util.List;

import technical.dto.StockDInfoDTO;

public interface TechnicalDAO {
	List<String> getStockCodeList();
	List<StockDInfoDTO> getStockInfoList(String code);
	List<StockDInfoDTO> getWholeStockInfoList(String day);
	

}
