//Write a program to print all natural numbers from 1 to n

import java.util.Scanner;
public class Naturalnumber
{
    public static void main(String args[])
    {
        int a,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Input : ");
        a=input.nextInt();

        for(i=1;i<=a;i++)
        {
            System.out.println(i);
        }

    }
}
