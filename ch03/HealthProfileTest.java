/* Ex 3.17: HealthProfileTest.java
 * Testa a classe HeartProfile */

public class HealthProfileTest
{
    public static void main(String[] args)
    {
        Date date = new Date(27,02,1987);
        HealthProfile hp = new HealthProfile(     
                "Ron",
                "Tekhne",
                'M',
                date,
                1.70,
                73);

        System.out.printf(
                "Name: %s %s\nSex: %c\nAge: %d\nIMC: %.2f\nMaxHeartRate: %d\nTargetHeartFreq: %d\n",
                hp.getName(),
                hp.getSurname(),
                hp.getSex(),
                hp.getAge(),
                hp.getImc(),
                hp.getMaxHeartRate(),
                hp.getTargetHeartFreq());

    }
}
