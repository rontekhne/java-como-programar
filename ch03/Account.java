/* Fig 3.1: Account.java
 * Classe Account que contem variaveis de instancia
 * e metodos para configurar e obter seu valor. */

public class Account
{
    private String name; // variavel de instancia
    private double balance; // variaveld e instancia

    // construtor
    public Account(String name, double balance)
    {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    // metodo que deposita apenas uma quantia valida
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }       

    // retorna o saldo da conta
    public double getBalance()
    {
        return balance;
    }

    // metodo para definir o nome do objeto
    public void setName(String name)
    {
        this.name = name; // armazena o nome
    }

    // metodo para recuperar o nome do objeto
    public String getName()
    {
        return name; // retorna valor do nome para o chamador
    }

    public static void displayAccount(Account accountToDisplay)
    {
        System.out.printf("%s balance: $%.2f%n", 
                accountToDisplay.getName(), 
                accountToDisplay.getBalance());
    }
} // fim da classe Account
