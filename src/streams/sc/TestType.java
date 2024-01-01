package streams.sc;

/**
 * Created by Lee N on 01, Mon,Jan,2024.
 */
public enum TestType {
    CAT(30,30), SUPPLEMENTARY(40, 40), MAIN_EXAM(70,70), SPECIAL_EXAM(70,70);
    private final int max_score;
   private final int maxWeight;
    TestType(int max, int weight){
        max_score = max;
        maxWeight = weight;
    }
    int getMax_score(){
        return max_score;
    }

    int getMax_maxWeight(){
        return maxWeight;
    }
}
