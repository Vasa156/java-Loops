//primenumber or not? 

import java.util.Scanner;
class Primenumber
{
    public static void main(String args[])
     {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number : ");
         int number=input.nextInt();
         int count=0;
         for( int i=2;i<number;i++)
          {
            if(number%i==1)
            {
                count++;
                break;
                
            }
          }
          if(count==0)
          {
              System.out.println("not a Primenumber");
          }
          else
          {
              System.out.println("It ia  primenumber");
          }
          
     }
}
