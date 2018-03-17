package Final.BD2.model;

public class Score {
	private long scoreID;
	private Video video;
	private float score;

	public Score() {

	}

	public Score(Video aVideo, float aScore) {
		this.video = aVideo;
		this.score = aScore;
	}

	public long getScoreID() {
		return scoreID;
	}

	public void setScoreID(long scoreId) {
		this.scoreID = scoreId;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	

}
