/* Ex 3.11: Account2.java
 * Classe Account que contem variaveis de instancia
 * e metodos para configurar e obter seu valor. Modificada
 * para implementar withdraw ou retirada de saldo. */

public class Account2
{
    private String name; // variavel de instancia
    private double balance; // variaveld e instancia

    // construtor
    public Account2(String name, double balance)
    {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    // metodo que implementa debito
    public void withdraw(double withdrawAmount)
    {
        if (balance - withdrawAmount < 0.0) {
            System.out.println("Withdraw amount exceeded account balance.");
        }else {
            balance = balance - withdrawAmount;
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
} // fim da classe Account2
