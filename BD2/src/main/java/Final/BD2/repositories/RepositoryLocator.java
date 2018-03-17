package Final.BD2.repositories;

import Final.BD2.repositories.bi.*;

public class RepositoryLocator {
	private static RepositoryLocator instance;
	private UserRepositoryBI userRepository;
	private VideoRepositoryBI videoRepository;
	private ApplicationRepositoryBI appRepository;	public static RepositoryLocator getInstance() {
		if (instance == null) {
			instance = new RepositoryLocator();
		}
		return instance;
	}
	public UserRepositoryBI getUserRepository() {
		return userRepository;
	}
	public void setUserRepository(UserRepositoryBI userRepository) {
		this.userRepository = userRepository;
	}
	public VideoRepositoryBI getVideoRepository() {
		return videoRepository;
	}
	public void setVideoRepository(VideoRepositoryBI videoRepository) {
		this.videoRepository = videoRepository;
	}
	public ApplicationRepositoryBI getAppRepository() {
		return appRepository;
	}
	public void setAppRepository(ApplicationRepositoryBI appRepository) {
		this.appRepository = appRepository;
	}
	public static void setInstance(RepositoryLocator instance) {
		RepositoryLocator.instance = instance;
	}
	
	
}
