
package myObject;

import java.util.ArrayList;

/**
 *
 * @author lug13995
 */
class Provider {

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
    
    public Provider(){
    }
    
    public Provider(int id, String name) {
	super();
	this.id = id;
	this.name = name;
    }
    
    @Override
    public String toString() {
	return "Provider [id=" + id + ", name=" + name + "]";
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
        final Provider other = (Provider) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
