/* Exercicio 2.6: Product.java
/* programa calcula o produto de três inteiros */ 

import java.util.Scanner; 

public class Product
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); 
        int x, y, z, result; 

        System.out.print("Enter first integer: "); 
        x = input.nextInt(); 
        System.out.print("Enter second integer: "); 
        y = input.nextInt(); 
        System.out.print("Enter third integer: "); 
        z = input.nextInt(); 

        result = x * y * z; 
        System.out.printf("Product is %d\n", result); 
    }
}
