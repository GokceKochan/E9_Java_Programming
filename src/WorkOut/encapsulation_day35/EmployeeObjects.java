package WorkOut.encapsulation_day35;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tatiana",'F',28,110000);
        System.out.println(employee1);

        employee1.setAge(32);
        System.out.println(employee1);



    }
}
