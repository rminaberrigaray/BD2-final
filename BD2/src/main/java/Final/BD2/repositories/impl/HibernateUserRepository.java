package Final.BD2.repositories.impl;

import java.util.Collection;

import Final.BD2.model.User;
import Final.BD2.model.Video;
//import org.hibernate.Session;
import Final.BD2.repositories.bi.UserRepositoryBI;

public class HibernateUserRepository extends HibernateGenericRepository implements UserRepositoryBI {

	public User getUserByID(long id) {
		return (User) this.getSession().createQuery("FROM User WHERE userID=" + id).list().get(0);
	}

	public User getUserByName(String name) {
		return (User) this.getSession().createQuery("FROM User WHERE name=" + name).list().get(0);
	}

	public Collection<Video> getUserVideos(long userID) {
		User user = (User) this.getSession().createQuery("FROM User WHERE userID=" + userID).list().get(0);
		return user.getVideos();
	}

	public Collection<User> getUserFollowers(long userID) {
		User user = (User) this.getSession().createQuery("FROM User WHERE userID=" + userID).list().get(0);
		return user.getFollowers();
	}
	
	public Collection<User> getUsers() {
		return (Collection<User>) this.getSession().createQuery("FROM User").list();
		//return user.getFollowers();
	}
}
