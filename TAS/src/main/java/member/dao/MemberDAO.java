package member.dao;

import java.util.List;

import member.dto.MemberDTO;

public interface MemberDAO {
	//회원인원수 조회
	int count();
	//회원가입
	void insert(MemberDTO user);
	//회원정보수정
	void update(MemberDTO userInfo);
	//회원탈퇴
	void delete(String id);
	//로그인
	MemberDTO login(MemberDTO loginUser);
	//회원목록보기
	List<MemberDTO> getMemberList();
	//주소로 검색
	List<MemberDTO> findByAddr(String addr);
	//회원정보보기
	MemberDTO read(String id);
	
	
}









