import java.util.Scanner;
class ReverseDigit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digits : ");
        int number = input.nextInt();
        int rem = 0;
        int rev = 0;
        for(;number>0;)
        {
            rem = number % 10;
            rev = rev * 10 +rem;
            number /=10;
        }
        System.out.println("The reverse digit is : " +rev);
        
    }
}
