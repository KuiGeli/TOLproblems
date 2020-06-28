package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class PopularScores {

    /*
    The popScores method finds the most popular scores by saving it into a LinkedHashMap with the frequency as the value
    and the score as the key, then saving the scores with the highest frequency into an int array which is returned.
     */
    public int[] popScores(int[] list, int k) {

        Map<Integer, Integer> popScores = new LinkedHashMap<>();
        int[] mostPop = new int[k];

        for (int i : list) {
            if (popScores.containsKey(i)) {
                popScores.put(i, popScores.get(i) + 1);
            } else {
                popScores.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : popScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            mostPopLoop:
            {
                for (int i = 0; i < mostPop.length; i++) {
                    if (popScores.get(mostPop[i]) != null
                            && popScores.get(mostPop[i]) < entry.getValue()) {
                        if (i + 1 < k) {
                            for (int y = k - 1; y > i; y--) {
                                mostPop[y] = mostPop[y - 1];
                            }
                        }
                        mostPop[i] = entry.getKey();
                        break mostPopLoop;
                    } else if (popScores.get(mostPop[i]) == null) {
                        mostPop[i] = entry.getKey();
                        break mostPopLoop;
                    }
                }
            }
        }
        return mostPop;
    }
}
