import problems.Employees;
import problems.PopularScores;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        PopularScores popularScores = new PopularScores();

        int[] array = new int[]{8, 7, 2, 6, 2, 7, 1, 3, 7, 6,
                8, 5, 4, 3, 6, 5, 1, 8, 5, 3, 5, 5, 5};

        Arrays.stream(popularScores.popScores(array, 5)).forEach(System.out::println);
        System.out.println("++++++++++++++");

        Employees employees = new Employees();

        String s = "(“John”, (“Jasmine”, (“Jay”), (“Unavailable”)), (“Unavailable”, (“Jack”, (“Jeremy”))), (“Johanna”))";

        System.out.println(s);

        System.out.println(
                employees.removeUnavailable(s)
        );


    }
}
