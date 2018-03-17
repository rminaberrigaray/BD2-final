package Final.BD2.services.impl;

import Final.BD2.dto.DTOFactory;
import Final.BD2.repositories.bi.*;

public class GenericServiceImpl {
	protected UserRepositoryBI userRepository;
	protected VideoRepositoryBI videoRepository;
	protected ApplicationRepositoryBI applicationRepository;
	protected DTOFactory dtoFactory;

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

	public ApplicationRepositoryBI getApplicationRepository() {
		return applicationRepository;
	}

	public void setApplicationRepository(ApplicationRepositoryBI applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	public DTOFactory getDtoFactory() {
		return dtoFactory;
	}

	public void setDtoFactory(DTOFactory dtoFactory) {
		this.dtoFactory = dtoFactory;
	}

}
