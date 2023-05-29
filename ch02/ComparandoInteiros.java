/* Exe-2.16: ComparandoInteiros.java */
/* Compara dois inteiros e exibe qual e o maior ou se sao iguais. */

import java.util.Scanner;

public class ComparandoInteiros
{
				public static void main(String args[])
				{
								Scanner input = new Scanner(System.in);
								int number1;
								int number2;
								int greater;

								System.out.print("Enter first integer: ");
								number1 = input.nextInt();
								System.out.print("Enter second integer: ");
								number2 = input.nextInt();

								if (number1 > number2) {
												greater = number1;
								}else if (number2 > number1) {
												greater = number2;
								}else {
												greater = 0;
								}

								if (greater == 0) {
												System.out.println("These numbers are equal.");
								}else {
												System.out.printf("%d is larger.\n", greater);
								}
				}
}
