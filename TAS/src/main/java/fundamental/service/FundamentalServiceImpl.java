package fundamental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fundamental.dao.FundamentalDAO;
import fundamental.dto.BpsDTO;
import fundamental.dto.CheckDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;
import fundamental.logic.LOGIC;

@Service
public class FundamentalServiceImpl implements FundamentalService{
	@Autowired
	@Qualifier("fundamentalmybatis")
	FundamentalDAO dao;
	
	@Autowired
	@Qualifier("fundamentallogic")
	LOGIC logic;
	 
	@Override
	public List<EnterpriseTotalDTO> codeList() {
		return dao.codeList();
	}
	
	@Override
	public List<StockCloseWDTO> stockCloseList(String code) {
//		System.out.println("SERVICE!!!!!!!!!!!!~!(stockClosetList) : "+dao.stockClose(code).get(0).getPrice());
		return dao.stockClose(code);
	}
	
	@Override
	public List<StockCloseWDTO> closeList(String code) {
//		System.out.println("SERVICE!!!!!!!!!!!!~!(closetList) : "+dao.closeList(code).get(0).getPrice());
		return dao.closeList(code);
	}
	
	@Override
	public EnterpriseFinanceDTO enterpriseFinance(String code) {
		return dao.enterpriseFinance(code);
	}

	@Override
	public BpsDTO bps(EnterpriseFinanceDTO EnterpriseFinance, int totalStock, String code) {
		BpsDTO bps = logic.bps(EnterpriseFinance, totalStock, code);
//		System.out.println("Service bps : "+bps.getBps07y());
		return bps;
	}
	
	@Override
	public EpsDTO eps(EnterpriseFinanceDTO EnterpriseFinance, int totalStock, String code) {
		EpsDTO eps = logic.eps(EnterpriseFinance, totalStock, code);
//		System.out.println("Service eps");
		return eps;
	}

	@Override
	public List<StockCloseWDTO> stockCloseCheck() {
		return dao.stockCloseCheck();
	}

	@Override
	public List<CheckDTO> closeCheck() {
		return dao.closeCheck();
	}



}
