import java.lang.*;
import java.util.*;
import java.io.*;
public class MyProgram
{
    public static void sort(ArrayList<Number> arr)
    {
        int i, j;
        Number temp;
        boolean swap;
        for (i=0; i<arr.size()-1; i++)
        {
            swap=false;
            for(j=i+1; j<arr.size()-1; j++)
            {
                Number first = arr.get(j);
                Number second = arr.get(j+1);
                
                Double one = first.doubleValue();
                Double two = second.doubleValue();
                if (one.compareTo(two)>0){
                    temp = first;
                    arr.set(j, second);
                    arr.set(j+1, temp);
                    swap = true;
                }
            }
            if (swap == false)
            {
                break;
            }
            
        }
    }
    public static void main(String[] args)
    {
       // Number is abstract, so you can't create a class of it, only extend it.
       ArrayList<Number> list = new ArrayList<Number>();
       HashMap<Number,Integer> freq = new HashMap<Number,Integer>();
       int intAmount = 0;
       int doubleAmount = 0;
       for (int i=0; i<10000; i++)
       {
           boolean chooseInt = (Math.random()>0.5);
           if (chooseInt)
           {
               int num = (int)(Math.random() * (18) + 2);
               list.add(num);
               int am = freq.getOrDefault(num, 0);
               freq.put(num, am+1);
               intAmount++;
           }
           else
           {
               double num =( Math.random() * (18) + 2);
               list.add(num);
               int realnum = (int)(num);
               int am = freq.getOrDefault(realnum, 0);
               freq.put(realnum, am+1);
               doubleAmount++;
           }

       }
       System.out.println("INTS: " + intAmount + "\nDOUBLES: " + doubleAmount);
       
       sort(list);
       
       for (int i=0; i<list.size(); i++)
       {
          System.out.println(list.get(i));
       }
       Iterator it = freq.entrySet().iterator();
       while (it.hasNext())
       {
           Map.Entry pair = (Map.Entry)it.next();
           System.out.println(pair.getKey() + " amount: " + pair.getValue());
       }
    }
}
