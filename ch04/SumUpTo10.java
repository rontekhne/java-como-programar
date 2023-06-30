/* SumUpTo10.java */

public class SumUpTo10 
{
    public static void main(String[] args) {
        int x;
				int sum;

				x = 0;
				sum = 0;

				while (x++ < 10) {
								sum += x;
								System.out.printf("Sum = %d%nX = %d%n", sum, x);
				}
    }
}
