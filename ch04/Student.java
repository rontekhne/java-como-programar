/* Figura 4.4: Student.java
 * Classe Student que armazna o nome e a media de um aluno */

public class Student
{
    private String name;
    private double average;

    // construtor inicializa as variaveis de instancia
    public Student(String name, double average)
    {
        this.name = name;

        // validacao de limite do average
        if (average > 0.0)
            if (average <= 100.0) 
                this.average = average;
    }   

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAverage(double average)
    {
        if (average > 0.0) 
            if (average <= 100.0)
                this.average = average;
    }

    public double getAverage()
    {
        return average;
    }

    // retorna a letra correspondente a nota do estudante
    public String getLetterGrade()
    {
        String letterGrade = ""; // string vazia
        
        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;
    }
}
