/* Ex-4.19 SalesComission.java *
 * Calcula comissao de vendas para vendedores */

/* o pessoal de vendas recebe 200 por semana mais 9% 
 * de suas vendas brutas durante esse periodo. O aplicativo
 * recebe uma lista de itens com seus valores e calcula
 * a comissao do vendedor */

import java.util.Scanner;

public class SalesComission
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String itemName;
        double itemValue;
        double sumOfItens = 0.0;
        double percentOfSales; // 9%
        int i = 1;

        while (true) {
            System.out.printf("Enter item #%d name or 'q' to quit: ", i);
            itemName = input.next();
            if (itemName.equals("q")) {
                break;
            }
            System.out.printf("Enter item #%d value: ", i);
            itemValue = input.nextDouble();
            sumOfItens += itemValue;
            i++;
        }
        percentOfSales = sumOfItens * 9 / 100;
        System.out.printf("Sales Comission = %.2f%n", 200 + percentOfSales);
    }
}
