package myObject;

import java.sql.Date;
import java.util.ArrayList;


public class Database extends MetaModelObject{


	private int investmentCost, operatingCost;
	private String description;
	private Responsible responsible, responsibleDeputy, responsibleDevelopment, responsibleOperation;
	private Server server;
	private Date productionDate, decommissionDate;
	private Lifecycle lifecycle;
	private ArrayList<Technology> listTechnology;
	

	public int getInvestmentCost() {
		return investmentCost;
	}
	/**
	 * @param investmentCost the investmentCost to set
	 */
	public void setInvestmentCost(int investmentCost) {
		this.investmentCost = investmentCost;
	}
	/**
	 * @return the operatingCost
	 */
	public int getOperatingCost() {
		return operatingCost;
	}
	/**
	 * @param operatingCost the operatingCost to set
	 */
	public void setOperatingCost(int operatingCost) {
		this.operatingCost = operatingCost;
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
	 * @return the responsibleDevelopment
	 */
	public Responsible getResponsibleDevelopment() {
		return responsibleDevelopment;
	}
	/**
	 * @param responsibleDevelopment the responsibleDevelopment to set
	 */
	public void setResponsibleDevelopment(Responsible responsibleDevelopment) {
		this.responsibleDevelopment = responsibleDevelopment;
	}
	/**
	 * @return the responsibleOperation
	 */
	public Responsible getResponsibleOperation() {
		return responsibleOperation;
	}
	/**
	 * @param responsibleOperation the responsibleOperation to set
	 */
	public void setResponsibleOperation(Responsible responsibleOperation) {
		this.responsibleOperation = responsibleOperation;
	}
	/**
	 * @return the server
	 */
	public Server getServer() {
		return server;
	}
	/**
	 * @param server the server to set
	 */
	public void setServer(Server server) {
		this.server = server;
	}
	/**
	 * @return the productionDate
	 */
	public Date getProductionDate() {
		return productionDate;
	}
	/**
	 * @param productionDate the productionDate to set
	 */
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	/**
	 * @return the decommissionDate
	 */
	public Date getDecommissionDate() {
		return decommissionDate;
	}
	/**
	 * @param decommissionDate the decommissionDate to set
	 */
	public void setDecommissionDate(Date decommissionDate) {
		this.decommissionDate = decommissionDate;
	}
	/**
	 * @return the lifecycle
	 */
	public Lifecycle getLifecycle() {
		return lifecycle;
	}
	/**
	 * @param lifecycle the lifecycle to set
	 */
	public void setLifecycle(Lifecycle lifecycle) {
		this.lifecycle = lifecycle;
	}
	/**
	 * @return the listTechnology
	 */
	public ArrayList<Technology> getListTechnology() {
		return listTechnology;
	}
	/**
	 * @param listTechnology the listTechnology to set
	 */
	public void setListTechnology(ArrayList<Technology> listTechnology) {
		this.listTechnology = listTechnology;
	}
	
	public Database(){
		
	}
	
         /**
	 * @param id
	 * @param investmentCost
	 * @param operatingCost
	 * @param name
	 * @param description
	 * @param responsible
	 * @param responsibleDeputy
	 * @param responsibleDevelopment
	 * @param responsibleOperation
	 * @param server
	 * @param productionDate
	 * @param decommissionDate
	 * @param lifecycle
	 */
	public Database(int id, String name, String description, Responsible responsible,
			Responsible responsibleDeputy, Responsible responsibleDevelopment,
			Responsible responsibleOperation, Server server, int investmentCost, int operatingCost,
			Date productionDate, Date decommissionDate, Lifecycle lifecycle
			) {
		this.id = id;
		this.investmentCost = investmentCost;
		this.operatingCost = operatingCost;
		this.name = name;
		this.description = description;
		this.responsible = responsible;
		this.responsibleDeputy = responsibleDeputy;
		this.responsibleDevelopment = responsibleDevelopment;
		this.responsibleOperation = responsibleOperation;
		this.server = server;
		this.productionDate = productionDate;
		this.decommissionDate = decommissionDate;
		this.lifecycle = lifecycle;
	}
        
	/**
	 * @param id
	 * @param investmentCost
	 * @param operatingCost
	 * @param name
	 * @param description
	 * @param responsible
	 * @param responsibleDeputy
	 * @param responsibleDevelopment
	 * @param responsibleOperation
	 * @param server
	 * @param productionDate
	 * @param decommissionDate
	 * @param lifecycle
	 * @param listTechnology
	 */
	public Database(int id, String name, String description, Responsible responsible,
			Responsible responsibleDeputy, Responsible responsibleDevelopment,
			Responsible responsibleOperation, Server server, int investmentCost, int operatingCost,
			Date productionDate, Date decommissionDate, Lifecycle lifecycle,
			ArrayList<Technology> listTechnology) {
		this.id = id;
		this.investmentCost = investmentCost;
		this.operatingCost = operatingCost;
		this.name = name;
		this.description = description;
		this.responsible = responsible;
		this.responsibleDeputy = responsibleDeputy;
		this.responsibleDevelopment = responsibleDevelopment;
		this.responsibleOperation = responsibleOperation;
		this.server = server;
		this.productionDate = productionDate;
		this.decommissionDate = decommissionDate;
		this.lifecycle = lifecycle;
		this.listTechnology = listTechnology;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Database [id=" + id + ", investmentCost=" + investmentCost
				+ ", operatingCost=" + operatingCost + ", name=" + name
				+ ", description=" + description + ", responsible="
				+ responsible + ", responsibleDeputy=" + responsibleDeputy
				+ ", responsibleDevelopment=" + responsibleDevelopment
				+ ", responsibleOperation=" + responsibleOperation
				+ ", server=" + server + ", productionDate=" + productionDate
				+ ", decommissionDate=" + decommissionDate + ", lifecycle="
				+ lifecycle + ", listTechnology=" + listTechnology + "]";
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
	
}
