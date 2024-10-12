//Write a program to find sum of all natural numbers between 1 to n

import java.util.Scanner;
class sumofnatural
 {
     public static void main(String args[])
        {
         int n,i,sum=0;
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Natural numbers : ");
         n=input.nextInt();
         for(i=1;i<=n;i++)
            {
             

             sum=sum+i;
             
            }
         System.out.println("Sum of Natural numbers :"+sum);
        }
 }
