// Gex 4.4: LinesDTest.java
// Criando JFrame para exibir lines

import javax.swing.JFrame;

public class LinesDTest
{
    public static void main(String[] args)
    {
        // cria um painel que contem nosso desenho
        LinesD ld = new LinesD();

        // cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        // configura o frame para ser encerrado quando ele e fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(ld); // adiciona o painel ao frame
        application.setSize(250, 250); // configura o tamanho do frame
        application.setVisible(true); // torna o frame visivel
    }
}
