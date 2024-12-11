public class UseBase {
    public static String detectType(String input)
    {
        if (input.contains("A"))
        {
            return "Hexadecimal";
        }
        else {
            for (int i=0; i<input.length(); i++)
            {
                char e = input.charAt(i);
                int num = e - '0';
                if (num >= 2)
                {
                    return "Decimal";
                }
            }
            
            return "Binary";
        }
    }
    
    public static int hexToDecimal(String input)
    {
        // take off 55 to get decimal values
        int returnval = 0;
        
        for (int i=input.length()-1; i>=0; i--)
        {
            char c = input.charAt(i);
            int val = 0;
            if (Character.isDigit(c))
            {
                val = c - '0'; // casting to INT lol
            }
            else 
            {
                // subtract 55  (65 --> 10 (A))
                val = c - 55;
            }
            System.out.println(returnval);
            returnval += val * (Math.pow(16, input.length() - 1 - i)); 
        }
        
        return returnval;
        
    }
    
    public static String decimalToHex(int input)
    {
        // hex is BASE 16
        String returnval = "";
        while (input != 0)
        {
            if (input % 16 < 10) // if it is just 0-9 return that
            {
                returnval += Integer.toString(input%16);
            }
            else // return the letter version. That's why we have +55.
            {
                returnval += (char)((input%16)+55)+returnval;
            }
            input /= 16; 
        }
        String returnval2 = "";
        for (int i = 0; i < returnval.length(); i++) {
              
            char ch = returnval.charAt(i);
            
            returnval2 = ch + returnval2; 
        }
        
        return returnval2;
    }
         
    
    
    public static int binaryToDecimal(String input)
    {
        int temp = 0;
        for (int i=input.length()-1; i>=0; i--)
        {
            char chr = input.charAt(i);
            int num = chr - '0';
            temp += num * Math.pow(2, input.length() - 1 - i);
        }
        
        return temp;
           
        
        
    }
    public static String decimalToBinary(int input)
    {
        String s = "";
        while (input != 0)
        {
            int rem = input % 2;
            input /= 2;
            s = s + rem;
        }
        
        return s;

    }
    public static String hexToBinary(String input)
    {
        // BASE 16 --> BASE 2
        int decimal = hexToDecimal(input);
        
        return decimalToBinary(decimal);
        
        
    }
    
    public static String binaryToHex(String input)
    {
        int decimal = binaryToDecimal(input);
        return decimalToHex(decimal);
    }

}
