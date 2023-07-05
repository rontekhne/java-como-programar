/* Ex 4.29: AsteriskSquare.java */
/* Desenha um quadrado de asterisco de lado 1 a 7 */

import java.util.Scanner;

public class AsteriskSquare
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size;

        do {
            System.out.print("Enter the size of the square (1-20): ");
            size = input.nextInt();
        } while (size < 1 || size > 20);

        printSquare(size);
    }

    static void printSquare(int size)
    {
        int i, j;

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    if (i == 0 || i == size - 1) {
                        if (j == 0) {
                            System.out.print("**");
                        }else if (j == size - 1) {
                            System.out.print(" ");
                        }else {
                            System.out.print(" *");
                        }
                    }else {
                        System.out.print("*");
                    }
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
