package employeeApp;

public enum Plan {
    plan1("Family",25000),
    plan2("Standart",15000),
    plan3("LowCost",5000);


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

    @Override
    public String toString() {
        return "Plan{" +
                "planName='" + planName + '\'' +
                ", planPrice=" + planPrice +
                '}';
    }
}

