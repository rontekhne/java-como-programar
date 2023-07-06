/* Ex. 4.31: BinToDec.java
 * Conversor binário para decimal */

import java.util.Scanner;

public class BinToDec
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int binaryNumber = 0;
        int decimalNumber = 0;
        int binaryDigit = 0;
        int decimalDigit = 0;
        int decimalPower = 0;
        int power = 0;

        System.out.print("Enter a binary number (0s and 1s): ");
        binaryNumber = input.nextInt();

        // enquanto binaryNumber for maior que zero
        while (binaryNumber > 0) {
            // pegar o lsb do binaryNumber e armazenar em binaryDigit (modulo 10)
            binaryDigit = binaryNumber % 10;
            // amrzenar em decimalDigit o  binaryDigit * 2 elevado ao valor de power (0, 1, 2, 3, 4, 5...)
            decimalDigit = binaryDigit * (int) (Math.pow(2, power));
            // somar decimalDigit a decimalNumber
            decimalNumber += decimalDigit;
            // retirar o lsb do binaryNumber (dividir por 10)
            binaryNumber /= 10;
            // incrementar power
            power++;
        }

        System.out.printf("Decimal = %d%n", decimalNumber);
    }
}
