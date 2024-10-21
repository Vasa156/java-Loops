import java.util.Scanner;
class Fibo_nacci
 {
     public static void main(String args[])
      {
          Scanner j = new Scanner(System.in);
          System.out.print("Enter a fibonacci values : ");
          int n=j.nextInt();
          int a=0;
          int b=1;
          int c=0;
          System.out.println("Fibonacci Answer : ");
          for(int i=c;i<n;i++)
           {
               a=b;
               b=c;
               c=a+b;
               System.out.println(c);
           }
      }
 }
