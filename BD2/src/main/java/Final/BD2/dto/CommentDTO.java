package Final.BD2.dto;

public class CommentDTO {
	private long commentID;
	private String comment;
	private UserDTO user;
	private VideoDTO video;

	public CommentDTO() {

	}

	public CommentDTO(long id, String aComment) {
		this.user = null;
		this.video = null;
		this.comment = aComment;
		this.commentID=id;
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

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public VideoDTO getVideo() {
		return video;
	}

	public void setVideo(VideoDTO video) {
		this.video = video;
	}

}
