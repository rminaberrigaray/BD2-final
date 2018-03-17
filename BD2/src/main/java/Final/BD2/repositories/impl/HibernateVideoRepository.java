package Final.BD2.repositories.impl;

import java.util.Collection;
//import java.util.Date;

//import Final.BD2.model.Comment;
import Final.BD2.model.Quality;
//import Final.BD2.model.Score;
//import Final.BD2.model.User;
import Final.BD2.model.Video;
//import org.hibernate.Session;
import Final.BD2.repositories.bi.VideoRepositoryBI;

public class HibernateVideoRepository extends HibernateGenericRepository implements VideoRepositoryBI {

	public Video getVideoById(long id) {
		return (Video) this.getSession().createQuery("FROM Video WHERE videoID=" + id).list().get(0);
	}

	public Collection<Quality> getVideoQualities(long id) {
		Video video = (Video) this.getSession().createQuery("FROM Video WHERE videoID=" + id).list().get(0);
		return video.getQualities();
	}

	public Video getVideoWithMoreScores() {
		Collection<Video> videos = (Collection<Video>) this.getSession().createQuery("FROM Video").list();
		Video best = null;
		int countScore = 0;
		for (Video v : videos) {
			if (v.getScores().size() > countScore) {
				countScore = v.getScores().size();
				best = v;
			}
		}
		return best;
	}

}
