
import java.util.Scanner;
public class convertingbond {
    public static void main(String[] args){
        bond m=new bond();
        convertiblebond n=new convertiblebond();
        for(int i=0;i<6;i++)
        {
            int b;
            Scanner obj=new Scanner(System.in);
            System.out.println("press 1 for bond and 2 for convertible bond");
            b=obj.nextInt();
            switch(b)
            {
                case 1:
                    m.display();
                    break;
                case 2:
                    n.display();
                    break;
            }
            
        }
    }
    
}
class bond
{
    void display()
    {
        System.out.println("Bond");
    }
}
class convertiblebond extends bond
{
    void display()
    {
        System.out.println("Convertiblebond");
    }
}