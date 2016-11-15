package member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	@Qualifier("membermybatis")
	MemberDAO dao;
	
	public MemberServiceImpl(){
	}
	
	public MemberServiceImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}

	
	@Override
	public int count() {
		return dao.count();
	}

	@Override
	public void insert(MemberDTO user) {
		dao.insert(user);
	}

	@Override
	public void update(MemberDTO userInfo) {
		dao.update(userInfo);

	}

	@Override
	public void delete(String id) {
		dao.delete(id);
	}



	@Override
	public List<MemberDTO> getMemberList() {
		return dao.getMemberList();
	}
	
	@Override
	public List<MemberDTO> findByAddr(String addr) {
		return dao.findByAddr(addr);
	}
	
	@Override
	public MemberDTO read(String id) {
		return dao.read(id);
	}
	
	//트랜잭션처리를 테스트하기 위한 service의 insert
	@Override
	public void txinsert(MemberDTO user) {
		dao.insert(user);
//		dao.insert(null);
	}

	@Override
	public MemberDTO login(MemberDTO loginUser) {
		return dao.login(loginUser);
	}
}
