import java.util.*;

public class Question3i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long budget = sc.nextLong();

        int[] scholarship = new int[n];

        for (int i = 0; i < n; i++) {
            scholarship[i] = sc.nextInt();
        }

        // Sort in increasing order
        Arrays.sort(scholarship);

        int count = 0;

        // Select students with minimum requirements first
        for (int amount : scholarship) {
            if (budget >= amount) {
                budget -= amount;
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
