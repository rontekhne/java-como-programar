// Figura 4.18: DrawPanel.java
// Utilizando DrawLine para conectar os cantos de um painel

import java.awt.Graphics; // desenhar textos e formas na tela
import javax.swing.JPanel; // area de desenho

public class DrawPanel extends JPanel
{
    // desenha um X a partir dos cantos do painel
    public void paintComponent(Graphics g)
    {
        // chama paintComponent para assegurar que o painel e exibido corretamente
        super.paintComponent(g);

        int width = getWidth(); // largura total
        int height = getHeight(); // altura total


        // desenha uma linha a partir do canto superior esquerdo ate o inferior direito
        g.drawLine(0, 0, width, height);

        // desenha uma linha a partir do canto inferior esquerdo ate o superior direito
        g.drawLine(0, height, width, 0);
    }
} // fim da classe DrawPanel
