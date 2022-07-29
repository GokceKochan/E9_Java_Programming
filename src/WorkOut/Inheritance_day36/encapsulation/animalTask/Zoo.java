package WorkOut.Inheritance_day36.encapsulation.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","White");

        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();

        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3, "Small", "Brown");
        cat.eat();
        cat.drink();
        cat.move();
        cat.sleep();

        cat.scratch();
        cat.meow();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large","Brown");
        tiger.eat();
        tiger.drink();
        tiger.move();
        tiger.sleep();

        tiger.roar();
        tiger.hunt();
    }
}
