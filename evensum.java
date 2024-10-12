//Write a program to find sum of all even numbers between 1 to n

import java.util.Scanner;
class evensum
{
  public static void main(String args[])
    {
      int e, i, sum=0;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the Even Number : ");
      e=input.nextInt();
      for(i=1;i<=e;i++)
       {
           if(i % 2 == 0)
            {
             sum=sum+i;
            }
          
       }
       
       System.out.println("Sum of Even Natural Number  : "+sum);

    }
}
