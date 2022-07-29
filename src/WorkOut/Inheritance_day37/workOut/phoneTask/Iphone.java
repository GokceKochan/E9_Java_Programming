package WorkOut.Inheritance_day37.workOut.phoneTask;

public class Iphone extends Phone{
    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);//All Iphone are same as "Apple" so we can remove that variable part on public class
    }

    public void facetime(long phoneNumber){
        System.out.println(brand+" is having a Facetime with phone number "+phoneNumber);
    }
    public void facetime(String email){
        System.out.println(brand+" is having a Facetime with email "+email);
    }
}
/*

Create a subclass named IPhone:
      Variables:
      brand,model,size,price,color


      Methods:
      call(long phoneNumber)
      text(long phoneNumber)
      facetime(long phoneNumber)
      facetime(String email)
      toString()
 */