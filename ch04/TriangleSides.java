/* 4.35: TriangleSides.java
 * Verifica se três numeros formam os lados de um triangulo
 * utilizando a desigualdade triangular */

import java.util.Scanner;

public class TriangleSides
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sideA, sideB, sideC;
        boolean isTriangle = false;

        System.out.print("Enter side A: ");
        sideA = input.nextInt();
        System.out.print("Enter side B: ");
        sideB = input.nextInt();
        System.out.print("Enter side C: ");
        sideC = input.nextInt();

        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if (((sideA + sideB) > sideC) && ((sideA + sideC) > sideB) && ((sideB + sideC) > sideA)) {
                isTriangle = true;
            }
        }

        if (isTriangle) {
            System.out.println("Is Triangle");
        }else {
            System.out.println("Not Triangle");
        }
    }
}
