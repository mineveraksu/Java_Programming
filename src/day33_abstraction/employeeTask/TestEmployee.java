package day33_abstraction.employeeTask;

public class TestEmployee {
    public static void main(String[] args) {
        Teacher teacher= new Teacher("james",45,'M',"B1","Math teacher",75000);
        Developer developer=new Developer("lucy",30,'F',"C1","java developer",95000,"java");
        Driver driver=new Driver("Aaron",48,'M',"D1","Truck driver",90000);
        Tester tester=new Tester("Emily",35,'F',"E1","Manuel tester",80000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(driver);

        teacher.work();
        developer.work();
        tester.work();
        driver.work();



    }
}
