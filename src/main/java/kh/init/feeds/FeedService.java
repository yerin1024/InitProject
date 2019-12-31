package kh.init.feeds;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.web.multipart.MultipartFile;

import kh.init.feeds.FeedDAO;
import kh.init.feeds.FeedDTO;

@Service
public class FeedService {
	@Autowired
	private FeedDAO dao;
	
	public List<FeedDTO> getList() throws Exception{
		List<FeedDTO> list = dao.getList();
		return list;
	}
	
	public String imgAttach(String contents, String imgPath) throws Exception{
		Pattern p = Pattern.compile("<img.+?src=\\\"(.+?)\\\".+?data-filename=\\\"(.+?)\\\".+?>");
		Matcher m = p.matcher(contents);
		if(m.find()) {
			File f = new File(imgPath);
			if(!(f.exists())){
				f.mkdir();
			}	
		}
		while(m.find()) {
			String oriName = m.group(2);
			String sysName = System.currentTimeMillis()+oriName;
			String entire = m.group(0);
			String src = null;
			
			if(m.group(1).split(",").length>1) {
				src = m.group(1).split(",")[1];
				byte[] imgContents = Base64Utils.decodeFromString(src);
				
				FileOutputStream os = new FileOutputStream(imgPath+"/"+sysName);
				DataOutputStream dos = new DataOutputStream(os);
				
				dos.write(imgContents);
				dos.flush();
				dos.close();
				contents = contents.replaceFirst(Pattern.quote(m.group(1)), "/imgFiles/"+sysName);
			}
		}
		return contents;
	}
	
	public int write(FeedDTO dto, String filePath1) throws Exception{
		
		int seq = dao.getBoardSeq();
		dto.setSeq(seq);
		MultipartFile[] files = dto.getFiles();
		File filePath = new File(filePath1);
		if(!(filePath.exists())) {
			filePath.mkdir();
		}
		
		System.out.println("BoardService file for문");
		for(MultipartFile tmp : files) {
			String oriName = tmp.getOriginalFilename();
			String sysName = System.currentTimeMillis()+oriName;
			
			tmp.transferTo(new File(filePath1+"/"+sysName));
			
			System.out.println(oriName +" : "+sysName);
		}
		int result = dao.write(dto);
		return result;
	}
}
