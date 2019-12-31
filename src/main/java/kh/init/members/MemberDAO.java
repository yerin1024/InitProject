package kh.init.members;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSessionTemplate jdbc;
	
	
	public int loginCheck(String id, String pw) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("id", id);
		param.put("pw", pw);
		return jdbc.selectOne("Member.isLoginOk", param);
	}
	
	public int signUp(MemberDTO dto) {
		return jdbc.insert("Member.insert", dto);
	}
	
	public int isAvailable(String id) {
		return jdbc.selectOne("Member.isAvailable", id);
	}
}
