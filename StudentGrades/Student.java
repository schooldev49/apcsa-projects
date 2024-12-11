import java.lang.*;
public class Student {
    private String name;
    private String ssn;
    private double avg;
    private int grade;
    private double totalpoints;
    private int numclasses;
    public Student(String name, int grade, String ssn)
    {
        this.name = name;
        this.ssn = ssn;
        this.grade = grade;
        this.numclasses = numclasses;
        this.avg = 0;
        this.numclasses = 0;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public boolean equals(Student other)
    {
        if (this.name == other.getName())
        {
            return true;
        }
        return false;
    }
    
    public String toString()
    {
        return "Student " + name + " is in grade " + grade + " and has a letter grade of " + letterGrade() + " \nmake sure to leak his SSN" + ssn;
    }
    
    public double getavg()
    {
        return avg;
    }
    
    public int getgradelvl()
    {
        return grade;
    }
    
    public void addClass(double grade)
    {
        numclasses += 1;
      
        totalpoints += grade;
        avg = totalpoints/numclasses;
        
    }
    
    public int getnumclasses()
    {
        return numclasses;
    }
    
    public char letterGrade()
    {
        return avg < 60 ? 'F' : (char)('A' + Math.floor((100-avg)/10));
    }
}
