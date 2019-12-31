package kh.init.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;
	
	public int loginCheck(String id, String pw) throws Exception{
			return dao.loginCheck(id, pw);
	}
	
	public void signUp(MemberDTO dto) throws Exception{
		dao.signUp(dto);
	}
	
	public int checkId(String id) throws Exception{
		return dao.isAvailable(id);
	}
	
}
