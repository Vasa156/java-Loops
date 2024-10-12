//Write a program to find sum of all odd numbers between 1 to n

import java.util.Scanner;
class oddsum
{
  public static void main(String args[])
    {
      int e, i, sum=0;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the Odd Number : ");
      e=input.nextInt();
      for(i=1;i<=e;i++)
       {
           if(i % 2 == 1)
            {
             sum=sum+i;
            }
          
       }
       
       System.out.println("Sum of Odd Natural Number  : "+sum);

    }
}
