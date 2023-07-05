/* Ex 4.30: Palindrome.java 
 * Tem como entrada um inteiro de 5 digitos e determina
 * se este e um palindromo. Ha validacao de entrada. */

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a five digits integer: ");
            n = input.nextInt();
        }while (!isFiveDigitsInt(n));

        if (isPal(n)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("NOT Palindrome");
        }
    }


    static boolean isFiveDigitsInt(int n)
    {
        int counter = 0;

        while (n > 0) {
            n /= 10;
            counter++;
        }

        if (counter == 5) {
            return true;
        }else {
            return false;
        }
    }

    static boolean isPal(int n)
    {
        int d1, d2, d3, d4, d5;

        d1 = n / 10000;
        d2 = (n / 1000) % 10;
        d3 = (n / 100) % 10;
        d4 = (n / 10) % 10;
        d5 = n % 10;

        if (d1 == d5 && d2 == d4) {
            return true;
        }else {
            return false;
        }
    }
}
