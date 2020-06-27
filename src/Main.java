import problems.PopularScores;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        PopularScores popularScores = new PopularScores();

        Arrays.stream(popularScores.popScores(new int[]{8, 7, 2, 6, 2, 7, 1, 3, 7, 6,
                8, 5, 4, 3, 6, 5, 1, 8, 5, 3, 5, 5, 5}, 5)).forEach(System.out::println);

    }
}
