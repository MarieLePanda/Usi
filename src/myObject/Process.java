package myObject;

import java.sql.Date;
import java.util.ArrayList;


public class Process extends MetaModelObject{

	private int id;
	private String name, description;
	private Date validFrom;
	private Date valideUntil;
	private Segment segment;
	private Responsible responsible;
	private Responsible responsibleDeputy;
	private ArrayList<Capability> listCapability;
	
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
	 * @param description the description to set
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
	 * @return the segment
	 */
	public Segment getSegment() {
		return segment;
	}
	
	/**
	 * @param segment the segment to set
	 */
	public void setSegment(Segment segment) {
		this.segment = segment;
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
	 * @return the listCapability
	 */
	public ArrayList<Capability> getListCapability() {
		return listCapability;
	}
	
	/**
	 * @param listCapability the listCapability to set
	 */
	public void setListCapability(ArrayList<Capability> listCapability) {
		this.listCapability = listCapability;
	}
	
	public Process(){
		
	}
	
	/**
	 * @param id
	 * @param name
	 * @param validFrom
	 * @param valideUntil
	 * @param segment
	 * @param responsible
	 * @param responsibleDeputy
	 * @param listCapability
	 */
	public Process(int id, String name, Date validFrom, Date valideUntil,
			Segment segment, Responsible responsible,
			Responsible responsibleDeputy, ArrayList<Capability> listCapability) {
		this.id = id;
		this.name = name;
		this.validFrom = validFrom;
		this.valideUntil = valideUntil;
		this.segment = segment;
		this.responsible = responsible;
		this.responsibleDeputy = responsibleDeputy;
		this.listCapability = listCapability;
	}

         /**
	 * @param id
	 * @param name
         * @param description
	 * @param validFrom
	 * @param valideUntil
	 * @param segment
	 * @param responsible
	 * @param responsibleDeputy
	 * @param listCapability
	 */
        public Process(int id, String name, String description, Date validFrom, 
                Date valideUntil, Segment segment, Responsible responsible, 
                Responsible responsibleDeputy, ArrayList<Capability> listCapability) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.validFrom = validFrom;
            this.valideUntil = valideUntil;
            this.segment = segment;
            this.responsible = responsible;
            this.responsibleDeputy = responsibleDeputy;
            this.listCapability = listCapability;
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
    public void sizeObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
