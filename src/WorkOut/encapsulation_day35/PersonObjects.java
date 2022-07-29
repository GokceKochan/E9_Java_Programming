package WorkOut.encapsulation_day35;

public class PersonObjects {
    public static void main(String[] args) {

        Person p1 = new Person();
       // p1.name="Daniel";//the color is red because of the private
        // p1.age =28;

        p1.setName("Daniel");
        p1.setAge(28);

        System.out.println(p1.getName()+" : "+p1.getAge());
    }
}
