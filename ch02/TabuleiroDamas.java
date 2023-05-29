/* Exe-2.27: TabuleiroDamas.java
 * programa desenha um padrao de tabuleiro
 * de damas. Eu deveria usar somente print
 * mas vou iterar... */

public class TabuleiroDamas
{
				public static void main(String args[])
				{
								int i, j;

								for (i = 0; i < 8; i++) {
												for (j = 0; j < 8; j++) {
																if (i % 2 == 0) {
																				System.out.print("* ");
																}else {
																				System.out.print(" *");
																}
												}
												System.out.println();
								}
				}
}
