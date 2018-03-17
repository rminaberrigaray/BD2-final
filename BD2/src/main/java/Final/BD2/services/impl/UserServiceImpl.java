package Final.BD2.services.impl;

import java.util.Collection;

import Final.BD2.dto.UserDTO;
import Final.BD2.model.Application;
import Final.BD2.model.User;
import Final.BD2.services.bi.UserServiceBI;

public class UserServiceImpl extends GenericServiceImpl implements UserServiceBI {

	public Collection<UserDTO> getUsers(boolean complete) {
		return this.getDtoFactory().convertToUserCollectionDTO(this.getUserRepository().getUsers(), complete);
	}

	public void createUser(String aName, String aPassword) {
		User user= new User(aName, aPassword);
		Application app= this.getApplicationRepository().getApplication();
		app.getUsers().add(user);

	}

	public UserDTO getUserById(long id, boolean complete) {
		User user= this.getUserRepository().getUserByID(id);
		return this.getDtoFactory().convertToUserDTO(user, complete);
	}

}
