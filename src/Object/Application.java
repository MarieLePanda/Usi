package Object;

import java.util.ArrayList;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class Application {
	
	private int id, investmentCost, operatingCost, numberUser;
	private String name, description;
	private Date productionDate, decommissionDate;
	private TypeApplication typeApplication;
	private Responsible responsible, responsibleDeputy, responsibleOperation, responsibleDevelopment;
	private Lifecycle lifecycle;
	private Database database;
	private Security securityAvailability, securityConfidentiality, securityIntegrity;
	private Category category;
	private Server server;
	private Fit fitBusiness, fitIT, fitCost;
	private Strategy strategyImportance;
	private ArrayList<Capability> listCapability;
	private ArrayList<Application> listSubstitute, listReplace;
	private ArrayList<Interface> listInterfaceProvider, listInterfaceUse;
	private ArrayList<Technology> listTechnology;
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
	 * @return the typeApplication
	 */
	public TypeApplication getTypeApplication() {
		return typeApplication;
	}
	/**
	 * @param typeApplication the typeApplication to set
	 */
	public void setTypeApplication(TypeApplication typeApplication) {
		this.typeApplication = typeApplication;
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
	 * @return the database
	 */
	public Database getDatabase() {
		return database;
	}
	/**
	 * @param database the database to set
	 */
	public void setDatabase(Database database) {
		this.database = database;
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
	 * @return the investmentCost
	 */
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
	 * @return the numberUser
	 */
	public int getNumberUser() {
		return numberUser;
	}
	/**
	 * @param numberUser the numberUser to set
	 */
	public void setNumberUser(int numberUser) {
		this.numberUser = numberUser;
	}
	/**
	 * @return the securityAvailability
	 */
	public Security getSecurityAvailability() {
		return securityAvailability;
	}
	/**
	 * @param securityAvailability the securityAvailability to set
	 */
	public void setSecurityAvailability(Security securityAvailability) {
		this.securityAvailability = securityAvailability;
	}
	/**
	 * @return the securityConfidentiality
	 */
	public Security getSecurityConfidentiality() {
		return securityConfidentiality;
	}
	/**
	 * @param securityConfidentiality the securityConfidentiality to set
	 */
	public void setSecurityConfidentiality(Security securityConfidentiality) {
		this.securityConfidentiality = securityConfidentiality;
	}
	/**
	 * @return the securityIntegrity
	 */
	public Security getSecurityIntegrity() {
		return securityIntegrity;
	}
	/**
	 * @param securityIntegrity the securityIntegrity to set
	 */
	public void setSecurityIntegrity(Security securityIntegrity) {
		this.securityIntegrity = securityIntegrity;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
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
	 * @return the fitBusiness
	 */
	public Fit getFitBusiness() {
		return fitBusiness;
	}
	/**
	 * @param fitBusiness the fitBusiness to set
	 */
	public void setFitBusiness(Fit fitBusiness) {
		this.fitBusiness = fitBusiness;
	}
	/**
	 * @return the fitIT
	 */
	public Fit getFitIT() {
		return fitIT;
	}
	/**
	 * @param fitIT the fitIT to set
	 */
	public void setFitIT(Fit fitIT) {
		this.fitIT = fitIT;
	}
	/**
	 * @return the fitCost
	 */
	public Fit getFitCost() {
		return fitCost;
	}
	/**
	 * @param fitCost the fitCost to set
	 */
	public void setFitCost(Fit fitCost) {
		this.fitCost = fitCost;
	}
	/**
	 * @return the strategyImportance
	 */
	public Strategy getStrategyImportance() {
		return strategyImportance;
	}
	/**
	 * @param strategyImportance the strategyImportance to set
	 */
	public void setStrategyImportance(Strategy strategyImportance) {
		this.strategyImportance = strategyImportance;
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
	/**
	 * @return the listSubstitute
	 */
	public ArrayList<Application> getListSubstitute() {
		return listSubstitute;
	}
	/**
	 * @param listSubstitute the listSubstitute to set
	 */
	public void setListSubstitute(ArrayList<Application> listSubstitute) {
		this.listSubstitute = listSubstitute;
	}
	/**
	 * @return the listReplace
	 */
	public ArrayList<Application> getListReplace() {
		return listReplace;
	}
	/**
	 * @param listReplace the listReplace to set
	 */
	public void setListReplace(ArrayList<Application> listReplace) {
		this.listReplace = listReplace;
	}
	/**
	 * @return the listInterfaceProvider
	 */
	public ArrayList<Interface> getListInterfaceProvider() {
		return listInterfaceProvider;
	}
	/**
	 * @param listInterfaceProvider the listInterfaceProvider to set
	 */
	public void setListInterfaceProvider(ArrayList<Interface> listInterfaceProvider) {
		this.listInterfaceProvider = listInterfaceProvider;
	}
	/**
	 * @return the listInterfaceUse
	 */
	public ArrayList<Interface> getListInterfaceUse() {
		return listInterfaceUse;
	}
	/**
	 * @param listInterfaceUse the listInterfaceUse to set
	 */
	public void setListInterfaceUse(ArrayList<Interface> listInterfaceUse) {
		this.listInterfaceUse = listInterfaceUse;
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
	
	public Application(){
		
	}
	
	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param productionDate
	 * @param typeApplication
	 * @param responsible
	 * @param responsibleDeputy
	 * @param responsibleOperation
	 * @param responsibleDevelopment
	 * @param lifecycle
	 * @param database
	 * @param decommissionDate
	 * @param investmentCost
	 * @param operatingCost
	 * @param numberUser
	 * @param securityAvailability
	 * @param securityConfidentiality
	 * @param securityIntegrity
	 * @param category
	 * @param server
	 * @param fitBusiness
	 * @param fitIT
	 * @param fitCost
	 * @param strategyImportance
	 * @param listCapability
	 * @param listSubstitute
	 * @param listReplace
	 * @param listInterfaceProvider
	 * @param listInterfaceUse
	 * @param listTechnology
	 */
	public Application(int id, String name, String description,
			Date productionDate, TypeApplication typeApplication,
			Responsible responsible, Responsible responsibleDeputy,
			Responsible responsibleOperation,
			Responsible responsibleDevelopment, Lifecycle lifecycle,
			Database database, Date decommissionDate, int investmentCost,
			int operatingCost, int numberUser, Security securityAvailability,
			Security securityConfidentiality, Security securityIntegrity,
			Category category, Server server, Fit fitBusiness, Fit fitIT,
			Fit fitCost, Strategy strategyImportance,
			ArrayList<Capability> listCapability,
			ArrayList<Application> listSubstitute,
			ArrayList<Application> listReplace,
			ArrayList<Interface> listInterfaceProvider,
			ArrayList<Interface> listInterfaceUse,
			ArrayList<Technology> listTechnology) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.productionDate = productionDate;
		this.typeApplication = typeApplication;
		this.responsible = responsible;
		this.responsibleDeputy = responsibleDeputy;
		this.responsibleOperation = responsibleOperation;
		this.responsibleDevelopment = responsibleDevelopment;
		this.lifecycle = lifecycle;
		this.database = database;
		this.decommissionDate = decommissionDate;
		this.investmentCost = investmentCost;
		this.operatingCost = operatingCost;
		this.numberUser = numberUser;
		this.securityAvailability = securityAvailability;
		this.securityConfidentiality = securityConfidentiality;
		this.securityIntegrity = securityIntegrity;
		this.category = category;
		this.server = server;
		this.fitBusiness = fitBusiness;
		this.fitIT = fitIT;
		this.fitCost = fitCost;
		this.strategyImportance = strategyImportance;
		this.listCapability = listCapability;
		this.listSubstitute = listSubstitute;
		this.listReplace = listReplace;
		this.listInterfaceProvider = listInterfaceProvider;
		this.listInterfaceUse = listInterfaceUse;
		this.listTechnology = listTechnology;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Application [id=" + id + ", name=" + name + ", description="
				+ description + ", productionDate=" + productionDate
				+ ", typeApplication=" + typeApplication + ", responsible="
				+ responsible + ", responsibleDeputy=" + responsibleDeputy
				+ ", responsibleOperation=" + responsibleOperation
				+ ", responsibleDevelopment=" + responsibleDevelopment
				+ ", lifecycle=" + lifecycle + ", database=" + database
				+ ", decommissionDate=" + decommissionDate
				+ ", investmentCost=" + investmentCost + ", operatingCost="
				+ operatingCost + ", numberUser=" + numberUser
				+ ", securityAvailability=" + securityAvailability
				+ ", securityConfidentiality=" + securityConfidentiality
				+ ", securityIntegrity=" + securityIntegrity + ", category="
				+ category + ", server=" + server + ", fitBusiness="
				+ fitBusiness + ", fitIT=" + fitIT + ", fitCost=" + fitCost
				+ ", strategyImportance=" + strategyImportance
				+ ", listCapability=" + listCapability + ", listSubstitute="
				+ listSubstitute + ", listReplace=" + listReplace
				+ ", listInterfaceProvider=" + listInterfaceProvider
				+ ", listInterfaceUse=" + listInterfaceUse
				+ ", listTechnology=" + listTechnology + "]";
	}
	
	
	
	

}
