package fundamental.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fundamental.dto.CheckDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.StockCloseWDTO;

@Repository("fundamentalmybatis")
public class FundamentalMybatisDAOImpl implements FundamentalDAO {
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<EnterpriseTotalDTO> codeList() {
		return sqlSession.selectList("stock.fundamental.codeList");
	}

	@Override
	public List<StockCloseWDTO> stockClose(String code) {
		return sqlSession.selectList("stock.fundamental.stockCloseList", code);
	}

	@Override
	public List<StockCloseWDTO> closeList(String code) {
		return sqlSession.selectList("stock.fundamental.closeList", code);
	}
	
	@Override
	public EnterpriseFinanceDTO enterpriseFinance(String code) {
		return sqlSession.selectOne("stock.fundamental.enterpriseFinance", code);
	}

	@Override
	public List<StockCloseWDTO> stockCloseCheck() {
		return sqlSession.selectList("stock.fundamental.stockCloseCheck");
	}

	@Override
	public List<CheckDTO> closeCheck() {
		return sqlSession.selectList("stock.fundamental.closeCheck");
	}


}
