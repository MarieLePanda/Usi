package Object;

import java.util.ArrayList;
import sun.util.calendar.LocalGregorianCalendar.Date;

public class Server {
    
    private int id, investmentCost, operatingCost, productionCost;
    private String name, description;
    private TypeServer typseServer;
    private Responsible responsible, responsibleDeputy, responsibleDevelopment, responsibleOperation;
    private Ram ram;
    private Processeur processeur;
    private Os os;
    private Date productionDate, decommissionDate;
    private ArrayList<Technology> listTechnology;
}
