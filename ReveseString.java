class ReverseString
{
  public static void main(String[] args)
    {
        String input = "Vihaan";
 
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
    
            System.out.println("priting revesed string");
                System.out.println("hello welcopme back java");


 
        System.out.println(new String(result));
        
         System.out.println("reult is "+result);
         System.out.println("final version");


    }


  }
}
