package myObject;

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
		return login;
	}
	
	/***
	 * Create current user in database
	 * @return message of insert
	 */
	public void createUser(){
		
            throw new UnsupportedOperationException("Not supported yet.");
	}
	
	/***
	 * Delete current user in database
	 * @return message of delete
	 */
	public void deleteUser(){
		
            throw new UnsupportedOperationException("Not supported yet.");
	}
	
	/***
	 * Update user in database
	 * @return message of update
	 */
	public void updateUser(){
		
           throw new UnsupportedOperationException("Not supported yet.");
	}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
        
	
}
