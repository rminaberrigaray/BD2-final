package Final.BD2.model;

import java.util.Collection;

public class Application {
	private long idApp;
	private Collection<User> users;

	public void addUser(User aUser) {
		users.add(aUser);
	}

	public void createUser(String name, String password) {
		User user = new User(name, password);
		addUser(user);
	}

	public long getIdApp() {
		return idApp;
	}

	public void setIdApp(long idApp) {
		this.idApp = idApp;
	}

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	public User getUserByName(String aName) {
		for (User u : this.getUsers()) {
			if (u.getName().equals(aName)) {
				return u;
			}
		}
		return null;
	}

	public Video getVideoByName(String aName) {
		for (User u : this.getUsers()) {
			for (Video v : u.getVideos()) {
				if (v.getName().equals(aName)) {
					return v;
				}
			}
		}
		return null;
	}

	@SuppressWarnings("null")
	public Collection<Video> getVideoByNameAndAuthor(String aName, String anAuthor) {
		Collection<Video> videos = null;
		for (User u : this.getUsers()) {
			for (Video v : u.getVideos()) {
				if (v.getName().equals(aName) && v.getAuthor().equals(anAuthor)) {
					videos.add(v);
				}
			}
		}
		return videos;
	}

	@SuppressWarnings("null")
	public Collection<Video> getVideoByAuthor(String anAuthor) {
		Collection<Video> videos = null;
		for (User u : this.getUsers()) {
			for (Video v : u.getVideos()) {
				if (v.getAuthor().equals(anAuthor)) {
					videos.add(v);
				}
			}
		}
		return videos;
	}
}
