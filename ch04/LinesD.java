// Gex 4.4: LinesD.java
// Desenhando linhas que se estendem dos quatro cantos

import java.awt.Graphics; // desenhar textos e formas na tela
import javax.swing.JPanel; // area de desenho

public class LinesD extends JPanel
{
    // desenha um X a partir dos cantos do painel
    public void paintComponent(Graphics g)
    {
        // chama paintComponent para assegurar que o painel e exibido corretamente
        super.paintComponent(g);

        int width = getWidth(); // largura total
        int height = getHeight(); // altura total

        for (int i = 0; i <= width; i++) {
           if (i % 15 == 0) {
               g.drawLine(0, i, i, height); // inferior esquerdo
               g.drawLine(width - i, 0, 0, i); // superior esquerdo
               g.drawLine(width, height - i, width - i, 0); // superior direito
               g.drawLine(i, height, width, height - i); // inferior direito       
           }
        }
    }
} // fim da classe LinesB
