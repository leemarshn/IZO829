package classDesign;

/**
 * Created by Lee N on 21, Thu,Dec,2023.
 */
public class Speedster {
    int numSpots;
}
class Cheetah extends Speedster {
    int numSpots;
    public Cheetah(int numSpots) {
// INSERT CODE HERE
        super.numSpots = numSpots;
    }

    public static void main(String[] args) {
        Speedster s = new Cheetah(50);
        System.out.print(s.numSpots);
    }
}