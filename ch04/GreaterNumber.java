/* Ex-4.21 GreaterNumber.java
 * recebe 10 inteiros e determina o maior */

import java.util.Scanner;

public class GreaterNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int counter;
        int number;
        int largest;

        for (counter = 0, largest = 0; counter < 10; counter++) {
            System.out.printf("[#%d] Enter number: ", counter+1);
            number = input.nextInt();
            if (largest < number) {
                largest = number;
            }
        }

        System.out.printf("Largest number: %d%n", largest);
    }
}
