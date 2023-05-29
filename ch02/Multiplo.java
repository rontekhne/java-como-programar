/* Exe-2.26: Multiplo.java
 * programa le dois inteiros e determina
 * se o primeiro e multiplo do segundo */

import java.util.Scanner;

public class Multiplo
{
				public static void main(String args[])
				{
								Scanner input = new Scanner(System.in);
								int n1, n2;

								System.out.print("Enter 1st integer: ");
								n1 = input.nextInt();
								System.out.print("Enter 2nd integer: ");
								n2 = input.nextInt();

								if (n1 % n2 == 0) {
												System.out.println("The 1st is multiple of the 2nd integer.");
								}else {
												System.out.println("The 1st is NOT multiple of the 2nd integer.");
								}
				}
}
