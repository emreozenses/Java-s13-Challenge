package employeeApp;

import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;
import employeeApp.enums.Plan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan5 = new Healthplan(1,"A Sigorta",Plan.PLAN1);
        Healthplan plan4 = new Healthplan(2,"B Sigota",Plan.PLAN2);

        System.out.println(plan4);
        System.out.println(plan5);

        String[] healthplans = new String[3];
        healthplans[0] = plan4.getFullName();
        healthplans[1] = plan5.getFullName();

        Employee employee = new Employee(1,"Emre","emreozenses@gmail.com","2354",healthplans);

        employee.addHealthplan(0,"C Sigorta");
        employee.addHealthplan(2,"A Sigorta");
        employee.addHealthplan(2,"C Sigorta");
        employee.addHealthplan(3,"T Sigorta");

        System.out.println(Arrays.toString(employee.getHealthplans()));

        System.out.println("****************************");
        Company company=new Company(1,"workintech",1000000000,new String[]{"Erhan","Fatih Tanrıverdi",null});

        company.addEmployee(0,"Ali Veli");
        company.addEmployee(2,"Mehmet Ali Veli");
        System.out.println(Arrays.toString(company.getDeveloperNames()));
        company.addEmployee(-1,"Mehmet Ali Osman");
        company.addEmployee(5,"Mehmet Ali Osman");
        System.out.println(company);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();


    }
}
