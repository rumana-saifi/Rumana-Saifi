import java.util.Scanner;

/**
 * Problem-3: Generate a series of odd numbers.
 * If input 'a' is even, it generates series for (a-1).
 * If input 'a' is odd, it generates series for 'a'.
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer (a): ");
            int a = scanner.nextInt();
            
            generateSeries(a);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }

    public static void generateSeries(int a) {
        if (a <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Logic: If 'a' is even, we reduce the count by 1 to match the pattern
        int n = (a % 2 == 0) ? (a - 1) : a;

        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            // Formula for odd numbers: 2 * i - 1
            int oddNumber = (2 * i) - 1;
            
            output.append(oddNumber);
            
            if (i < n) {
                output.append(", ");
            }
        }

        System.out.println(output.toString());
    }
}
