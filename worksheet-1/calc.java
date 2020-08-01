import java.util.Scanner;
public class calc{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a value");
        int a=obj.nextInt();
        System.out.println("enter b value");
        int b=obj.nextInt();
        System.out.println("enter a character (+,-,*,/) value");
        char c=obj.next().charAt(0);
        switch(c)
        {
            case '+': System.out.println("addition "+(a+b));
            break;
            case '-': System.out.println("subtraction "+(a-b));
            break;
            case '*': System.out.println("multiplication "+(a*b));
            break;
            case '/': System.out.println("division "+(a/b));
            break;
            default:
                    System.out.println("incorrect option");
        }
       
    }
}

