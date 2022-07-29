package WorkOut.Inheritance_day37.workOut.AnimalTask;

public class Cat extends Animal{//when the red lamb showing,click on it chose"create constructor
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch(){

        System.out.println(name+" is scratching");
    }
}
