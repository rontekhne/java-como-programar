/* Ex 3.17: HealthProfile
 * Computadorizacao dos registros de saude */

public class HealthProfile
{
    private String name;
    private String surname;
    private char sex;
    private Date birthday;
    private double height;
    private double weight;

    public HealthProfile(
            String name,
            String surname,
            char sex,
            Date birthday,
            double height,
            double weight)
    {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
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
    
    public void setSex(char sex)
    {
        this.sex = sex;
    }

    public char getSex()
    {
        return sex;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }

    public int getAge()
    {
        return (2023 - birthday.getYear());
    } 

    public int getMaxHeartRate()
    {
        return (220 - (2023 - birthday.getYear()));
    }

    public int getTargetHeartFreq()
    {
        return ((220 - (2023 - birthday.getYear())) * 63 / 100);
    }

    public double getImc()
    {
        return (weight / (height * height));
    }
}
