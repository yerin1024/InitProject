package kh.init.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.init.members.MemberDTO;

@Service
public class AdminService {
	@Autowired
	private AdminDAO adao;
	
	public List<MemberDTO> memberList() throws Exception{
		return adao.memberList();
	}
	public List<BlackListDTO> blackMemberList() throws Exception{
		return adao.blackMemberList();
	}
}
