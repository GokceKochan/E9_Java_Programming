package WorkOut.Inheritance_day37.workOut.scrumTask;

public class Tester extends Employee{//Tester is A Employee,Tester is A person

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is creating ticket");
    }
}
