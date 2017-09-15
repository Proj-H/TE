package ed.persistence;

public class User{
	
	private int idUser;
	private String userName;
	private String userFirstName;
	private String userLastName;
	
	public User(int idUser, String userName, String userFirstName, String userLastName) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	
	
	
}