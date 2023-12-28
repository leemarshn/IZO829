package beyondClasses;

/**
 * Created by Lee N on 28, Thu,Dec,2023.
 */
public record CompactCrane(int numberEggs, String name) {
    public CompactCrane{
        if (numberEggs < 0 ) throw new  IllegalArgumentException();
        name = name.toUpperCase();
    }
}
