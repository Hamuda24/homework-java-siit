package tema;

import java.util.Scanner;

public class Exercitiu4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number :");
            int n = sc.nextInt();

            int reversedInteger = 0, remainder, originalInteger;

            originalInteger = n;


            while (n != 0) {
                remainder = n % 10;
                reversedInteger = reversedInteger * 10 + remainder;
                n /= 10;
            }


            if (originalInteger == reversedInteger)
                System.out.println(originalInteger + " is a palindrome.");
            else
                System.out.println(originalInteger + " is not a palindrome.");
        }
    }

