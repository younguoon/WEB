package member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import member.dto.MemberDTO;
@Repository("membermybatis")
public class MemberDAOImpl implements MemberDAO {
	
	//spring���� Mybatis�� ����ϱ� ���� ��� ����� �������ִ� �ٽ� Ŭ���� - JdbcTemplate�� ���� ����
	@Autowired
	SqlSession sqlSession;
	@Override
	public int count() {
		int result = sqlSession.selectOne("stock.member.count");
		return result;
	}

	@Override
	public void insert(MemberDTO user) {
		int result = sqlSession.insert("stock.member.insert", user);
		System.out.println(result+"�� ���� ����");
	}



	@Override
	public List<MemberDTO> getMemberList() {
		System.out.println("mybatis�� selectall����");
		return sqlSession.selectList("stock.member.list");
	}

	@Override
	public List<MemberDTO> findByAddr(String addr) {
		System.out.println("Mybatis�� search ����");
		return sqlSession.selectList("stock.member.search", "%"+addr+"%");
	}

	@Override
	public MemberDTO read(String id) {
		System.out.println("Mybatis�� read ����");
		MemberDTO user= sqlSession.selectOne("stock.member.read", id);
		return sqlSession.selectOne("stock.member.read", id);
	}
	
	@Override
	public void update(MemberDTO user) {
		int result = sqlSession.insert("stock.member.update",user);
	}

	@Override
	public void delete(String id) {
		System.out.println("Mybatis�� delete ����");
		int result = sqlSession.delete("stock.member.delete", id);
	}

	@Override
	public MemberDTO login(MemberDTO loginUser) {
		return sqlSession.selectOne("stock.member.login", loginUser);
	}
}
