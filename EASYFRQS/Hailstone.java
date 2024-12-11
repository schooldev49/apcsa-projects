public class Hailstone {
    // n  =1 --> terminates
    // 5, 16, 8, 4, 2, 1
    // if N is even: n/2 next term
    // if N is odd: 3n+1 next term
    // length of hailstone
   public static int HailstoneLength(int n)
   {
      int length = 1;
      while (n != 1)
      {
          if (n % 2 == 1)
          {
              n = (n*3)+1;
              length++;
          }
          else
          {
              n /= 2;
              length++;
          }
      }
      
      
      
      
   }
   
   public static boolean isLongSeq(int n)
   {
       return (HailstoneLength(n) > n);
   }
   
   public static double propLong(int n)
   {
      double longnums = 0;
      for (int i=1; i<=n; i++)
      {
          if (isLongSeq(i))
          {
              longnums++;
          }
      }
      
      return (longnums/(double)n);
   }
   
  
}
