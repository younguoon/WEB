package fundamental.dao;

import java.util.List;

import fundamental.dto.CheckDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.StockCloseWDTO;

public interface FundamentalDAO {
	//�����ڵ� ����Ʈ
	List<EnterpriseTotalDTO> codeList();
	
	//�����ڵ�, �����, �ֽ��Ѽ� ����Ʈ
//	List<EnterpriseTotalDTO> totalList(String code);
	
	//�����ڵ�, ����, ��¥(�ִ���) ����Ʈ
	List<StockCloseWDTO> stockClose(String code);
	
	//��� �繫����
	EnterpriseFinanceDTO enterpriseFinance(String code);
	
	//���� ����Ʈ
	List<StockCloseWDTO> closeList(String code);
	
//------Check page
	List<StockCloseWDTO> stockCloseCheck();
	List<CheckDTO> closeCheck();
//	List<EnterpriseFinanceDTO> enterpriseFinanceCheck();
}


