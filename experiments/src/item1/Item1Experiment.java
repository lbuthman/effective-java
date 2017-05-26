package item1;

/**
 * Created by lbuthman on 5/24/17.
 * Using public static factory methods instead of constructors
 * - this is a base experiment to get the syntax and see how things work
 */
class Brewer {

    private Brewer() {
        System.out.println("Hi, I'm the constructor.");
    }

    public static Brewer makeBrew() {
        System.out.println("brew() called ~~~");
        return new Brewer();
    }

    public void cookBrew() {
        System.out.println("Heating up brew ^^^^^^");
    }
}

public class Item1Experiment {
    public static void main(String[] args) {
        //item1.Brewer failBrew = new item1.Brewer();
        Brewer goodBrew = Brewer.makeBrew();
        goodBrew.cookBrew();
    }
}
