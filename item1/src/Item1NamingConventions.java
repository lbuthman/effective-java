/**
 * Created by lbuthman on 5/25/17.
 * One disadvantage to the public static factory method is that it doesn't draw as
 * much attention as will a Constructor when someone wants to use the class. This can
 * be mitigated by using standard naming conventions.
 */

class ShapeShifter {

    public String shape;
    private static ShapeShifter defaultShifter;

    private ShapeShifter(String s) {
        shape = "<<shifting shape>> (*now*) --> " + s;
    }

    //convert value to string needed for instance
    public static ShapeShifter valueOf(Object o) {
        return new ShapeShifter(o.toString());
    }

    //same as above but slightly shorter syntax
    public static ShapeShifter of(Object o) {
        return new ShapeShifter(o.toString());
    }

    //singleton
    public static ShapeShifter getInstance() {
        if (defaultShifter == null) {
            return defaultShifter = makeInstance();
        } else {
            return defaultShifter;
        }
    }

    private static ShapeShifter makeInstance() {
        return new ShapeShifter("Highlander");
    }

    //guarantees a new instance
    public static ShapeShifter newInstance(int i) {
        switch (i) {
            case 1:
                return new ShapeShifter("Neo");
            case 2:
                return new ShapeShifter("MC Hammer");
            default:
                return new ShapeShifter("One in a million");
        }
    }
}

public class Item1NamingConventions {
    public static void main(String[] args) {

        ShapeShifter[] shifters = new ShapeShifter[7];

        String e = "experimental form";
        shifters[0] = ShapeShifter.valueOf(e);

        Integer eleven = 11;
        shifters[1] = ShapeShifter.of(eleven);

        int biggie = 1000000;
        shifters[2] = ShapeShifter.newInstance(biggie);

        int smallie = 1;
        shifters[3] = ShapeShifter.newInstance(smallie);

        shifters[4] = ShapeShifter.getInstance();

        for (ShapeShifter shifter: shifters) {
            System.out.println(shifter.shape);
        }

    }
}
