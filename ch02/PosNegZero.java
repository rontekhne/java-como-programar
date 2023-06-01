/* Exe-2.32: PosNegZero.java 
 * Le cinco inteiros e indica se e 
 * positivo, negativo ou zero */

import java.util.Scanner;

public class PosNegZero 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
				int n;

				for (int i = 0; i < 5; i++) {
								System.out.printf("Enter the %do number: ", i+1);
								n = input.nextInt();
								if (n < 0) {
												System.out.printf("%d is Negative.\n", n);
								}else if (n > 0) {
												System.out.printf("%d is Positive.\n", n);
								}else {
												System.out.printf("%d is Zero.\n", n);
								}
				}
    }
}
