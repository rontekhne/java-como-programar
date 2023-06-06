/* Ex-2.35: FaixaSolidaria.java 
 * Programa calcula o custo de dirigir */

import java.util.Scanner;

public class FaixaSolidaria 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
				int kmDay; // km dirigidos por dia
				double gasPrice; // preco por litro da gasolina
				int kmLiter; // km medio por litro
				double park; // taxa de estacionamento por dia
				double toll; // pedagio por dia
				double total;

				System.out.print("Km per day: ");
				kmDay = input.nextInt();
				System.out.print("Gas price per liter: ");
				gasPrice = input.nextDouble();
				System.out.print("Average km per liter:");
				kmLiter = input.nextInt();
				System.out.print("Parking per day: ");
				park = input.nextDouble();
				System.out.print("Toll per day: ");
				toll = input.nextDouble();

				total = (kmDay / kmLiter) * gasPrice;
				total += park + toll;

				System.out.printf("Total cost of driving: $%.2f\n", total);
    }
}
