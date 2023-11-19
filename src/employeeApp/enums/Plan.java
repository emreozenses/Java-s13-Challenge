package employeeApp.enums;

public enum Plan {
    PLAN1("Family",25000),
    PLAN2("Standart",15000),
    PLAN3("LowCost",5000);


private String planName;
private int planPrice;

Plan(String planName,int planPrice){
 this.planName = planName;
 this.planPrice = planPrice;
}

    public String getPlanName() {
        return planName;
    }

    public int getPlanPrice() {
        return planPrice;
    }


}

