/* Exe-2.25: ImparPar.java
 * Programa le um inteiro e determina se 
 * este e impar ou par */

import java.util.Scanner;

public class ImparPar
{
				public static void main(String args[])
				{
								Scanner input = new Scanner(System.in);
								int n;

								System.out.print("Enter an integer: ");
								n = input.nextInt();

								if (n % 2 == 0) {
												System.out.println("Par");
								}else {
												System.out.println("Impar");
								}
				}
}
