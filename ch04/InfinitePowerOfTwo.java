/* Ex. 4.33: InfinitePowerOfTwo.java
 * Imprime infinitos múltiplos de 2 até que haja um int overflow */

public class InfinitePowerOfTwo
{
    public static void main(String[] args)
    {
        double counter = 1.0;

        while (true) {
            System.out.printf("2 to the power of %d = %d%n", (int) counter, (int) Math.pow(2.0, counter));
            counter++;

            if (counter == 20.0) {
                break;
            }
        }
    }
}
