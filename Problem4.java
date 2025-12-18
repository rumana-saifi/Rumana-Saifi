import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Problem-4: Count multiples of numbers 1 through 9 
 * from a given input list.
 */
public class Problem4 {
    public static void main(String[] args) {
        // Example input array
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        
        // Dictionary (Map) to store the counts for numbers 1 to 9
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        
        // Initialize the map with keys 1 to 9 and count 0
        for (int i = 1; i <= 9; i++) {
            counts.put(i, 0);
        }
        
        // Process the input array
        for (int number : input) {
            // Check divisibility for each key in our map (1 to 9)
            for (int j = 1; j <= 9; j++) {
                if (number % j == 0) {
                    // If divisible, increment the count for that key
                    counts.put(j, counts.get(j) + 1);
                }
            }
        }
        
        // Print the final result in the required format
        System.out.println(counts);
    }
}
