/* Ex 4.17: FuelMileage.java 
 * Calcula e exibe o consumo de combustível */

import java.util.Scanner;

public class FuelMileage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int kilometersDriven;
        int litersOfGas;
        int totalKilometers = 0;
        int totalSumOfLiters = 0;
        double consumption;
        int i = 0;

        while (i < 5) {
            System.out.print("Enter kilometers driven: ");
            kilometersDriven = input.nextInt();
            System.out.print("Enter liters of gas: ");
            litersOfGas = input.nextInt();

            totalKilometers += kilometersDriven;
            totalSumOfLiters += litersOfGas;

            consumption = (double) kilometersDriven / litersOfGas;

            System.out.printf("Consumption #%d: = %.2f%n", i+1, consumption);
            i++;
        }

        System.out.printf("total kilometers = %d%n", totalKilometers);
        System.out.printf("total sum of liters = %d%n", totalSumOfLiters);
    }
}
