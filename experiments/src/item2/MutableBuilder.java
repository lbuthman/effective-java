package item2;

/**
 * Created by lbuthman on 5/26/17.
 */

class Mind {
    public boolean considering;
    public String topic;
    public String stance;
    public String[] influences;
    public String[] pros;
    public String[] cons;

    public static class Builder {

        public boolean considering;
        public String topic;
        public String stance;
        public String[] influences;
        public String[] pros;
        public String[] cons;

        public Builder(boolean consider, String topic) {
            this.considering = consider;
            this.topic = topic;
        }

        public Builder stance(String s) {stance = s;   return this;}
        public Builder influence(String[] s) {
            influences = s;  return this;}
        public Builder pros(String[] s) {pros = s;  return this;}
        public Builder cons(String[] s) {cons = s;  return this;}

        public Mind build() {return new Mind(this);}
    }

    private Mind(Builder builder) {
        this.considering = builder.considering;
        this.topic = builder.topic;
        this.stance = builder.stance;
        this.influences = builder.influences;
        this.pros = builder.pros;
        this.cons = builder.cons;
    }
}

public class MutableBuilder {
    public static void main(String[] args) {
        String[] influences = {"current weight", "hunger", "comfort", "energy level"};
        String[] pros = {"tasty", "yum chocolate", "satisfy craving"};
        String[] cons = {"extra calories", "gain weight", "violate eating plan"};
        Mind mind = new Mind.Builder(true, "whether or not to have another cookie").stance(
                "in formation").influence(influences).pros(pros).cons(cons).build();

        //count to 10 and consider
        int c = 1;
        while (c < 11) {
            System.out.println("(breath " + c + ") <still considering>");
            c++;
        }
        mind.considering = false;
        mind.stance = "eat that cookie!";
        System.out.println("Still thinking? ~~ " + mind.considering);
        if (!mind.considering) {
            System.out.println("What have you decided about " + mind.topic + " ~~~ " + mind.stance);
        }
    }
}
