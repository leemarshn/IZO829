package beyondClasses;

/**
 * Created by Lee N on 28, Thu,Dec,2023.
 */
public class Poacher2 {
    public void badActor() {
        var mother = new Crane2(-100, "Cathy");
        System.out.println(mother.getNumberEggs());
    }

    public static void main(String[] args) {
        new Poacher2().badActor();
    }
}
