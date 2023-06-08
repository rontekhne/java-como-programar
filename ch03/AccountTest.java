/* Fig 3.2: AccountTest.java 
 * Cria e manipula um objeto Account */

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        // cria um objeto Scanner para obter a entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // cria dois objetos Account e os atribui a account1 e account2
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // exibe o valor inicial de cada objeto
        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());

        
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble(); 
        // String theName = input.nextLine(); // le uma linha de texto
        //myAccount.setName(theName); // insere theName em myAccount
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo de account1
        //System.out.println(); // gera saida de uma linha em branco
        
        // exibe os saldos
        //System.out.printf("Name in object myAccount is: %n%s%n",
        //        myAccount.getName());
        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble(); 
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // adiciona o saldo de account1
        
        // exibe os saldos
        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());

    }
} // fim da classe AccountTest
