
package myObject.old;

/**
 *
 * @author lug13995
 */
class Os {
    
    private int id;
    private String name;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Os(){
		
	}
	

	public Os(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
    
	@Override
	public String toString() {
		return "Os [id=" + id + ", name=" + name + "]";
	}
}
