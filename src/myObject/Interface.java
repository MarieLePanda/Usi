package myObject;

import myObject.old.Synchronicity;
import myObject.old.Security;
import java.util.ArrayList;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class Interface extends MetaModelObject{

	private int id;
	private String name, description, dataTransfer;
	private Date frequency, productionDate, decommissionDate;
	private Responsible responsible, responsibleDeputy, responsibleDevelopment, responsibleOperation;
	private Synchronicity synchronicity;
	private Security securityAvailability, securityConfidentiality, securityIntegrety;
	private Lifecycle lifecycle;
	private ArrayList<Technology> listTechnology;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDataTransfer() {
		return dataTransfer;
	}
	public void setDataTransfer(String dataTransfer) {
		this.dataTransfer = dataTransfer;
	}
	public Date getFrequency() {
		return frequency;
	}
	public void setFrequency(Date frequency) {
		this.frequency = frequency;
	}
	public Date getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	public Date getDecommissionDate() {
		return decommissionDate;
	}
	public void setDecommissionDate(Date decommissionDate) {
		this.decommissionDate = decommissionDate;
	}
	public Responsible getResponsible() {
		return responsible;
	}
	public void setResponsible(Responsible responsible) {
		this.responsible = responsible;
	}
	public Responsible getResponsibleDeputy() {
		return responsibleDeputy;
	}
	public void setResponsibleDeputy(Responsible responsibleDeputy) {
		this.responsibleDeputy = responsibleDeputy;
	}
	public Responsible getResponsibleDevelopment() {
		return responsibleDevelopment;
	}
	public void setResponsibleDevelopment(Responsible responsibleDevelopment) {
		this.responsibleDevelopment = responsibleDevelopment;
	}
	public Responsible getResponsibleOperation() {
		return responsibleOperation;
	}
	public void setResponsibleOperation(Responsible responsibleOperation) {
		this.responsibleOperation = responsibleOperation;
	}
	public Synchronicity getSynchronicity() {
		return synchronicity;
	}
	public void setSynchronicity(Synchronicity synchronicity) {
		this.synchronicity = synchronicity;
	}
	public Security getSecurityAvailability() {
		return securityAvailability;
	}
	public void setSecurityAvailability(Security securityAvailability) {
		this.securityAvailability = securityAvailability;
	}
	public Security getSecurityConfidentiality() {
		return securityConfidentiality;
	}
	public void setSecurityConfidentiality(Security securityConfidentiality) {
		this.securityConfidentiality = securityConfidentiality;
	}
	public Security getSecurityIntegrety() {
		return securityIntegrety;
	}
	public void setSecurityIntegrety(Security securityIntegrety) {
		this.securityIntegrety = securityIntegrety;
	}
	public Lifecycle getLifecycle() {
		return lifecycle;
	}
	public void setLifecycle(Lifecycle lifecycle) {
		this.lifecycle = lifecycle;
	}
	public ArrayList<Technology> getListTechnology() {
		return listTechnology;
	}
	public void setListTechnology(ArrayList<Technology> listTechnology) {
		this.listTechnology = listTechnology;
	}
	
	public Interface(){
		
	}
	
	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param dataTransfer
	 * @param frequency
	 * @param productionDate
	 * @param decommissionDate
	 * @param responsible
	 * @param responsibleDeputy
	 * @param responsibleDevelopment
	 * @param responsibleOperation
	 * @param synchronicity
	 * @param securityAvailability
	 * @param securityConfidentiality
	 * @param securityIntegrety
	 * @param lifecycle
	 * @param listTechnology
	 */
	public Interface(int id, String name, String description,
			String dataTransfer, Date frequency, Date productionDate,
			Date decommissionDate, Responsible responsible,
			Responsible responsibleDeputy, Responsible responsibleDevelopment,
			Responsible responsibleOperation, Synchronicity synchronicity,
			Security securityAvailability, Security securityConfidentiality,
			Security securityIntegrety, Lifecycle lifecycle,
			ArrayList<Technology> listTechnology) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.dataTransfer = dataTransfer;
		this.frequency = frequency;
		this.productionDate = productionDate;
		this.decommissionDate = decommissionDate;
		this.responsible = responsible;
		this.responsibleDeputy = responsibleDeputy;
		this.responsibleDevelopment = responsibleDevelopment;
		this.responsibleOperation = responsibleOperation;
		this.synchronicity = synchronicity;
		this.securityAvailability = securityAvailability;
		this.securityConfidentiality = securityConfidentiality;
		this.securityIntegrety = securityIntegrety;
		this.lifecycle = lifecycle;
		this.listTechnology = listTechnology;
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
