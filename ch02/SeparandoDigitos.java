/* Exe-2.30: SeparandoDigitos.java 
 * Separa os digitos de um inteiro com
 * um espaco em branco */

import java.util.Scanner;

public class SeparandoDigitos 
{
    public static void main(String[] args) 
		{
						Scanner input = new Scanner(System.in);
						int n;

						System.out.print("Enter an integer: ");
						n = input.nextInt();

						if(n == 0) {
										System.out.println("0");
						}else {
										if(n < 0) {
														n = -n;
														System.out.print("- ");
										}

										int reversed = 0;

										while(n != 0) {
														int digit = n % 10;
														reversed = reversed * 10 + digit;
														n /= 10;
										}

										while(reversed != 0) {
														int digit = reversed % 10;
														System.out.printf("%d ", digit);
														reversed /= 10;
										}
						}
						System.out.println();
		}
}
