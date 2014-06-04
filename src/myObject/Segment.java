package myObject;

import java.util.ArrayList;

public class Segment extends MetaModelObject{
	
	private int id;
	private String name, description;
	private Responsible responsible;
	private Responsible responsibledeputy;
	private ArrayList<Process> listProcess;
	
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
        	
        /**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return the responsible
	 */
	public Responsible getResponsible() {
		return responsible;
	}
	
	/**
	 * @param responsible the responsible to set
	 */
	public void setResponsible(Responsible responsible) {
		this.responsible = responsible;
	}
	
	/**
	 * @return the responsibledeputy
	 */
	public Responsible getResponsibledeputy() {
		return responsibledeputy;
	}
	
	/**
	 * @param responsibledeputy the responsibledeputy to set
	 */
	public void setResponsibledeputy(Responsible responsibledeputy) {
		this.responsibledeputy = responsibledeputy;
	}
	
	/**
	 * @return the listProcess
	 */
	public ArrayList<Process> getListProcess() {
		return listProcess;
	}
	
	/**
	 * @param listProcess the listProcess to set
	 */
	public void setListProcess(ArrayList<Process> listProcess) {
		this.listProcess = listProcess;
	}
	
	public Segment(){
		
	}
	
	/**
	 * @param id
	 * @param name
         * @param description
	 * @param responsible
	 * @param responsibledeputy
	 * @param listProcess
	 */
        
	public Segment(int id, String name, String description, Responsible responsible,
			Responsible responsibledeputy, ArrayList<Process> listProcess) {
		this.id = id;
		this.name = name;
                this.description = description;
		this.responsible = responsible;
		this.responsibledeputy = responsibledeputy;
		this.listProcess = listProcess;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName();
	}

    @Override
    public void addObjectToMetaModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateObject() {
        data.database.CrudDatabase.updateSegment(this);
    }

    @Override
    public void associateObject(MetaModelObject secondObject, ArrayList<MetaModelObject> listTarget) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dissociateObject(MetaModelObject secondObject, ArrayList<MetaModelObject> listTarget) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sizeObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Segment other = (Segment) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
