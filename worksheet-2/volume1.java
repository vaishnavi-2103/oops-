import java.util.Scanner;

class vol
{
    double l;
    double b;
    double h;
   void getvalue()
{
System.out.println("enter the l b h");
Scanner obj=new Scanner(System.in);
l=obj.nextDouble();
b=obj.nextDouble();
h=obj.nextDouble();
}

void cal()
{
    System.out.println("the volume"+" "+ l*b*h);
}
}
public class volume1 {
    public static void main(String[] args){
        vol obj=new vol();
        obj.getvalue();
        obj.cal();
    }
    
}
