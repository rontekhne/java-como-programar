/* Exe-2.24: InteirosMaioresMenores.java
 * Programa le 5 inteiros e determina o maior
 * e o menor entre eles */

import java.util.Scanner;

public class InteirosMaioresMenores
{
				public static void main(String args[])
				{
								int n1;
								int n2;
								int n3;
								int n4;
								int n5;
								int lesser = 0;
								int greater = 0;

								Scanner input = new Scanner(System.in);
								System.out.print("Enter 1st integer: ");
								n1 = input.nextInt();
								System.out.print("Enter 2nd integer: ");
								n2 = input.nextInt();
								System.out.print("Enter 3rd integer: ");
								n3 = input.nextInt();
								System.out.print("Enter 4th integer: ");
								n4 = input.nextInt();
								System.out.print("Enter 5th integer: ");
								n5 = input.nextInt();

								if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
												lesser = n1;
								}
								if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) {
												lesser = n2;
								}
								if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5) {
												lesser = n3;
								}
								if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5) {
												lesser = n4;
								}
								if (n5 < n1 && n5 < n2 && n5 < n3 && n5 < n4) {
												lesser = n5;
								}

								if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
												greater = n1;
								}
								if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
												greater = n2;
								}
								if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
												greater = n3;
								}
								if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
												greater = n4;
								}
								if (n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4) {
												greater = n5;
								}

								System.out.printf("Lesser = %d\nGreater = %d\n", lesser, greater);
				}
}
