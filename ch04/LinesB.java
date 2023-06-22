// Gex 4.2: LinesB.java
// Desenhando linhas que se estendem dos quatro cantos

import java.awt.Graphics; // desenhar textos e formas na tela
import javax.swing.JPanel; // area de desenho

public class LinesB extends JPanel
{
    // desenha um X a partir dos cantos do painel
    public void paintComponent(Graphics g)
    {
        // chama paintComponent para assegurar que o painel e exibido corretamente
        super.paintComponent(g);

        int width = getWidth(); // largura total
        int height = getHeight(); // altura total

        for (int i = 0; i < 250; i++) {
            if (i == 125) {
                g.drawLine(0, 0, width / 2, height / 2); // superior esquerdo
                g.drawLine(width, 0, width / 2, height / 2); // superior direito
                g.drawLine(0, height, width / 2, height / 2); // inferior esquerdo
                g.drawLine(width, height, width / 2, height / 2); // inferior direito
            }else if (i % 15 == 0) {
                g.drawLine(0, 0, width / 2 + i, height / 2 - i);   
                g.drawLine(0, 0, width / 2 - i, height / 2 + i);
                g.drawLine(width, 0, width / 2 - i, height / 2 - i);   
                g.drawLine(width, 0, width / 2 + i, height / 2 + i);
                g.drawLine(0, height, width / 2 - i, height / 2 - i);   
                g.drawLine(0, height, width / 2 + i, height / 2 + i);
                g.drawLine(width, height, width / 2 + i, height / 2 - i);   
                g.drawLine(width, height, width / 2 - i, height / 2 + i);
            }
        }
    }
} // fim da classe LinesB
