package beyondClasses;

/**
 * Created by Lee N on 28, Thu,Dec,2023.
 */
public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b) {
        System.out.print("constructing,");
    }
}
