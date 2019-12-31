package kh.init.messages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/message")
@Controller
public class MessageController {

	@RequestMapping(value = "/main.do")
	public String toMain() {
		return "main";
	}
}
