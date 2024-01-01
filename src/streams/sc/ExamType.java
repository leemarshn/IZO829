package streams.sc;

/**
 * Created by Lee N on 01, Mon,Jan,2024.
 */
public enum ExamType {
    CAT(40), SUPPLEMENTARY(40), MAIN_EXAM(70), SPECIAL_EXAM(70);
    private final int max_score;
    ExamType(int max){
        max_score = max;
    }
    int getMax_score(){
        return max_score;
    }
}
