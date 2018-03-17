package Final.BD2.model;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Video {
	private long videoID;
	private Collection<Quality> qualities;
	private Collection<User> usersWhoScored;
	private Collection<Score> scores;
	private Collection<Comment> comments;
	private User user;
	private String author;
	private String name;
	private String description;
	private Date dateOfCreation;

	public Video() {
		this.qualities = new HashSet<Quality>();
		this.usersWhoScored = new HashSet<User>();
		this.comments = new HashSet<Comment>();
		this.scores = new HashSet<Score>();
		this.dateOfCreation = new Date();
	}

	public Video(String aName, String anAuthor, String aDescription, User aUser) {
		this.dateOfCreation = new Date();
		this.qualities = new HashSet<Quality>();
		this.usersWhoScored = new HashSet<User>();
		this.comments = new HashSet<Comment>();
		this.scores = new HashSet<Score>();
		this.author = anAuthor;
		this.user = aUser;
		this.name = aName;
		this.description = aDescription;
	}

	public long getVideoID() {
		return videoID;
	}

	public void setVideoID(long videoID) {
		this.videoID = videoID;
	}

	public Collection<Quality> getQualities() {
		return qualities;
	}

	public void setQualities(Collection<Quality> qualities) {
		this.qualities = qualities;
	}

	public Collection<User> getUsersWhoScored() {
		return usersWhoScored;
	}

	public void setUsersWhoScored(Collection<User> usersWhoScored) {
		this.usersWhoScored = usersWhoScored;
	}

	public Collection<Score> getScores() {
		return scores;
	}

	public void setScores(Collection<Score> scores) {
		this.scores = scores;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void comment(User aUser, String aComment) {
		new Comment(aUser, this, aComment);
	}

	public void scoreVideo(int aScore, User aUser) {
		Boolean notScore = true;
		for (User user : this.getUsersWhoScored()) {
			if (user == aUser) {
				notScore = false;
			}
		}
		if (notScore) {
			Score score = new Score(this, aScore);
			this.usersWhoScored.add(aUser);
			this.scores.add(score);
		}
	}
}
