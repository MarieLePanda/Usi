package myObject;

import myObject.old.Category;
import java.util.ArrayList;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class Technology extends MetaModelObject{

    private int id, investmentCost, operatingCost;
    private String name, description;
    private Provider provider;
    private Category category;
    private Date productionDate, decommissionDate;
    private Lifecycle lifecycle;
    
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
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
	public Lifecycle getLifecycle() {
		return lifecycle;
	}
	public void setLifecycle(Lifecycle lifecycle) {
		this.lifecycle = lifecycle;
	}
	
	public Technology(){
		
	}
	
	public Technology(int id, int investmentCost, int operatingCost,
			String name, String description, Provider provider,
			Category category, Date productionDate, Date decommissionDate,
			Lifecycle lifecycle) {
		super();
		this.id = id;
		this.investmentCost = investmentCost;
		this.operatingCost = operatingCost;
		this.name = name;
		this.description = description;
		this.provider = provider;
		this.category = category;
		this.productionDate = productionDate;
		this.decommissionDate = decommissionDate;
		this.lifecycle = lifecycle;
	}
	
	@Override
	public String toString() {
		return "Technology [id=" + id + ", investmentCost=" + investmentCost
				+ ", operatingCost=" + operatingCost + ", name=" + name
				+ ", description=" + description + ", provider=" + provider
				+ ", category=" + category + ", productionDate="
				+ productionDate + ", decommissionDate=" + decommissionDate
				+ ", lifecycle=" + lifecycle + "]";
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
