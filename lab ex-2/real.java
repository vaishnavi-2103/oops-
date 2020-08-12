

import java.util.Scanner;
public class real {
      public static void main(String[] args) {
            complex s=new complex();
            int x1,x2,y1,y2;
            System.out.println("enter the value of x1,x2,y1,y2:");
            Scanner obj=new Scanner(System.in);
            x1=obj.nextInt();
            x2=obj.nextInt();
            y1=obj.nextInt();
            y2=obj.nextInt();
            s.add( x1, x2, y1, y2);
            s.sub( x1, x2, y1, y2);
            s.mul( x1, x2, y1, y2);
            s.div( x1, x2, y1, y2);
            
            
            
    }
}
            
class complex { int i;
    void add(int x1 , int y2 , int y1  ,int x2  )
    {
       int a=x1+x2;
       int b=y1+y2;
       System.out.println("Addition"+a+"+i"+b);
    }
    void sub(int x1, int x2, int y1, int y2)
    {
       int a=x1-x2;
       int b=y1-y2;
        System.out.println("Subtraction"+a+"+("+b+"i)");
    }
    void mul(int x1, int x2, int y1,int y2)
    {
    
        int a=(x1*x2)-(y1*y2);
        int b=(y1*x2)+(y2*x1);
        System.out.println("Multiplication"+a+"+"+b+"i");
        
     }
    void div(int x1,int x2, int y1,int y2)
    {
        double a=(x1*x2)+(y1*y2);
        double b=(y1*x2)-(x1*y2);
        double c=(x2*x2)+(y2*y2);
  
        System.out.println("Division"+a/c+"+"+b/c+"i");
        
     }
   
 }
    
            
            
          
    

