/* Ex 4.31: ChessTable.java
 * Desenha um tabuleiro de xadrez com astriscos */

public class ChessTable
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 1) {
                System.out.print(" ");
            }
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
