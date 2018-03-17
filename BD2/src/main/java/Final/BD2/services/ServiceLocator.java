package Final.BD2.services;

import Final.BD2.services.bi.*;
import Final.BD2.services.impl.GenericServiceImpl;

public class ServiceLocator extends GenericServiceImpl {
	private static ServiceLocator instance;
	private UserServiceBI userService;
	private VideoServiceBI videoService;

	public UserServiceBI getUserService() {
		return userService;
	}

	public void setUserService(UserServiceBI userService) {
		this.userService = userService;
	}

	public VideoServiceBI getVideoService() {
		return videoService;
	}

	public void setVideoService(VideoServiceBI videoService) {
		this.videoService = videoService;
	}

	public static ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}
}
