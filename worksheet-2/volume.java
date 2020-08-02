import java.util.Scanner;

class vol
{
    double length;
    double breadth;
    double width;
}
        
public class volume {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        vol objt=new vol();
        System.out.println("enter length breadth width");
        objt.length=obj.nextInt();
        objt.breadth=obj.nextInt();
        objt.width=obj.nextInt();
        System.out.println("The volume is"+(objt.length*objt.breadth*objt.width));
        
        
     
    }
}
