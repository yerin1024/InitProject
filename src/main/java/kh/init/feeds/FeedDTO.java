package kh.init.feeds;

import java.sql.Timestamp;
import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class FeedDTO {
	private int seq;
	private String title;
	private String contents;
	private String writer;
	private Timestamp write_date;
	private int viewCount;
	private MultipartFile[] files;
	
	public FeedDTO() {}
	public FeedDTO(int seq, String title, String contents, String writer, Timestamp write_date, int viewCount,
			MultipartFile[] files) {
		super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.write_date = write_date;
		this.viewCount = viewCount;
		this.files = files;
	}
	
	
	@Override
	public String toString() {
		return "BoardDTO [seq=" + seq + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", write_date=" + write_date + ", viewCount=" + viewCount + ", files=" + Arrays.toString(files) + "]";
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Timestamp getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public MultipartFile[] getFiles() {
		return files;
	}
	public void setFiles(MultipartFile[] files) {
		this.files = files;
	}	
	
}
