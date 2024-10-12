//sumof digit
import java.util.Scanner;
class SumDigits
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Own Digits : ");
        int digits=input.nextInt();
        int sum=0;
        int rem=0;
        while(digits>0) // 1234>0 //123>0 //12>0 //1>0
        {
            rem=digits%10; //0=1234%10 => 0=4 //123%10 => 3 //12%10 =2 // 1%10
            sum=sum+rem; //0 = 0+4=> sum=4  //4=4+3=7 // 7=7+2=9 //9=9+1=10
            digits/=10; //1234/10 => 123    //123/10 =>12 //12%10=1 //1%10 =0(code exc finished...)
            
        }
        System.out.println("The sum Of Digit is : "+sum);
        
    }
}
