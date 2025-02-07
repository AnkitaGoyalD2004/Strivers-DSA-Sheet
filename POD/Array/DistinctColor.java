package POD.Array;

import java.util.HashMap;

public class DistinctColor {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        HashMap<Integer, Integer> colorFrequency = new HashMap<>();
        HashMap<Integer, Integer> ballColors = new HashMap<>();
        int[] result = new int[n];
        int distinctColors = 0;

        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            // Increase frequency of the new color
            colorFrequency.put(color, colorFrequency.getOrDefault(color, 0) + 1);
            if (colorFrequency.get(color) == 1) {
                distinctColors++;
            }

            // If the ball was previously assigned a color, update its frequency
            if (ballColors.containsKey(ball)) {
                int prevColor = ballColors.get(ball);
                colorFrequency.put(prevColor, colorFrequency.get(prevColor) - 1);
                if (colorFrequency.get(prevColor) == 0) {
                    distinctColors--;
                }
            }

            // Assign new color to the ball
            ballColors.put(ball, color);

            // Store the number of distinct colors at this step
            result[i] = distinctColors;
        }
        return result;
    }
}
