/* Exe-2.33: Imc.java 
 * Calculadora Imc */

import java.util.Scanner;

public class Imc 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
				double h, w, res;

				System.out.print("Enter your height: ");
				h = input.nextDouble();
				System.out.print("Enter your weight: ");
				w = input.nextDouble();

				res = w / (h * h);

				if (res < 18.5) {
								System.out.println("Under weight.");
				}else if (res < 24.9) { 
								System.out.println("Normal weight.");
				}else if (res < 29.9) {
								System.out.println("Pre obesity.");
				}else if (res < 34.9) {
								System.out.println("Obesity degree 1.");
				}else if (res < 39.9) {
								System.out.println("Obesity degree 2.");
				}else {
								System.out.println("Morbid obesity.");
				}

    }
}


/* IMC = Peso ÷ (Altura × Altura)
Exemplo de como calcular o IMC:
IMC = 80 kg ÷ (1,80 m × 1,80 m) = 24,69 kg/m2 (Peso ideal)
Tabela:
Menor que 18.5 - Abaixo do peso ;
Entre 18.5 e 24.9 - Peso normal ;
Entre 25.0 e 29.9 - Pré-obesidade ; 
Entre 30.0 e 34.9 - Obesidade Grau 1 ; 
Entre 35.0 e 39.9 - Obesidade Grau 2 ; 
Acima de 40 - Obesidade Grau 3.
fonte: OMS ( Organização Mundial da Saúde )
*/
