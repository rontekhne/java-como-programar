/* Ex-4.23 TwoGreaterNumbers.java
 * encontra os dois maiores números */

import java.util.Scanner;

public class TwoGreaterNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int counter;
        int number;
        int largest1 = 0;
        int largest2 = 0;

        for (counter = 0; counter < 10; counter++) {
            System.out.printf("[#%d] Enter number: ", counter+1);
            number = input.nextInt();
           
            if (number > largest1) {
                largest2 = largest1;
                largest1 = number;
            }else if (number > largest2 && number != largest1) {
                largest2 = number;
            }
        }

        System.out.printf("1st Largest number: %d%n", largest1);
        System.out.printf("2nd Largest number: %d%n", largest2);
    }
}
