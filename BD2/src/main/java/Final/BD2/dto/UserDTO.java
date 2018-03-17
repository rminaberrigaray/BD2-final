package Final.BD2.dto;

import java.util.Collection;
import java.util.HashSet;

public class UserDTO {
	private long userID;
	private String name;
	private String password;
	private Collection<VideoDTO> videos;
	private Collection<UserDTO> followers;

	protected UserDTO() {
		this.videos = new HashSet<VideoDTO>();
		this.followers = new HashSet<UserDTO>();
	}

	protected UserDTO(long id, String aName, String aPassword) {
		this.name = aName;
		this.videos = new HashSet<VideoDTO>();
		this.followers = new HashSet<UserDTO>();
		this.password = aPassword;
		this.userID=id;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<VideoDTO> getVideos() {
		return videos;
	}

	public void setVideos(Collection<VideoDTO> videos) {
		this.videos = videos;
	}

	public Collection<UserDTO> getFollowers() {
		return followers;
	}

	public void setFollowers(Collection<UserDTO> followers) {
		this.followers = followers;
	}
}
