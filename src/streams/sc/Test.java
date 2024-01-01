package streams.sc;

/**
 * Created by Lee N on 01, Mon,Jan,2024.
 */
public record Test(Student student, Unit unit, TestType testType, float testWeight, int testTotal, int score) {

    public Test(Student student, Unit unit, TestType testType, int score) {
        this(student, unit, testType,
                testType == TestType.CAT ? TestType.CAT.getMax_maxWeight() : TestType.MAIN_EXAM.getMax_maxWeight(),
                testType == TestType.CAT ? TestType.CAT.getMax_score() : TestType.MAIN_EXAM.getMax_score(),
                score);
    }

//    public Test(Student student, Unit unit, TestType testType, int score) {
//        int total;
//        int weight;
//        if (testType()==TestType.CAT){
//            total = TestType.CAT.getMax_score();
//            weight = TestType.CAT.getMax_maxWeight();
//        }else {
//            total = TestType.MAIN_EXAM.getMax_score();
//            weight = TestType.MAIN_EXAM.getMax_maxWeight();
//        }
//
//        this(student, unit, testType, weight , total, score);
//    }

    public int getCalculatedScore() {
        if (testType() == TestType.CAT) {
            float newScore = score * (testWeight/testTotal);
            if (newScore > 30)
                return 8888;
            return (int) Math.ceil(newScore);
        } else {
            if (score >70 || score < 1)
                return 9999;
            return score();
        }
    }
}
