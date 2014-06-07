package myObject;

import java.util.ArrayList;

import java.sql.Date;

public class Capability extends MetaModelObject{
	
	private int id;
	private String name, description;
	private Date validFrom;
	private Date valideUntil;
	private Process process;
	private Responsible responsible;
	private Responsible responsibleDeputy;
	private ArrayList<Application> listApplication;
	
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
	 * @return the validFrom
	 */
	public Date getValidFrom() {
		return validFrom;
	}
	
	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	
	/**
	 * @return the valideUntil
	 */
	public Date getValideUntil() {
		return valideUntil;
	}
	
	/**
	 * @param valideUntil the valideUntil to set
	 */
	public void setValideUntil(Date valideUntil) {
		this.valideUntil = valideUntil;
	}
	
	/**
	 * @return the process
	 */
	public Process getProcess() {
		return process;
	}
	
	/**
	 * @param process the process to set
	 */
	public void setProcess(Process process) {
		this.process = process;
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
	 * @return the responsibleDeputy
	 */
	public Responsible getResponsibleDeputy() {
		return responsibleDeputy;
	}
	
	/**
	 * @param responsibleDeputy the responsibleDeputy to set
	 */
	public void setResponsibleDeputy(Responsible responsibleDeputy) {
		this.responsibleDeputy = responsibleDeputy;
	}
	
	/**
	 * @return the listApplication
	 */
	public ArrayList<Application> getListApplication() {
		return listApplication;
	}
	
	/**
	 * @param listApplication the listApplication to set
	 */
	public void setListApplication(ArrayList<Application> listApplication) {
		this.listApplication = listApplication;
	}
	
	public Capability(){
		
	}

	/**
	 * @param id
	 * @param name
         * @param description
	 * @param validFrom
	 * @param valideUntil
	 * @param process
	 * @param responsible
	 * @param responsibleDeputy
	 * @param listApplication
	 */
	public Capability(int id, Process process, String name, String description, Date validFrom, Date valideUntil,
			Responsible responsible, Responsible responsibleDeputy,	ArrayList<Application> listApplication) {
		this.id = id;
		this.name = name;
                this.description = description;
		this.validFrom = validFrom;
		this.valideUntil = valideUntil;
		this.process = process;
		this.responsible = responsible;
		this.responsibleDeputy = responsibleDeputy;
		this.listApplication = listApplication;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public int sizeObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.id;
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
        final Capability other = (Capability) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
	

}
