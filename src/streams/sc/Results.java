package streams.sc;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Lee N on 01, Mon,Jan,2024.
 */
public class Results {


    public static void main(String[] args) {

        Student s1 = new Student(111, "LeeN");
        Student s2 = new Student(112, "Steeve");
        Student s3 = new Student(112, "Jackie");
        Student s4 = new Student(114, "Unitas");
        Student s5 = new Student(115, "BossGirl");
        Student s6 = new Student(116, "Lady Baby");
        Student s7 = new Student(117, "Boy");
        Student s8 = new Student(118, "Leone");

        Unit unit1 = new Unit(7766, "Software Engineering");
        Unit unit2 = new Unit(7743, "Network Programming");
        Unit unit3 = new Unit(7745, "Internet Programming");
        Unit unit4 = new Unit(7746, "Foundation Mathematics");

        ArrayList<Test> tests = new ArrayList<>();

        tests.add(new Test(s1,unit1, TestType.CAT, 15,30, 234));
        tests.add(new Test(s1,unit1, TestType.CAT, 15, 40,26));
        tests.add(new Test(s1,unit1, TestType.MAIN_EXAM, 70, 70, 66));
        tests.add(new Test(s1,unit2, TestType.CAT, 15,30, 23));
        tests.add(new Test(s1,unit2, TestType.CAT, 15,30,23));
        tests.add(new Test(s1,unit2, TestType.MAIN_EXAM, 70, 70,45));

        tests.add(new Test(s2,unit1, TestType.CAT, 15,30, 17));
        tests.add(new Test(s2,unit1, TestType.CAT, 15, 40,26));
        tests.add(new Test(s2,unit1, TestType.MAIN_EXAM,  66));
        tests.add(new Test(s2,unit2, TestType.CAT, 15,30, 23));
        tests.add(new Test(s2,unit2, TestType.CAT, 15,30,23));
        tests.add(new Test(s2,unit2, TestType.MAIN_EXAM, 45));


        new Results().listResults(tests);
    }

    void listResults(ArrayList<Test> tests){
        Map<Student, Map<Unit, Integer>> catMarks = tests.stream()
//                .filter(test -> test.testType() == TestType.CAT)
                .collect(Collectors.groupingBy(Test::student,
                        Collectors.groupingBy(Test::unit,
                                Collectors.summingInt(Test::getCalculatedScore))));

        System.out.println(catMarks);

    }

    public void printResults(ArrayList<Test> tests){
        System.out.println(tests);
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
