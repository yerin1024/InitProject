package kh.init.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping(value = "/main.do")
	public String toMain() {
		return "main";
	}
	
	@RequestMapping(value = "/login.do")
	public String toLogin(String id, String pw) {
		try {
			service.loginCheck(id, pw);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "main";
	}
	
	@RequestMapping(value = "/signup.do")
	public String toSignup(MemberDTO dto) {
		try {
			service.signUp(dto);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "main";
	}
}
