// Gex 4.1: LinesA.java
// Desenhando linhas que se estendem do canto superior

import java.awt.Graphics; // desenhar textos e formas na tela
import javax.swing.JPanel; // area de desenho

public class LinesA extends JPanel
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
                g.drawLine(0, 0, width / 2, height / 2);
            }else if (i % 15 == 0) {
                g.drawLine(0, 0, width / 2 + i, height / 2 - i);   
                g.drawLine(0, 0, width / 2 - i, height / 2 + i);
            }
        }
    }
} // fim da classe LinesA
