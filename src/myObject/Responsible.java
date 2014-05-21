package myObject;

public class Responsible {
	
	private int id;
	private String firstName, name;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public Responsible(){
		
	}
	
	/**
	 * @param id
	 * @param firstName
	 * @param name
	 */
	public Responsible(int id, String firstName, String name) {
		this.id = id;
		this.firstName = firstName;
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Responsible [id=" + id + ", firstName=" + firstName + ", name="
				+ name + "]";
	}
	
	
	
}
