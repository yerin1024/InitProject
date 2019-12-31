package kh.init.admin;

public class BlackListDTO {
	private String profile;
	private String nickname;
	private String name;
	private String email;
	
	public BlackListDTO() {}
	public BlackListDTO(String profile, String nickname, String name, String email) {
		super();
		this.profile = profile;
		this.nickname = nickname;
		this.name = name;
		this.email = email;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
