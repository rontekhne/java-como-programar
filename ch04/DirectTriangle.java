/* 4.35: DirectTriangle.java
 * Determina se eh trianglu retangulo ou right triangle */

import java.util.Scanner;

public class DirectTriangle
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side A: ");
        double sideA = input.nextDouble();

        System.out.print("Enter side  B: ");
        double sideB = input.nextDouble();

        System.out.print("Enter side  C: ");
        double sideC = input.nextDouble();

        // Verifica se é um triângulo retângulo
        boolean isRightTriangle = isRightTriangle(sideA, sideB, sideC);
        if (isRightTriangle) {
            System.out.println("Is right triangle.");
        } else {
            System.out.println("Not right triangle.");
        }
    }

    // Verifica se é um triângulo retângulo
    public static boolean isRightTriangle(double sideA, double sideB, double sideC) {
        double a = Math.pow(sideA, 2);
        double b = Math.pow(sideB, 2);
        double c = Math.pow(sideC, 2);

        return a == b + c || b == a + c || c == a + b;
    }
}
