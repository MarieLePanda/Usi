package myObject;


import java.util.ArrayList;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class Server extends MetaModelObject{
    
    private int id, investmentCost, operatingCost, productionCost;
    private String name, description;
    private String typseServer;
    private Responsible responsible, responsibleDeputy, responsibleDevelopment, responsibleOperation;
    private String ram;
    private String processeur;
    private String os;
    private Date productionDate, decommissionDate;
    private ArrayList<Technology> listTechnology;
    
	public int getProductionCost() {
		return productionCost;
	}
	public void setProductionCost(int productionCost) {
		this.productionCost = productionCost;
	}
	public int getInvestmentCost() {
		return investmentCost;
	}
	public void setInvestmentCost(int investmentCost) {
		this.investmentCost = investmentCost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOperatingCost() {
		return operatingCost;
	}
	public void setOperatingCost(int operatingCost) {
		this.operatingCost = operatingCost;
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
	public Responsible getResponsible() {
		return responsible;
	}
	public void setResponsible(Responsible responsible) {
		this.responsible = responsible;
	}
	public String getTypseServer() {
		return typseServer;
	}
	public void setTypseServer(String typseServer) {
		this.typseServer = typseServer;
	}
	public Responsible getResponsibleDeputy() {
		return responsibleDeputy;
	}
	public void setResponsibleDeputy(Responsible responsibleDeputy) {
		this.responsibleDeputy = responsibleDeputy;
	}
	public Responsible getResponsibleOperation() {
		return responsibleOperation;
	}
	public void setResponsibleOperation(Responsible responsibleOperation) {
		this.responsibleOperation = responsibleOperation;
	}
	public Responsible getResponsibleDevelopment() {
		return responsibleDevelopment;
	}
	public void setResponsibleDevelopment(Responsible responsibleDevelopment) {
		this.responsibleDevelopment = responsibleDevelopment;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getProcesseur() {
		return processeur;
	}
	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public Date getDecommissionDate() {
		return decommissionDate;
	}
	public void setDecommissionDate(Date decommissionDate) {
		this.decommissionDate = decommissionDate;
	}
	public Date getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	public ArrayList<Technology> getListTechnology() {
		return listTechnology;
	}
	public void setListTechnology(ArrayList<Technology> listTechnology) {
		this.listTechnology = listTechnology;
	}
	
	public Server(){
		
	}
	
	/**
	 * @param id
	 * @param investmentCost
	 * @param operatingCost
	 * @param productionCost
	 * @param name
	 * @param description
	 * @param typseServer
	 * @param responsible
	 * @param responsibleDeputy
	 * @param responsibleDevelopment
	 * @param responsibleOperation
	 * @param ram
	 * @param processeur
	 * @param os
	 * @param productionDate
	 * @param decommissionDate
	 * @param listTechnology
	 */
	public Server(int id, int investmentCost, int operatingCost,
			int productionCost, String name, String description,
			String typseServer, Responsible responsible,
			Responsible responsibleDeputy, Responsible responsibleDevelopment,
			Responsible responsibleOperation, String ram, String processeur,
			String os, Date productionDate, Date decommissionDate,
			ArrayList<Technology> listTechnology) {
		this.id = id;
		this.investmentCost = investmentCost;
		this.operatingCost = operatingCost;
		this.productionCost = productionCost;
		this.name = name;
		this.description = description;
		this.typseServer = typseServer;
		this.responsible = responsible;
		this.responsibleDeputy = responsibleDeputy;
		this.responsibleDevelopment = responsibleDevelopment;
		this.responsibleOperation = responsibleOperation;
		this.ram = ram;
		this.processeur = processeur;
		this.os = os;
		this.productionDate = productionDate;
		this.decommissionDate = decommissionDate;
		this.listTechnology = listTechnology;
	}
	
	@Override
	public String toString() {
		return "Server [id=" + id + ", investmentCost=" + investmentCost
				+ ", operatingCost=" + operatingCost + ", productionCost="
				+ productionCost + ", name=" + name + ", description="
				+ description + ", typseServer=" + typseServer
				+ ", responsible=" + responsible + ", responsibleDeputy="
				+ responsibleDeputy + ", responsibleDevelopment="
				+ responsibleDevelopment + ", responsibleOperation="
				+ responsibleOperation + ", ram=" + ram + ", processeur="
				+ processeur + ", os=" + os + ", productionDate="
				+ productionDate + ", decommissionDate=" + decommissionDate
				+ ", listTechnology=" + listTechnology + "]";
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
        int hash = 3;
        hash = 67 * hash + this.id;
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
        final Server other = (Server) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
