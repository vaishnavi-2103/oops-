import java.util.Scanner;
public class discount{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the amount");
        double a=obj.nextDouble();
        System.out.println("enter the discount in %");
        double d=obj.nextDouble();
        double n=a/100*d;
        System.out.println("commission amount = "+(a-n));
        
    }
}
