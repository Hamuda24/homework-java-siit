package tema;

import java.util.Scanner;

public class Exercitiu6 {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numerele: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Introduceti operatia: ");
        String operation = scanner.next();

                    if (operation.equals("+")){System.out.println(a + b);}

                  if (operation.equals("-")){System.out.println(a - b);}

               if (operation.equals("/")){System.out.println(a / b);}

                if (operation.equals("*")){System.out.println(a * b);}

                  else  System.out.println("Bad operation!!!");
    }}
