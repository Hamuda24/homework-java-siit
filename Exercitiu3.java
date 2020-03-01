package tema;

import java.util.Scanner;

public class Exercitiu3 {
    public static void main(String[] args) {

        int r, n, ld = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            if (ld < r) {
                ld = r;
            }
            n = n / 10;
        }

        System.out.println("\nThe Largest Digit is :" + ld);

    }
}

