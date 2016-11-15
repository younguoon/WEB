package fundamental.service;

import java.util.List;

import fundamental.dto.BpsDTO;
import fundamental.dto.CheckDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;

public interface FundamentalService {
	//�����ڵ� ����Ʈ
	List<EnterpriseTotalDTO> codeList();
	
	//�����ڵ�, ����, �ֽ��Ѽ� ����Ʈ
	List<StockCloseWDTO> stockCloseList(String code);
	
	//���� ����Ʈ
	List<StockCloseWDTO> closeList(String code);
	
	//��� �繫���� ����Ʈ
	EnterpriseFinanceDTO enterpriseFinance(String code);
	
	//������� - BPS
	BpsDTO bps(EnterpriseFinanceDTO enterpriseFinance, int totalStock, String code);
	 
	//������� - EPS
	EpsDTO eps(EnterpriseFinanceDTO EnterpriseFinance, int totalStock, String code);
	
//----------Check page	
	//����, bps, eps ����� �����ڵ�
	List<StockCloseWDTO> stockCloseCheck();
	List<CheckDTO> closeCheck();
//	List<EnterpriseFinanceDTO> enterpriseFinanceCheck(List<EnterpriseTotalDTO> codeList);
//	List<BpsDTO> bpsCheck(List<EnterpriseTotalDTO> codeList);
//	List<EpsDTO> epsCheck(List<EnterpriseTotalDTO> codeList);
	
	
	
}