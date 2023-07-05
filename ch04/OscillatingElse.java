/* Ex 4.27: OscillatingElse.java */

public class OscillatingElse
{
    public static void main(String[] args)
    {
        int x;
        int y;

        x = 9;
        y = 11;
        System.out.printf("caseA 1 = %s%n", caseA(x, y));

        x = 11;
        y = 9;
        System.out.printf("caseA 2 = %s%n", caseA(x, y));

        x = 9;
        y = 11;
        System.out.printf("caseB 1 = %s%n", caseB(x, y));

        x = 11;
        y = 9;
        System.out.printf("CaseB 2 = %s%n", caseB(x, y));
    }

    static public String caseA(int x, int y) 
    {
        String result = "";

        if (x < 10)
            if (y > 10)
                result += "*****";
            else
                result += "#####";
        result += "$$$$$";

        return result;
    }

    static public String caseB(int x, int y)
    {
        String result = "";

        if (x < 10) {
            if (y > 10) 
                result += "*****";
        }else {
            result += "#####";
            result += "$$$$$";
        }

        return result;
    }
}
