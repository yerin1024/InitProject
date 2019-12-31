package kh.init.feeds;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.init.feeds.FeedDTO;
import kh.init.members.MemberDTO;
import kh.init.feeds.FeedService;

@RequestMapping("board")
@Controller
public class FeedController {

	@Autowired
	private FeedService service;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("board")
	public String board(Model model) {
		System.out.println("board controller도착");
		try {
			List<FeedDTO> list = service.getList();
			model.addAttribute("list", list);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "/board/board";
	}
	
	@RequestMapping("write")
	public String write() {
		return "/board/write";
	}
	
	@RequestMapping("writeProc")
	public String writeProc(FeedDTO dto) {
		System.out.println("writeProc controller도착");
		System.out.println(dto.toString());
		String title = dto.getTitle();
		String contents = dto.getContents();
		String imgPath =  session.getServletContext().getRealPath("imgFiles");
		String filePath = session.getServletContext().getRealPath("files");
		System.out.println("BoardController ");
		System.out.println(filePath);
		try {
			contents = service.imgAttach(contents, imgPath);
			dto.setContents(contents);

			service.write(dto, filePath);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "/board/board";
	}
}
