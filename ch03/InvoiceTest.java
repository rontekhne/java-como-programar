/* Ex 3.12: InvoiceTest.java
 * Testa a classe Invoice */

import java.util.Scanner;

public class InvoiceTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Invoice invoice = new Invoice(
                "1", "Laptop", 1, 1300.99);

        System.out.printf(
                "Invoice\nnumber: %s\ndesc: %s\nqt: %d\nprice: %.2f\n", 
                invoice.getNumber(),
                invoice.getDescription(),
                invoice.getQuantity(),
                invoice.getPrice());

        System.out.print("Enter product number: ");
        invoice.setNumber(input.nextLine());
        System.out.print("Enter description: ");
        invoice.setDescription(input.nextLine());
        System.out.print("Enter quantity: ");
        invoice.setQuantity(input.nextInt());
        System.out.print("Enter price: ");
        invoice.setPrice(input.nextDouble());

         System.out.printf(
                "Invoice\nnumber: %s\ndesc: %s\nqt: %d\nprice: %.2f\n", 
                invoice.getNumber(),
                invoice.getDescription(),
                invoice.getQuantity(),
                invoice.getPrice());

         System.out.printf("Invoice amount: $%.2f\n", 
                 invoice.getInvoiceAmount(
                     invoice.getQuantity(),
                     invoice.getPrice()));
    }
}
