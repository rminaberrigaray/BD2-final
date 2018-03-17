package Final.BD2.dto;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class VideoDTO {
	private long videoID;
	private Collection<QualityDTO> qualities;
	private Collection<UserDTO> usersWhoScored;
	private Collection<ScoreDTO> scores;
	private Collection<CommentDTO> comments;
	private UserDTO user;
	private String author;
	private String name;
	private String description;
	private Date dateOfCreation;

	public VideoDTO() {
		this.qualities = new HashSet<QualityDTO>();
		this.usersWhoScored = new HashSet<UserDTO>();
		this.comments = new HashSet<CommentDTO>();
		this.scores = new HashSet<ScoreDTO>();
		this.dateOfCreation = new Date();
	}

	public VideoDTO(long id,  String aName, String anAuthor, String aDescription) {
		this.dateOfCreation = new Date();
		this.qualities = new HashSet<QualityDTO>();
		this.usersWhoScored = new HashSet<UserDTO>();
		this.comments = new HashSet<CommentDTO>();
		this.scores = new HashSet<ScoreDTO>();
		this.author = anAuthor;
		this.user = null;
		this.name = aName;
		this.description = aDescription;
		this.videoID = id;
	}

	public long getVideoID() {
		return videoID;
	}

	public void setVideoID(long videoID) {
		this.videoID = videoID;
	}

	public Collection<QualityDTO> getQualities() {
		return qualities;
	}

	public void setQualities(Collection<QualityDTO> qualities) {
		this.qualities = qualities;
	}

	public Collection<UserDTO> getUsersWhoScored() {
		return usersWhoScored;
	}

	public void setUsersWhoScored(Collection<UserDTO> usersWhoScored) {
		this.usersWhoScored = usersWhoScored;
	}

	public Collection<ScoreDTO> getScores() {
		return scores;
	}

	public void setScores(Collection<ScoreDTO> scores) {
		this.scores = scores;
	}

	public Collection<CommentDTO> getComments() {
		return comments;
	}

	public void setComments(Collection<CommentDTO> comments) {
		this.comments = comments;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

}
