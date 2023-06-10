/* Ex 3.14: Date.java
 * Classe que implementa a data */

public class Date
{
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month)
    {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public int getMonth()
    {
        return month;
    }

    public void setDay(int day)
    {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public int getDay()
    {
        return day;
    }
    
    public void setYear(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return year;
    }

    public void displayDate()
    {   
        System.out.printf("%02d/%02d/%4d\n", day, month, year);
    }

}
