package Final.BD2.model;

import java.util.Collection;
import java.util.HashSet;


public class User {
	private long userID;
	private String name;
	private String password;
	private Collection<Video> videos;
	private Collection<User> followers;

	public User() {
		this.videos = new HashSet<Video>();
		this.followers = new HashSet<User>();
	}

	public User(String aName, String aPassword) {
		this.name = aName;
		this.videos = new HashSet<Video>();
		this.followers = new HashSet<User>();
		this.password = aPassword;
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

	public Collection<Video> getVideos() {
		return videos;
	}

	public void setVideos(Collection<Video> videos) {
		this.videos = videos;
	}

	public Collection<User> getFollowers() {
		return followers;
	}

	public void setFollowers(Collection<User> followers) {
		this.followers = followers;
	}
	
	public void createVideo(String name, String author, String description){
		new Video (name, author, description, this);
	}
	
	

}
