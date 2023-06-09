/* Ex 3.13: EmployeeTest.java
 * testa a classe Employee */

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("John", "Napier", 1300.00);
        Employee emp2 = new Employee("Kate", "Lise", 1567.99);

        // exibe nomes e salarios anuais
        System.out.printf("%s %s' Annual salary = $%.2f\n",
                emp1.getName(),
                emp1.getSurname(),
                12 * emp1.getSalary());

        System.out.printf("%s %s' Annual salary = $%.2f\n",
                emp2.getName(),
                emp2.getSurname(),
                12 * emp2.getSalary());

        // aumento de 10% para cada um hehe
        emp1.setSalary(emp1.getSalary() + (emp1.getSalary() * 10 / 100));
        emp2.setSalary(emp2.getSalary() + (emp2.getSalary() * 10 / 100));
        
        // exibe nomes e salarios anuais com 10% de aumento
        System.out.printf("%s %s' Annual salary = $%.2f\n",
                emp1.getName(),
                emp1.getSurname(),
                12 * emp1.getSalary());

        System.out.printf("%s %s' Annual salary = $%.2f\n",
                emp2.getName(),
                emp2.getSurname(),
                12 * emp2.getSalary());

    }
}
