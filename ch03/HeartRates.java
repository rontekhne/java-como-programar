/* Ex 3.16: HeartRates.java
 * Calculadora de frequencia cardiaca alvo */

public class HeartRates
{
    private String name;
    private String surname;
    private Date birthday;

    public HeartRates(String name, String surname, Date birthday)
    {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
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
}
