//Write a program to print all odd number between 1 to 100

import java.util.Scanner;
class odd
 {
   public static void main(String args[])
     {
      int o,i;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Odd Number : ");
      o=input.nextInt();
      for(i=1;i<=o;i++)
        {
           if(i % 2 == 1)
             {
                System.out.println(i);
             }
        }
     }
 }