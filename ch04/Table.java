/* Ex-4.22 Table.java 
 * Saida em formato de tabela */

public class Table
{
    public static void main(String[] args)
    {
        int i;

        System.out.printf("N\t10*N\t100*N\t1000*N\n\n");
        for (i = 1; i <= 5; i++) {
            System.out.printf("%d\t%d\t%d\t%d\n",
                    i, 10*i, 100*i, 1000*i);
        }
    }
}

