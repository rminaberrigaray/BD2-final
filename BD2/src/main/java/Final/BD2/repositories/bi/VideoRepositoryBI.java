package Final.BD2.repositories.bi;

import java.util.Collection;

import Final.BD2.model.Quality;
import Final.BD2.model.Video;

public interface VideoRepositoryBI extends GenericRepositoryBI {

	public abstract Video getVideoById(long id);

	public abstract Collection<Quality> getVideoQualities( long id);

	public abstract Video getVideoWithMoreScores();
	
}
