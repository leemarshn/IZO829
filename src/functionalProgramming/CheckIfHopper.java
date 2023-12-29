package functionalProgramming;

/**
 * Created by Lee N on 29, Fri,Dec,2023.
 */
public class CheckIfHopper implements CheckTrait {

    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}
