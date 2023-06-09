/* Ex 3.13: Employee.java
 * Cria a classe de empregados. */

public class Employee
{
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) 
    {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSalary(double salary)
    {
        if (salary > 0.0) {
            this.salary = salary;
        }
    }

    public double getSalary()
    {
        return salary;
    }

}
