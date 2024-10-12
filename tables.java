//3. Write a program to print tables

import java.util.Scanner;
class tables
 {
    public static void main(String args[])
     {
       int start, end, tn;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the Starting Number : ");
       start = input.nextInt();
       System.out.print("Enter the End Number : ");
       end = input.nextInt();
       System.out.print("Enter the Table Number : ");
       tn = input.nextInt();

 //......Using WHILE LOOP.............

       while(start <=end)
         {
          System.out.println(start+" * "+tn+" = "+(start*tn));
          start++;
         }
     }
 }

//-----------------------------------------------------------------------------------
//------------------------------------------------------------------------------------
/*import java.util.Scanner;
class tables
{
  public static void main(String args[])
   {
     int start,end,tn;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the Ending Number : ");
     end=input.nextInt();
     System.out.print("Enter the table number : ");
     tn=input.nextInt();

//.................USING FOR LOOP..............

     for( start=1;start<=end;start++)
      {
       
       System.out.println(start+" * "+tn+" = "+(start*tn));
      }
   }
}*/