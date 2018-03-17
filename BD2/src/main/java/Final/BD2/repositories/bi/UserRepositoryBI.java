package Final.BD2.repositories.bi;

import java.util.Collection;

import Final.BD2.model.User;
import Final.BD2.model.Video;

public interface UserRepositoryBI extends GenericRepositoryBI {
	
	public abstract User getUserByID(long id);

	public abstract User getUserByName(String name);

	public abstract Collection<Video> getUserVideos(long userID);

	public abstract Collection<User> getUserFollowers(long userID);

	public abstract Collection<User> getUsers();

}
