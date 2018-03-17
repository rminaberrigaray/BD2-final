package Final.BD2.services.impl;

import Final.BD2.model.User;
import Final.BD2.model.Video;
import Final.BD2.services.bi.VideoServiceBI;

public class VideoServiceImpl extends GenericServiceImpl implements VideoServiceBI {

	public void createVideo(String aName, String anAuthor, String aDescription, long idUser) {
		User user = this.getUserRepository().getUserByID(idUser);
		Video video = new Video(aName, anAuthor, aDescription, user);
		user.getVideos().add(video);
	}

	public void addCommentToVideo(long idUser, long idVideo, String comment) {
		User user = this.getUserRepository().getUserByID(idUser);
		Video video = this.getVideoRepository().getVideoById(idVideo);
		video.comment(user, comment);
	}

	public void addScoreToVideo(long idVideo, long idUser, int score) {
		User user = this.getUserRepository().getUserByID(idUser);
		Video video = this.getVideoRepository().getVideoById(idVideo);
		video.scoreVideo(score, user);

	}
}