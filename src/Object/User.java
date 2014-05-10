package Object;

public class User {
	
	private int id;
	private String login, password;
	private boolean administrator;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean getAdministrator() {
		return administrator;
	}
	public void setRole(boolean administrator) {
		this.administrator = administrator;
	}
	
	/***
	 * Constructeur to create user witch database
	 * @param login
	 * @param password
	 */
	public User(String login, String password, boolean administrator){
            this.login = login;
            this.password = password;
            this.administrator = administrator;
	}
	
	public User(int id, String login, String password, boolean administrator) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.administrator = administrator;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + password
				+ ", administrator=" + administrator + "]";
	}
	
	/***
	 * Create current user in database
	 * @return message of insert
	 */
	public void createUser(){
		
            System.out.println("Function createUser not supported yet");
	}
	
	/***
	 * Delete current user in database
	 * @return message of delete
	 */
	public void deleteUser(){
		
            System.out.println("Function deleteUser not supported yet");
	}
	
	/***
	 * Update user in database
	 * @return message of update
	 */
	public void updateUser(){
		
            System.out.println("Function update User not supported yet");
	}
	
}
