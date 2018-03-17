package Final.BD2.model;

public class Comment {
	private long commentID;
	private String comment;
	private User user;
	private Video video;

	public Comment() {

	}

	public Comment(User aUser, Video aVideo, String aComment) {
		this.user = aUser;
		this.video = aVideo;
		this.comment = aComment;
	}

	public long getCommentID() {
		return commentID;
	}

	public void setCommentID(long commentID) {
		this.commentID = commentID;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}
