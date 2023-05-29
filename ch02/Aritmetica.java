/* Exe-2.15: Aritmetica.java */
/* Le 2 inteiroa e exibe o resultado da soma, diferenca, produto e quociente. */

import java.util.Scanner;

public class Aritmetica
{
				public static void main(String args[])
				{
								Scanner input = new Scanner(System.in);
								int number1;
								int number2;


								System.out.print("Enter first integer: ");
								number1 = input.nextInt();
								System.out.print("Enter second integer: ");
								number2 = input.nextInt();

								System.out.printf(
												"%d + %d = %d\n%d - %d = %d\n%d x %d = %d\n%d / %d = %d\n",
												number1, number2, number1 + number2,
												number1, number2, number1 - number2,
												number1, number2, number1 * number2,
												number1, number2, number1 / number2);
				}
}
