package fundamental.logic;

import java.util.List;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EpsDTO;

public interface LOGIC {
	public BpsDTO bps(EnterpriseFinanceDTO enterpriseFinance, int totalStock, String code);
	public EpsDTO eps(EnterpriseFinanceDTO enterpriseFinance, int totalStock, String code);
}
