package kh.init.feeds;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/feed")
@Controller
public class FeedController {
	
	@RequestMapping(value = "/main.do")
	public String toMain() {
		return "main";
	}
}
