import java.util.Scanner;
public class fib{
    public static void main(String[]args){
    System.out.println("enter n value");
     int n=obj.nextInt();
        int a=1;
        int b=1;
        int i,c;
        System.out.println(a);
        System.out.println(b);
        for(i=0;i<=n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
       
    }
}
