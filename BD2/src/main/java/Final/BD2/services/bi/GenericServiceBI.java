package Final.BD2.services.bi;

import Final.BD2.dto.DTOFactory;
import Final.BD2.repositories.bi.UserRepositoryBI;
import Final.BD2.repositories.bi.VideoRepositoryBI;

public interface GenericServiceBI {
	public abstract UserRepositoryBI getUserRepository();

	public abstract void setUserRepository(UserRepositoryBI userRepository);

	public abstract VideoRepositoryBI getVideoRepository();

	public abstract void setVideoRepository(VideoRepositoryBI videoRepository);

	public abstract DTOFactory getDtoFactory();
}
