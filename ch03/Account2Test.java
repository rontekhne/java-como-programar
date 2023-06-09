/* Ex 3.11: Account2Test.java 
 * Cria e manipula objetos Account2 */

import java.util.Scanner;

public class Account2Test
{
    public static void main(String[] args)
    {
        // cria um objeto Scanner para obter a entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // cria dois objetos Account e os atribui a account1 e account2
        Account2 account1 = new Account2("Jane Green", 50.00);
        Account2 account2 = new Account2("John Blue", -7.53);

        // exibe o valor inicial de cada objeto
        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());

        
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble(); 
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo de account1
        
        // exibe os saldos
        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble(); 
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // adiciona o saldo de account1
        
        // exibe os saldos
        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());
        
        // le o valor a ser debitado de account1 e imprime o saldo na tela
        System.out.print("Enter withdraw amount for account1: ");
        double withdrawAmount = input.nextDouble(); 
        account1.withdraw(withdrawAmount); // debita
        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
    }
} // fim da classe Account2Test
