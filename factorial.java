//write a program : factorial number

import java.util.Scanner;
class factorial
 {
    public static void main(String args[])
      {
         int fact=1,n,i;
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Factorial Value : ");
         n=input.nextInt();  
         for(i=1;i<=n;i++)
           {
            System.out.println(i);
            fact=fact*i;
           }
        System.out.println("The factorial Value is : "+fact);
      }
 }
