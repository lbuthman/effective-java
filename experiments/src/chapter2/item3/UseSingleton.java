package chapter2.item3;

/**
 * Created by lbuthman on 5/27/17.
 */
enum EnumSingleton {
    INSTANCE;

    public void lovingIt() {System.out.println("Nope! Single and lovin' it!");}
}

public class UseSingleton {
    public static void main(String[] args) {
        System.out.println("Hi Singleton, have you met anyone?");
        EnumSingleton single = EnumSingleton.INSTANCE;
        single.lovingIt();
    }
}
