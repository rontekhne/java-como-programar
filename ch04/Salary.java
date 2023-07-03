/* Ex-4.20 Salary.java 
 * Determina o salario bruto de cada um de tres empregados */

import java.util.Scanner;

public class Salary
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hours;
        double salaryHour;
        int extraHours;
        double salary;

        System.out.print("Enter worked hours: ");
        hours = input.nextInt();
        System.out.print("Enter salary/hour: ");
        salaryHour = input.nextDouble();

        if (hours <= 40) {
            salary = hours * salaryHour;
        }else {
            extraHours = hours - 40;
            salary = (40 * salaryHour) + (extraHours * (salaryHour + (salaryHour * 50 / 100)));
        }

        System.out.printf("Salary is: %.2f%n", salary);
    }
}
