package fundamental.service;

import java.util.List;

import fundamental.dto.BpsDTO;
import fundamental.dto.CheckDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;

public interface FundamentalService {
	//종목코드 리스트
	List<EnterpriseTotalDTO> codeList();
	
	//종목코드, 종가, 주식총수 리스트
	List<StockCloseWDTO> stockCloseList(String code);
	
	//종가 리스트
	List<StockCloseWDTO> closeList(String code);
	
	//기업 재무정보 리스트
	EnterpriseFinanceDTO enterpriseFinance(String code);
	
	//기업정보 - BPS
	BpsDTO bps(EnterpriseFinanceDTO enterpriseFinance, int totalStock, String code);
	 
	//기업정보 - EPS
	EpsDTO eps(EnterpriseFinanceDTO EnterpriseFinance, int totalStock, String code);
	
//----------Check page	
	//종가, bps, eps 종목명 종목코드
	List<StockCloseWDTO> stockCloseCheck();
	List<CheckDTO> closeCheck();
//	List<EnterpriseFinanceDTO> enterpriseFinanceCheck(List<EnterpriseTotalDTO> codeList);
//	List<BpsDTO> bpsCheck(List<EnterpriseTotalDTO> codeList);
//	List<EpsDTO> epsCheck(List<EnterpriseTotalDTO> codeList);
	
	
	
}