import java.util.*;

public class Question3ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] points = new int[n];

        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(points[0]);
            return;
        }

        // dp[i] = maximum points possible up to index i
        long[] dp = new long[n];

        dp[0] = points[0];
        dp[1] = Math.max(points[0], points[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(
                dp[i - 1],              // Don't select current topic
                dp[i - 2] + points[i]  // Select current topic
            );
        }

        System.out.println(dp[n - 1]);

        sc.close();
    }
}