package classDesign;

/**
 * Created by Lee N on 27, Wed,Dec,2023.
 */
abstract class Mammal1 {
    abstract CharSequence chew();
    public Mammal1() {
        System.out.println(chew());
    }
}
// Does this line compile?
public class Platypus2 extends Mammal1 {
    String chew() { return "yummy!"; }
    public static void main(String[] args) {
        new Platypus2();
    }
}