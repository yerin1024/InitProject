package kh.init.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {
	
	@RequestMapping(value = "/main.do")
	public String toMain() {
		return "main";
	}
}
