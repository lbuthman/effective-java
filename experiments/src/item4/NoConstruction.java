package item4;

/**
 * Created by lbuthman on 5/27/17.
 * This class can only be used statically and by using this idiom, clears any confusion
 * about the use. There is no way to instantiate it, intentionally or accidentally.
 */
public class NoConstruction {

    //suppress default constructor for non-instantiability
    private NoConstruction() {
        throw new AssertionError();
    }

    public static String replaceVowel(String s, String c) {

        return s.replaceAll("[aeiouy]+", c);
    }

    public static void main(String[] args) {
        String luke = "luke";
        String phrase = "My name is Bingo. I like to climb things.";

        System.out.println(NoConstruction.replaceVowel(luke, "a"));
        System.out.println(NoConstruction.replaceVowel(phrase, "o"));
    }
}
