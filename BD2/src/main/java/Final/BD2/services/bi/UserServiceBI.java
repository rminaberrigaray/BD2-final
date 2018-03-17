package Final.BD2.services.bi;

import java.util.Collection;

import Final.BD2.dto.UserDTO;

public interface UserServiceBI {
	public abstract Collection<UserDTO> getUsers(boolean complete);

	public abstract void createUser(String aName, String aPassword);

	public abstract UserDTO getUserById(long id, boolean complete);

}
