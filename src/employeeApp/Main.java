package employeeApp;

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

        Healthplan hplan_1 = new Healthplan(1,"Emre",Plan.plan1);
        Company company_1 = new Company(1,"Workintech",500000, new String[]{"Emre","Hasan","Ferdi"});
        Employee employee_1 = new Employee(1,company_1.getDeveloperNames()[0],"emreozenses@gmail.com","123456",hplan_1 );

        System.out.println(hplan_1.toString());
        System.out.println(company_1.toString());
        System.out.println(employee_1.toString());
        System.out.println(Plan.plan2.toString());
    }
}
