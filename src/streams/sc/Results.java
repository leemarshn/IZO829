package streams.sc;

/**
 * Created by Lee N on 01, Mon,Jan,2024.
 */
public class Results {

    Results results = new Results();

    public void printResults(Score score){
        var studentID = score.student().id();
        var name = score.student().name();
        var grade = results.getGrade(score.score());
        var marks = score.score();

        System.out.println(studentID + ": " + name +  " Grade: " + grade + " - " + marks );

    }

    String getGrade(int score){
            if (score > 100 || score < 0) {
                return  "X";
            } else if (score >= 70) {
                return  "A";
            } else if (score >= 60) {
                return "B";
            } else if (score >= 50) {
                return "C";
            } else if (score >= 40) {
                return  "D";
            } else {
                return  "F";
            }
        }

}
