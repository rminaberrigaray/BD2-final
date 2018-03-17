package Final.BD2.dto;

import java.util.Collection;
import java.util.HashSet;

import Final.BD2.model.*;

public class DTOFactory {
	private static DTOFactory dtoFactory;

	public static DTOFactory getInstance() {
		if (dtoFactory == null) {
			dtoFactory = new DTOFactory();
		}
		return dtoFactory;
	}
	// Conversión de clases de MODEL a DTO
	
	public UserDTO convertToUserDTO(User user, boolean complete) {
		UserDTO userDTO = new UserDTO(user.getUserID(), user.getName(), user.getPassword());
		if (complete) {
			userDTO.setFollowers(this.convertToFollowersCollectionDTO(user.getFollowers(), complete));
			userDTO.setVideos(this.convertToVideosCollectionDTO(user.getVideos(), complete));
		}
		return userDTO;
	}
	
	public VideoDTO convertToVideoDTO(Video video, boolean complete) {
		VideoDTO videoDTO = new VideoDTO(video.getVideoID(),video.getName(), video.getAuthor(),video.getDescription());
		if (complete) {
			videoDTO.setUser(this.convertToUserDTO(video.getUser(), complete));
			videoDTO.setQualities(this.convertToQualitiesCollectionDTO(video.getQualities(), complete));
			videoDTO.setUsersWhoScored(this.convertToUsersWhoScoredCollectionDTO(video.getUsersWhoScored(), complete));
			videoDTO.setScores(this.convertToScoresCollectionDTO(video.getScores(), complete));
			videoDTO.setComments(this.convertToCommentsCollectionDTO(video.getComments(), complete));
		}
		return videoDTO;
	}
	
	public ScoreDTO convertToScoreDTO(Score score, boolean complete){
		ScoreDTO scoreDTO = new ScoreDTO(score.getScoreID(), score.getScore());
		if (complete){
			scoreDTO.setVideo(this.convertToVideoDTO(score.getVideo(), complete));
		}
		return scoreDTO;
		
	}
	public QualityDTO convertToQualityDTO(Quality quality, boolean complete){
		QualityDTO qualityDTO = new QualityDTO(quality.getQualityID(), quality.getDescription());
		if (complete){
			qualityDTO.setVideos(this.convertToVideosCollectionDTO(quality.getVideos(), complete));
		}
		return qualityDTO;
		
	}
	public CommentDTO convertToCommentDTO(Comment comment, boolean complete){
		CommentDTO commentDTO = new CommentDTO(comment.getCommentID(), comment.getComment());
		if (complete){
			commentDTO.setUser(this.convertToUserDTO(comment.getUser(), complete));
			commentDTO.setVideo(this.convertToVideoDTO(comment.getVideo(), complete));
		}
		return commentDTO;
	}
	
	
	//Conversión de colecciones del MODEL a DTO
	private Collection<VideoDTO> convertToVideosCollectionDTO(Collection<Video> videos, boolean complete) {
		Collection<VideoDTO> videosDTO = new HashSet<VideoDTO>();
		for (Video video : videos) {
			videosDTO.add(this.convertToVideoDTO(video, complete));
		}
		return videosDTO;
	}


	private Collection<UserDTO> convertToFollowersCollectionDTO(Collection<User> followers, boolean complete) {
		Collection<UserDTO> usersDTO = new HashSet<UserDTO>();
		for (User user : followers) {
			usersDTO.add(this.convertToUserDTO(user, complete));
		}
		return usersDTO;
	}
	private Collection<CommentDTO> convertToCommentsCollectionDTO(Collection<Comment> comments, boolean complete) {
		Collection<CommentDTO> commentsDTO = new HashSet<CommentDTO>();
		for (Comment comment : comments){
			commentsDTO.add(this.convertToCommentDTO(comment, complete));
		}
		return commentsDTO;
	}

	private Collection<ScoreDTO> convertToScoresCollectionDTO(Collection<Score> scores, boolean complete) {
		Collection<ScoreDTO> scoresDTO = new HashSet<ScoreDTO>();
		for (Score score : scores){
			scoresDTO.add(this.convertToScoreDTO(score, complete));
		}
		return scoresDTO;
	}

	private Collection<UserDTO> convertToUsersWhoScoredCollectionDTO(Collection<User> usersWhoScored,
			boolean complete) {
		Collection<UserDTO> usersDTO = new HashSet<UserDTO>();
		for (User user: usersWhoScored){
			usersDTO.add(this.convertToUserDTO(user, complete));
		}
		return usersDTO;
		
	}

	private Collection<QualityDTO> convertToQualitiesCollectionDTO(Collection<Quality> qualities, boolean complete) {
		Collection<QualityDTO> qualitiesDTO = new HashSet<QualityDTO>();
		for (Quality quality : qualities){
			qualitiesDTO.add(this.convertToQualityDTO(quality, complete));
		}
		return qualitiesDTO;
	}

	public Collection<UserDTO> convertToUserCollectionDTO(Collection<User> users, boolean complete) {
		Collection<UserDTO> usersDTO = new HashSet<UserDTO>();
		for (User user : users) {
			usersDTO.add(this.convertToUserDTO(user, complete));
		}
		return usersDTO;
	}

}
