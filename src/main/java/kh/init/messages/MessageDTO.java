package kh.init.messages;

import java.sql.Timestamp;

public class MessageDTO {
	private int message_seq;
	private String sender;
	private String receiver;
	private String contents;
	private Timestamp write_date;
	
	public MessageDTO() {}
	public MessageDTO(int message_seq, String sender, String receiver, String contents, Timestamp write_date) {
		super();
		this.message_seq = message_seq;
		this.sender = sender;
		this.receiver = receiver;
		this.contents = contents;
		this.write_date = write_date;
	}
	
	public int getMessage_seq() {
		return message_seq;
	}
	public void setMessage_seq(int message_seq) {
		this.message_seq = message_seq;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Timestamp getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}
	
}
