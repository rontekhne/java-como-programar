/* Ex-4.18 CreditLimit.java 
 * Calculador de limite de credito */

import java.util.Scanner;

public class CreditLimit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int accountNumber;
        int monthBalance;
        int totalItens;
        int totalCredits;
        int creditLimit;
        int newBalance;

        System.out.print("Enter accountNumber: ");
        accountNumber = input.nextInt();
        System.out.print("Enter beggining of month balance: ");
        monthBalance = input.nextInt();
        System.out.print("Enter total itens charged to the customer in the month: ");
        totalItens = input.nextInt();
        System.out.print("Enter total credits applied to the customer in the month: ");
        totalCredits = input.nextInt();
        System.out.print("Enter credit limit: ");
        creditLimit = input.nextInt();

        newBalance = monthBalance + totalItens - totalCredits;
        
        System.out.printf("New balance = %d%n", newBalance);
        if (newBalance > creditLimit) {
            int remainingCredit = creditLimit - newBalance; 
            System.out.println("Credit limit exceeded.");
            System.out.printf("Available credit: %d%n", remainingCredit);
        }
    }
}
