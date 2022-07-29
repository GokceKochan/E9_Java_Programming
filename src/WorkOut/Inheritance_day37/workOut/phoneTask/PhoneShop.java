package WorkOut.Inheritance_day37.workOut.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 12","6.7 inc",1000,"white");

        Samsung samsung = new Samsung("Galaxy S19","6 inc",900,"White");

        Nokia nokia = new Nokia("Brick","4 inc",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println("-------------------------------");

        iphone.call(911);
        iphone.text(12345678);
        iphone.facetime(786549);
        iphone.facetime("yahoo@gmail.com");

        System.out.println("-------------------------------");

        samsung.call(2838485);
        samsung.text(12345);
        samsung.freeze();

        System.out.println("--------------------------------");

        nokia.call(233556);
        nokia.text(3247597);
        nokia.selfDefense();

    }
}
