import java.io.*;
import java.lang.*;
import java.util.*;


public class MyProgram
{
    public static int find(ArrayList<Student> arr, String name)
    {
        for (int i=0; i<arr.size(); i++)
        {
            if (arr.get(i).getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException
    {
        File file;

        file = new File("grades.txt");
        Scanner sc = new Scanner(file);
        
        ArrayList<Student> studentarr = new ArrayList<Student>();
        sc.nextLine(); 
        sc.nextLine();
        
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                
                String lineText = sc.nextLine();
                String[] split = lineText.split(" ");
                String lastname = split[0];
                String firstname = split[1];
                
                String name = firstname + " " + lastname;
                String ssn = split[2];
                int gradelevel = Integer.parseInt(split[3]);
                String classname = split[4];
                double grade = (double)Integer.parseInt(split[5]);
                int ind = find(studentarr,name);
                if (ind == -1)
                {
                    Student st = new Student(name, gradelevel, ssn);
                    studentarr.add(st);
                    ind = find(studentarr,name);
                }
                
                Student studObj = studentarr.get(ind);
                studObj.addClass(grade);
            }
            if (i != 2)
            {
                sc.nextLine();

            }
        }
        
        
        for (Student st: studentarr)
        {
            System.out.println(st);
        }
    }
    
    
}
