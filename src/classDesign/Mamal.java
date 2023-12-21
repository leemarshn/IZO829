package classDesign;

/**
 * Created by Lee N on 21, Thu,Dec,2023.
 */
public class Mamal {
    private void sneeze() {}
    public Mamal(int age) {
        System.out.print("Mammal");
    }
}
class Platypus extends Mamal {
    int sneeze() { return 1; }
    public Platypus() {
        super(5);
        System.out.print("Platypus");
    }
    public static void main(String[] args) {
        new Mamal(5);
    }
}
