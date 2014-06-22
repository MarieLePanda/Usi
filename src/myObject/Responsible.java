package myObject;

public class Responsible {
	
	private int id;
	private String name;
	
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
	public Responsible(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName();
	}
	
	@Override
        public int hashCode() {
            int hash = 7;
            hash = 79 * hash + this.id;
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
            final Responsible other = (Responsible) obj;
            if (this.id != other.id) {
                return false;
            }
            return true;
        }
        
        public void createObject() {
        data.database.CrudDatabase.createResponsible(this);
    }

}
