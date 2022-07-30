package WorkOut.Inheritance_day37.workOut.scrumTask;

public class Employee extends PersonClass{//Employee is a person

    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;


    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}



/*
name,age,gender,jobTitle,id,salary,companyName
work(),toString()

 */
