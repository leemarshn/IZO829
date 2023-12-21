package classDesign;

/**
 * Created by Lee N on 21, Thu,Dec,2023.
 */
public class BirdSeed {
    private int numberBags;
    private int cats;
    boolean call;
    public BirdSeed() {
        //this(2);
        call = false;
        new BirdSeed(2);

    }
    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }
    public static void main(String[] args) {
        var seed = new BirdSeed();
        System.out.print(seed.numberBags);
    }
}
