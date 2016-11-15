package board.dao;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardDAO {
	// �Խù� ���
	void insert(BoardDTO brd);

	// �Խù� ����
	void update(BoardDTO brd);

	//�Խù� ����Ʈ ��ȸ
	List<BoardDTO> list();

	//�Խù� �󼼺��� 
	BoardDTO read(String board_no);
	
	//ī��Ʈ ����
	void countup(String board_no);
	
	//�Խù� ����
	void delete(String board_no);

}
