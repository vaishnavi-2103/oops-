
import java.util.Scanner;
public class numtoword {
    public static void main(String[] args) {
        int x,sum=0,r,a=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the n value");
        int num=obj.nextInt();
        while(num!=0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;    
        }
        while(sum!=0)
        {
            r=sum%10;
            sum=sum/10;
            if(r==0)
                System.out.println("zero");
            else if(r==1)
                System.out.println("one");
            else if(r==2)
                System.out.println("two");
            else if(r==3)
                System.out.println("three");
            else if(r==4)
                System.out.println("four");
            else if(r==5)
                System.out.println("five");
            else if(r==6)
                System.out.println("six");
            else if(r==7)
                System.out.println("seven");
            else if(r==8)
                System.out.println("eight");
            else
                System.out.println("nine");
        
        
        }
            
            
        }
    }
    

