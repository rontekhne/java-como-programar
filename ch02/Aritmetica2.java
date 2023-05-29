/* Exe-2.17: Aritmetica2.java */
/* Le 3 inteiros e exibe o resultado da soma, media, produto, menor e maior */

import java.util.Scanner;

public class Aritmetica2
{
				public static void main(String args[])
				{
								Scanner input = new Scanner(System.in);
								int number1;
								int number2;
								int number3;
								int greater;
								int lesser;

								System.out.print("Enter first integer: ");
								number1 = input.nextInt();
								System.out.print("Enter second integer: ");
								number2 = input.nextInt();
								System.out.print("Enter third integer: ");
								number3 = input.nextInt();

								if (number1 > number2 && number1 > number3) {
												greater = number1;
												if (number2 < number3) {
																lesser = number2;
												}else {
																lesser = number3;
												}
								}else if (number2 > number1 && number2 > number3) {
												greater = number2;
												if (number1 < number3) {
																lesser = number1;
												}else {
																lesser = number3;
												}
								}else {
												greater = number3;
												if (number1 < number2) {
																lesser = number1;
												}else {
																lesser = number2;
												}
								}
								System.out.printf(
												"Sum = %d\nAverage = %d\nProduct = %d\nGreater = %d\nLesser = %d\n",

												number1 + number2 + number3,
												(number1 + number2 + number3) / 3,
												number1 * number2 * number3,
												greater, lesser);
				}
}
