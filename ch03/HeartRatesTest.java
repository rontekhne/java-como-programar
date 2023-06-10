/* Ex 3.16.java
 * testa a classe HeartRates */

public class HeartRatesTest
{
    public static void main(String[] args)
    {
        Date date = new Date(27,02,1987);
        HeartRates hr = new HeartRates("John", "Paul", date);

        int age = 2023 - date.getYear();
        int maxHeartRate = 220 - age;        
        int targetHeartFreq = maxHeartRate * 63 / 100;


        System.out.printf("Name: %s\nSurname: %s\nBirthday: %d/%d/%d\nAge: %d\nMaxHeartRate: %d\nTargetHeartRate: %d\n",
                hr.getName(), 
                hr.getSurname(), 
                date.getDay(),
                date.getMonth(),
                date.getYear(),
                age,
                maxHeartRate,
                targetHeartFreq);
                                                
    }
}   
