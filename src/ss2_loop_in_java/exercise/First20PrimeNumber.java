package ss2_loop_in_java.exercise;

public class First20PrimeNumber {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int N = 2;
        while (count <= number) {
            int i = 0;
            for (int j = 2; j < N; j++) {
                if (N % j == 0) {
                    i = i + 1;
                }
            }
            if (i == 0) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
