// Ex 4.24: AnalysisImproved.java
// Analise dos resultados do exame utilizando instrucoes de controle aninhadas
// com validacao de entrada

import java.util.Scanner;

public class AnalysisImproved
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1 || result == 2) {
                if (result == 1) {
                    passes = passes + 1;
                }else {
                    failures = failures + 1;
                }

                studentCounter = studentCounter + 1;
            }else {
                System.out.println("Enter a correct value (1 = pass, 2 = fail)!");
            }
        }

        System.out.printf("Passed %d%nFailed: %d%n", passes, failures);

        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}   
