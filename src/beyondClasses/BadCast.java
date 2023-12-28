package beyondClasses;

/**
 * Created by Lee N on 28, Thu,Dec,2023.
 */
interface Canine {}
interface Dog {}
class Wolf2 implements Dog {}
public class BadCast {
    public static void main(String[] args) {
        Wolf2 wolfy = new Wolf2();
        Dog badWolf = (Dog)wolfy;
    }
}