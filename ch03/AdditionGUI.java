// Ex 3.1: AdditionGUI.java
// Programa de adicao que insere dois numeros, entao exibe a soma deles usando GUI
import javax.swing.JOptionPane;
import static java.lang.Integer.*;

public class AdditionGUI
{
    // metodo main inicia a execucao do aplicativo Java
	public static void main(String args[])
	{
	    String number1 = JOptionPane.showInputDialog("Enter first number");
        String number2 = JOptionPane.showInputDialog("Enter second number");
        int result = parseInt(number1) + parseInt(number2);

        String message = String.format("%s + %s = %d", number1, number2, result);
        JOptionPane.showMessageDialog(null, message);
    } // fim do metodo main
} // fim da classe AdditionGUI

