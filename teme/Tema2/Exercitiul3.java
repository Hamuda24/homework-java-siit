package Tema2;

import java.util.Scanner;
import java.util.*;

public class Exercitiul3 {
    public static void main(String argu[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti Fraza: ");
        String str = scan.nextLine();

        int cnt = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.print(inp[j] + ", ");
                    cnt++;
                    break;
                }
            }
        }
    }
}

