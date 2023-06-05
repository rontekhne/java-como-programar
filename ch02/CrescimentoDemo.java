/* Exe-2.34: CrescimentoDemo.java 
 * Recebe como entrada a populacao atual
 * e a taxa de crescimento demografico atual
 * e calcula o a populacao mundial estimada em
 * 1, 2, 3, 4, 5 anos no futuro */

/* calculo: populacao estimada = populacao atual * (1 + taxa de crescimento demografico / 100) ^ N, onde n é numero de anos no futuro */

/* 2023: populacao 8 bilhoes, taxa 1,1% */

import java.util.Scanner;

public class CrescimentoDemo 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
				long pop;
				double rate;
				long estimate;

				System.out.print("Enter total population: ");
				pop = input.nextLong();
				System.out.print("Enter growth rate: ");
				rate = input.nextDouble();
				
				for (int i = 1; i <= 5; i++) {
								estimate = (long) (pop * Math.pow((1 + rate / 100), i));
								System.out.printf("Estimated population for %d year(s): %d.\n", i, estimate);
				}
    }
}
