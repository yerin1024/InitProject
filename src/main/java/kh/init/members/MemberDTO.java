package kh.init.members;

import java.sql.Timestamp;

public class MemberDTO {
 private int seq;
 private String id;
 private String pw;
 private String nickname;
 private String name;
 private String phone;
 private Timestamp birthday;
 private String statemsg;
 public MemberDTO() {super();}
 public MemberDTO(int seq, String id, String pw, String nickname, String name, String phone, Timestamp birthday,
		String statemsg) {
	
	this.seq = seq;
	this.id = id;
	this.pw = pw;
	this.nickname = nickname;
	this.name = name;
	this.phone = phone;
	this.birthday = birthday;
	this.statemsg = statemsg;
}
public int getSeq() {
	return seq;
}
public void setSeq(int seq) {
	this.seq = seq;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Timestamp getBirthday() {
	return birthday;
}
public void setBirthday(Timestamp birthday) {
	this.birthday = birthday;
}
public String getStatemsg() {
	return statemsg;
}
public void setStatemsg(String statemsg) {
	this.statemsg = statemsg;
}
 
 
 
 
}
