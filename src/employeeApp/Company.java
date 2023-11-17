package employeeApp;

import java.util.Arrays;

public class Company {

    private int id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(int id, String name, int giro,String[] developerNames){
        if (giro>=0){
        this.giro = giro;}
        else {
            System.out.println("giro sıfırdan küçük olamaz!");

        }
        this.id = id;
        this.name= name;
        this.developerNames = developerNames;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public int getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        if (developerNames[index].isEmpty()){
            this.developerNames[index] = name;
        }

        else if (developerNames.length-1<index || index<0){
            System.out.println("Girdiğiniz index değeri bulunmamaktadır.");
        }

        else {
            System.out.println("Girmiş olduğunuz index doludur.");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
