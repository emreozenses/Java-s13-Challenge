package employeeApp.model;

import java.util.Arrays;

//POJO (Plain Old JAVA Object)
public class Employee {
    private int id ;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;


    public Employee(int id,String fullName){
        this.id = id;
        this.fullName = fullName;
    }
    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this(id, fullName);
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }


    public int getId(){
        return id;
    }
    public String getFullName(){return  fullName;  }
    public String getEmail(){
        return email;
    }
    public String getPassword(){return password; }

    public String[] getHealthplans() {
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

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }
//flag(boolean)
    public void addHealthplan (int index,String name){
        if (index<0){
            System.out.println("index değeri sıfırdan küçük olamaz!");
        }
        else{
            try{
            boolean isExist = false;
            for (String hp:healthplans){
                if(hp!= null && hp.equals(name)){
                    isExist = true;
                    System.out.println(name+" dizi içerisinde mevcut");
                    break;
                }
            }
            if(!isExist){
                if(healthplans[index] == null){
                    healthplans[index] = name;
                }
                else{
                    System.out.println("İlgili index dolu!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Invalid index: "+index);
            }
            catch (NullPointerException npe){
                System.out.println("Null Pointer Exception: " + npe.getMessage());
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
    }}


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}
