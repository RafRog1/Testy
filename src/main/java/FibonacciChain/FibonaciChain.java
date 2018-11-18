package FibonacciChain;

import java.util.Scanner;

public class FibonaciChain {
    //Scanner scanner = new Scanner(System.in);

    int calculate(int n) {
        int b = 1;
        int c = 1;
        int d;
        if (n == 0) {
            return 0;
        } else if (n < 0){
            throw new LessThanZero();
        }else {
            for (int i = 0; i < n-2; i++) {
                d = c;
                c = c + b;
                b = d;
            }
            return c;
        }
    }
}
