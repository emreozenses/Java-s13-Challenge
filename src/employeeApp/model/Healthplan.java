package employeeApp.model;

import employeeApp.enums.Plan;

public class Healthplan {

    private int id;
    private String name;
    private Plan plan;

    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }


    public int getId() {
        return id;
    }

    public String getFullName() {
        return name;
    }

    public Plan getHealthplans() {
        return plan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String name) {
        this.name = name;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;


    }

    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan={" +"name:"+ plan.getPlanName()+"price: "+plan.getPlanPrice()+"}"+
                '}';
    }
}