package Tema2;

public class Exercitiul2 {
    static void printFibonacciNumbers(int n)
    {
        int f1 = 0;
        int f2 = 1;
        int i;
        if (n < 1)
            return;
        for (i = 1; i <= n; i++)
        {
            System.out.print(f2+" ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
    public static void main(String[] args)
    {
        printFibonacciNumbers(25);
    }
}

