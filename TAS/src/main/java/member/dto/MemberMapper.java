package member.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
//JdbcTemplate���� ������ jdbc���ø� Ŭ�������� select�� ������ �� ó���� �� �ֵ���
//�ϳ��� row�� ���� ó�������� ��� �ִ� ��ü�� query�޼ҵ� ���ο��� ȣ���� ��ü
public class MemberMapper implements RowMapper<MemberDTO> {

	@Override
	public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		//List�� �� ��ҷ� add��ų ���ڵ带 dto�� ��ȯ�ϴ� �۾��� ����		
		System.out.println("mapRow()==> "+rowNum);
		MemberDTO emp = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3)
									, rs.getInt(4), rs.getString(5), rs.getString(6)
									, rs.getString(7));
		System.out.println(emp);
		return emp;
	}
}


