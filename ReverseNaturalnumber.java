//Write a program to print all natural numbers in reverse

import java.util.*;
class ReverseNaturalnumber
{
  public static void main(String args[])
   {
    int a,i;
    Scanner inputnumber = new Scanner(System.in);
    System.out.print("InputNumber  : ");
    a= inputnumber.nextInt();
    for(i=a;i>=1;i--)
     {
         System.out.println(i);
     }
   }
}