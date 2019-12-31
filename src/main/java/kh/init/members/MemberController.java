package kh.init.members;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
@Controller
public class MemberController {

	@RequestMapping(value = "/main.do")
	public String toMain() {
		return "main";
	}
}
