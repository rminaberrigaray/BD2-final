package Final.BD2.dto;


public class ScoreDTO {
	private long scoreID;
	private VideoDTO video;
	private float score;

	public ScoreDTO() {

	}

	public ScoreDTO(long id, float aScore) {
		this.video = null;
		this.score = aScore;
		this.scoreID=id;
	}

	public long getScoreID() {
		return scoreID;
	}

	public void setScoreID(long scoreId) {
		this.scoreID = scoreId;
	}

	public VideoDTO getVideo() {
		return video;
	}

	public void setVideo(VideoDTO video) {
		this.video = video;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

}
