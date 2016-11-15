package member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import member.dto.MemberDTO;
@Repository("membermybatis")
public class MemberDAOImpl implements MemberDAO {
	
	//spring에서 Mybatis를 사용하기 위한 모든 기능을 제공해주는 핵심 클래스 - JdbcTemplate과 같은 개념
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
		System.out.println(result+"개 삽입 성공");
	}



	@Override
	public List<MemberDTO> getMemberList() {
		System.out.println("mybatis로 selectall성공");
		return sqlSession.selectList("stock.member.list");
	}

	@Override
	public List<MemberDTO> findByAddr(String addr) {
		System.out.println("Mybatis로 search 성공");
		return sqlSession.selectList("stock.member.search", "%"+addr+"%");
	}

	@Override
	public MemberDTO read(String id) {
		System.out.println("Mybatis로 read 성공");
		MemberDTO user= sqlSession.selectOne("stock.member.read", id);
		return sqlSession.selectOne("stock.member.read", id);
	}
	
	@Override
	public void update(MemberDTO user) {
		int result = sqlSession.insert("stock.member.update",user);
	}

	@Override
	public void delete(String id) {
		System.out.println("Mybatis로 delete 성공");
		int result = sqlSession.delete("stock.member.delete", id);
	}

	@Override
	public MemberDTO login(MemberDTO loginUser) {
		return sqlSession.selectOne("stock.member.login", loginUser);
	}
}
