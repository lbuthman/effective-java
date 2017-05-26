package item2;

/**
 * Created by lbuthman on 5/25/17.
 * The Builder Pattern is cool, but I think it might only be for immutable classes.
 * What if I want to change a parameter after creating it? Can I?
 */

class Lifts {
    private final int backSquat;
    private final int benchPress;
    private final int frontSquat;

    public static class Builder {

        private final int backSquat;

        private int benchPress;
        private int frontSquat;

        public Builder(int weight) { this.backSquat = weight;}

        public Builder benchPress(int weight) { benchPress = weight;    return this; }
        public Builder frontSquat(int weight) { frontSquat = weight;    return this; }

        public Lifts build() { return new Lifts(this); }

    }

    private Lifts(Builder builder) {
        this.backSquat = builder.backSquat;
        this.benchPress = builder.benchPress;
        this.frontSquat = builder.frontSquat;
    }
}

public class BasicBuilder {
    public static void main(String[] args) {

        Lifts luke = new Lifts.Builder(215).benchPress(135).frontSquat(175).build();

        //luke.frontSquat -> no access, only good for immutable classes
    }
}
