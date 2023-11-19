package employeeApp.model;

import java.util.Arrays;

public class Company {

    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    private void checkGiro(double giro){
        if (giro>=0){
            this.giro = giro;}
        else {
            this.giro = 0;
            System.out.println("giro sıfırdan küçük olamaz!");

        }

    }



    public Company(int id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public double getGiro() {
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
        checkGiro(giro);
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        try{
        if (developerNames[index] == null){
            this.developerNames[index] = name;
        }
        else {
            System.out.println("Girmiş olduğunuz index doludur.");
        }}

        catch (ArrayIndexOutOfBoundsException ex){

            System.out.println("Girdiğiniz index değeri bulunmamaktadır." + index);
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
