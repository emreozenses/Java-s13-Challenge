package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id ;
    private String fullName;
    private String email;
    private String password;
    private Healthplan healthplans;

    public Employee(int id, String fullName, String email, String password, Healthplan healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }


    public int getId(){
        return this.id;
    }
    public String getFullName(){
        return  this.fullName;

    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;

    }

    public Healthplan getHealthplans() {
        return healthplans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }





    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +

                '}';
    }
}
