package beyondClasses;

/**
 * Created by Lee N on 28, Thu,Dec,2023.
 */
class Marsupial {
    protected int age = 2;
    public  boolean isBiped() {
        return false;
    } }
public class Kangaroo extends Marsupial {
    protected int age = 6;
    public  boolean isBiped() {
        return true;
    }
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        Marsupial moey = joey;
        System.out.println(joey.isBiped());
        System.out.println(moey.isBiped());
        System.out.println(joey.age);
        System.out.println(moey.age);
    } }