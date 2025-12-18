import java.util.Scanner
/**
 * Problem-2: Generate a series of 'a' odd numbers based on input 'a'.
 * Example: if a = 4, output is 1, 3, 5, 7
 */
public class Problem2 {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer (a): ");
            // Reading the input integer 'a'
            int a = scanner.nextInt();
            
            // Generate and print the series
            generateOddSeries(a);
        } catch (Exception e) {
            System.out.println("Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    /**
     * Logic to generate the odd number series.
     * The nth odd number is calculated using the formula (2*i - 1).
     * @param a total number of terms to generate
     */
    public static void generateOddSeries(int a) {
        if (a <= 0) {
            System.out.println("Input must be a positive integer.");
            return;
        }

        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= a; i++) {
            // Calculate the odd number
            int oddNumber = (2 * i) - 1;
            
            output.append(oddNumber);
            
            // Add comma and space between numbers, but not after the last one
            if (i < a) {
                output.append(", ");
            }
        }

        // Final output display
        System.out.println(output.toString());
    }
}
