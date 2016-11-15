package member.service;

import java.util.List;

import member.dto.MemberDTO;

public interface MemberService {
	//ȸ���ο��� ��ȸ
	int count();
	//ȸ������
	void insert(MemberDTO user);
	//ȸ����������
	void update(MemberDTO userInfo);
	//ȸ��Ż��
	void delete(String id);
	//�α���
	MemberDTO login(MemberDTO loginUser);
	//ȸ����Ϻ���
	List<MemberDTO> getMemberList();
	//�ּҷ� �˻�
	List<MemberDTO> findByAddr(String addr);
	//ȸ����������
	MemberDTO read(String id);
	
	//Ʈ����� �����ϱ�
	void txinsert(MemberDTO user);
	
	
}





