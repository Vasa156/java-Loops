// Write a program to print reverse tables

import java.util.Scanner;
class Reversetable
 {
   public static void main(String args[])
    {
      int s,e,t;
      Scanner input = new Scanner(System.in);
      System.out.print("Ente the Starting Number : ");
      s=input.nextInt();
      System.out.print("Enter the End Number : ");
      e=input.nextInt();
      System.out.print("Enter the Table Number : ");
      t= input.nextInt();
      while(s>=e)
        {
          System.out.println(s+" * "+t+" = "+(s*t));
          s--;
        }
    }
 }