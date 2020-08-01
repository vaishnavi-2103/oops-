import java.util.Scanner;
public class power{
    public static void main(String[]args){
         Scanner obj=new Scanner(System.in);
        System.out.println("enter base value");
        int base=obj.nextInt();
        System.out.println("enter the exponent");
        int exponent=obj.nextInt();
        double result = Math.pow(base, exponent);
           System.out.println("Answer = " + result);
    }
}
