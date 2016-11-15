package board.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import board.dto.BoardDTO;

@Repository("brdmybatis")
public class BoardMybatisDAOImpl implements BoardDAO {
	@Autowired
	SqlSession sqlsession;

	@Override
	public void insert(BoardDTO brd) {
		int result = sqlsession.insert("kitri.brd.insert", brd);
		System.out.println("mybatis" + result + "�� ���Լ���");
	}

	@Override
	public void update(BoardDTO brd) {
		int result = sqlsession.update("kitri.brd.update", brd);
		System.out.println(result+" �� ������Ʈ����");
	}

	@Override
	public List<BoardDTO> list() {
		System.out.println("mybatislist����");
		return sqlsession.selectList("kitri.brd.brdlist");
	}

	@Override
	public BoardDTO read(String board_no) {
		System.out.println("mybatisread ����");
		return sqlsession.selectOne("kitri.brd.boardread",board_no);
	}

	@Override
	public void countup(String board_no) {
		int result = sqlsession.update("kitri.brd.countup", board_no);
		System.out.println(result+" �� mybatiscounup����");
	}

	@Override
	public void delete(String board_no) {
		int result = sqlsession.delete("kitri.brd.delete", board_no);
		System.out.println(result+"�� ���� �÷��� ����!");
	}

}
