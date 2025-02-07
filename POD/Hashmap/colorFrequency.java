package POD.Hashmap;
import java.util.HashMap;
public class colorFrequency {
   


    public static void main(String[] args) {
        // Create a HashMap to store the frequency of each color
        HashMap<Integer, Integer> colorFrequency = new HashMap<>();
        
        // Sample array of colors (each color is an integer)
        int[] colors = {3, 5, 3, 7, 5, 3, 9};

        // Loop through each color in the array
        for (int color : colors) {
            // Get current frequency, default to 0 if not found
            int currentFrequency = colorFrequency.getOrDefault(color, 0);
            
            // Increment frequency
            int newFrequency = currentFrequency + 1;
            
            // Store the updated frequency in the HashMap
            colorFrequency.put(color, newFrequency);
        }

        // Print the final frequency map
        System.out.println("Color Frequencies: " + colorFrequency);
    }
}

