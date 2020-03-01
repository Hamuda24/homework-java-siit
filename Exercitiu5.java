package tema;

import java.util.Scanner;

public class Exercitiu5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int num = 0;
        StringBuilder primeNumbers = new StringBuilder();
        System.out.println("Enter your number:");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers.append(i).append(" ");
            }
        }
        System.out.println("Prime numbers from 1 to " + n  + " are :");
        System.out.println(primeNumbers);
    }
}

