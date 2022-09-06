package ss2_loop_in_java.exercise;

public class LessThan100PrimeNumber {
    public static void main(String[] args) {
        int number = 100;
//        int count = 0;
        int N = 2;
        while (N <= number) {
            int i = 0;
            for (int j = 2; j < N; j++) {
                if (N % j == 0) {
                    i = i + 1;
                }
            }
            if (i == 0) {
                System.out.println(N);
//                count++;
            }
            N++;
        }
    }
}
