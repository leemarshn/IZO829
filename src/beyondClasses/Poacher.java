package beyondClasses;

/**
 * Created by Lee N on 28, Thu,Dec,2023.
 */
public class Poacher{
    public void badActor() {
        var mother = new Crane(5, "Cathy");
        mother.numberEggs = -100;
        System.out.println(mother.numberEggs);
    }

    public static void main(String[] args) {
        new Poacher().badActor();
    }
}
