import java.util.Scanner;

public class Reverse_N_Number {
    public static void Reverse(int i) {
        if (i <= 0) {
            return;
        }
        System.out.print(i + " ");
        Reverse(i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Reverse(n);
        sc.close();
    }
}
