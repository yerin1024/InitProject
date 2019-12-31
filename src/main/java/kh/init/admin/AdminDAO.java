package kh.init.admin;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.init.members.MemberDTO;

@Repository
public class AdminDAO {
	@Autowired
	private MemberDTO mdto;
	@Autowired
	private BlackListDTO bldto;
	@Autowired
	private SqlSessionTemplate sst;
	
	public List<MemberDTO> memberList() throws Exception{
		return sst.selectList("Member.memberList");
	}
	public List<BlackListDTO> blackMemberList() throws Exception{
		return sst.selectList("BlackList.blackMemberList");
	}
}
