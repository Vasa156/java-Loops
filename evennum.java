//Write a program to print all even numbers between 1 to 100

import java.util.Scanner;
class evennum
{
  public static void main(String args[])
    {
      int e, i;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the Even Number : ");
      e=input.nextInt();
      for(i=1;i<=e;i++)
       {
           if(i % 2 == 0)
            {
             System.out.println(i);
            }
       }
       
      
    }
}