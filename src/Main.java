import java.util.Scanner;

public class Main {
    public static int mincoins(int coins[], int len, int amount) {
        if (amount == 0) {
            return 0;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (coins[i] <= amount) {
                int sub_result = mincoins(coins, len, amount - coins[i]);
                if (sub_result != Integer.MAX_VALUE && sub_result + 1 < result) {
                    result = sub_result + 1;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        System.out.println("Enter coins");
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter amt: ");
        int amt = scanner.nextInt();
        System.out.println(mincoins(A, n,amt));
}
}