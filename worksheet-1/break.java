import java.util.Scanner;
public class break
{
   public static void main(String args[])
    {
        int num, temp, digit, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = s.nextInt();
        temp = num;
        while(num > 0)
        {
            num = num / 10;
            i++;
        }
        while(temp > 0)
        {
            digit = temp % 10;
            System.out.println("Digit's place "+i+" is: "+digit);
            temp = temp / 10;
            i--;
        }
    }
}
