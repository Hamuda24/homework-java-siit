package tema;

import java.util.Scanner;

public class Exercitiu7 {

    public static void main(String... args) {
        boolean run = true;

        while (run = true) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numerele: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Introduceti operatia: ");
        String operation = scanner.next();

            switch (operation) {
                case "+":
                    System.out.println("a+b= " + (a + b));
                    break;
                case "-":
                    System.out.println("a-b= " + (a - b));
                    break;

                case "*":
                    System.out.println("a*b= " + a * b);
                    break;

                case "/":
                    System.out.println("a/b= " + (a / b));
                    break;

                default:
                    System.out.println("Bad operation!!!");
            }
        }
    }
}

