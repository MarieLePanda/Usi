/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myObject.old;

/**
 *
 * @author lug13995
 */
class Processeur {
    
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
	
	public Processeur(){
		
	}
	

	public Processeur(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
    
	@Override
	public String toString() {
		return "Processeur [id=" + id + ", name=" + name + "]";
	}
}
