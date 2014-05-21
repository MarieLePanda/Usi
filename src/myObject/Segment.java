package myObject;

import java.util.ArrayList;

public class Segment extends MetaModelObject{
	
	private int id;
	private String name;
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
	 * @param responsible
	 * @param responsibledeputy
	 * @param listProcess
	 */
	public Segment(int id, String name, Responsible responsible,
			Responsible responsibledeputy, ArrayList<Process> listProcess) {
		this.id = id;
		this.name = name;
		this.responsible = responsible;
		this.responsibledeputy = responsibledeputy;
		this.listProcess = listProcess;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Segment [id=" + id + ", name=" + name + ", responsible="
				+ responsible + ", responsibledeputy=" + responsibledeputy
				+ ", listProcess=" + listProcess + "]";
	}

    @Override
    void addObjectToMetaModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void createObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void deleteObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void updateObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void associateObject(MetaModelObject secondObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void dissociateObject(MetaModelObject secondObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
