package myObject;

import java.sql.Date;
import java.util.ArrayList;
import myObject.old.Category;


public class Technology extends MetaModelObject{

    private int investmentCost, operatingCost;
    private String description;
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
