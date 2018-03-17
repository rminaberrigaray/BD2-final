package Final.BD2.services.bi;


public interface VideoServiceBI {

public abstract void createVideo(String aName, String anAuthor, String aDescription, long idUser);

public abstract void addCommentToVideo(long idUser, long idVideo, String comment);

public abstract void addScoreToVideo(long idVideo, long idUser, int score);

}
