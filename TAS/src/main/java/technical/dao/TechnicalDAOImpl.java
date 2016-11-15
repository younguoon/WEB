package technical.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import technical.dto.StockDInfoDTO;

@Repository("technicaldao")
public class TechnicalDAOImpl implements TechnicalDAO {
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<String> getStockCodeList() {
		return sqlSession.selectList("finalpro.technical.codelist");
	}

	@Override
	public List<StockDInfoDTO> getStockInfoList(String code) {
		return sqlSession.selectList("finalpro.technical.infolist", code);
	}

	@Override
	public List<StockDInfoDTO> getWholeStockInfoList(String day) {
		return sqlSession.selectList("finalpro.technical.whole_infolist", day);
	}

}
