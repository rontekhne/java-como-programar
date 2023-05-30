/* Exe-2.28: DCA.java
 * Le um inteiro como raio e calcula o 
 * diamentro, circunferencia e raio de 
 * um circulo */

import java.util.Scanner;

public class DCA
{
				public static void main(String args[])
				{
								Scanner input = new Scanner(System.in);
								int radius;

								System.out.print("Enter the radius (integer): ");
								radius = input.nextInt();

								System.out.printf("Diameter: %f\n",  2 * radius);
								System.out.printf("Circunference: %f\n", 2 * Math.PI * radius);
								System.out.printf("Area: %f\n", (Math.PI * (radius * radius)));
				}
}
