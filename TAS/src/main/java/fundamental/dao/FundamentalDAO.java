package fundamental.dao;

import java.util.List;

import fundamental.dto.CheckDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.StockCloseWDTO;

public interface FundamentalDAO {
	//종목코드 리스트
	List<EnterpriseTotalDTO> codeList();
	
	//종목코드, 종목명, 주식총수 리스트
//	List<EnterpriseTotalDTO> totalList(String code);
	
	//종목코드, 종가, 날짜(주단위) 리스트
	List<StockCloseWDTO> stockClose(String code);
	
	//기업 재무정보
	EnterpriseFinanceDTO enterpriseFinance(String code);
	
	//종가 리스트
	List<StockCloseWDTO> closeList(String code);
	
//------Check page
	List<StockCloseWDTO> stockCloseCheck();
	List<CheckDTO> closeCheck();
//	List<EnterpriseFinanceDTO> enterpriseFinanceCheck();
}


