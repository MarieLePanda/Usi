package myObject;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.standard.MediaSize;

public class User {
	
	private int id;
	private String login, password;
	private boolean administrator;
        private boolean needChange;
	
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
            StringBuffer hash = new StringBuffer();
            try {
                MessageDigest md = MessageDigest.getInstance("SHA-512");
                md.update((login + "PandprodProtegeVotreMdp" +password).getBytes("UTF-8"));
                byte[] digest = md.digest();
                for (int i = 0; i < digest.length; i++) {
                    hash.append(Integer.toString((digest[i] & 0xff) + 0x100, 16).substring(1));
                }
            }catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
            return new String(hash);
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
        public boolean getNeedChange() {
		return needChange;
	}
	public void setNeedChange(boolean needChange) {
		this.needChange = needChange;
	}
	
	/***
	 * Constructeur to create user witch database
	 * @param login
	 * @param password
	 */
        public User(String login, String password){
            this.login = login;
            this.password = password;
	}
                
	public User(String login, String password, boolean administrator, boolean needChange){
            this.login = login;
            this.password = password;
            this.administrator = administrator;
            this.needChange = needChange;
            
	}
	
	public User(int id, String login, String password, boolean administrator, boolean needChange) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.administrator = administrator;
                this.needChange = needChange;
	}
	
	@Override
	public String toString() {
		return login;
	}
	
        public void connection(){
            login = login.toLowerCase();
            data.database.CrudDatabase.connectionUser(this);
        }
	/***
	 * Create current user in database
	 * @return message of insert
	 */
	public void createUser(){
            data.database.CrudDatabase.createUser(this);
	}
	
	/***
	 * Delete current user in database
	 * @return message of delete
	 */
	public void deleteUser(){
            data.database.CrudDatabase.deleteUser(this);
	}
	
	/***
	 * Update user in database
	 * @return message of update
	 */
	public void updateUser(){
            data.database.CrudDatabase.updateUser(this);
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
