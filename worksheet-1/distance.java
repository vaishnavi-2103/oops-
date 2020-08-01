
import java.util.Scanner;
public class distance{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter x1 value");
        int x1=obj.nextInt();
        System.out.println("enter x2 value");
        int x2=obj.nextInt();
        System.out.println("enter y1 value");
        int y1=obj.nextInt();
        System.out.println("enter y2 value");
        int y2=obj.nextInt();
        double distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println(distance);
    
        
    }
}
