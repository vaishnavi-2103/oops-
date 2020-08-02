

import java.util.Scanner;


 class arithmetic
{
    int x;
    int y;
    
   
   void add(int x,int y)
    {
        System.out.println("sum is"+(x+y));
    }
   void sub(int x,int y)
    {
        System.out.println("difference is"+(x-y));
    }
   void mul(int x,int y)
    {
        System.out.println("product is"+(x*y));
    }
   void division(int x,int y)
    {
        System.out .println("division is"+(x/y));
        
    }
}
public class arith {
    public static void main(String[] args){
        arithmetic obj=new arithmetic();
        System.out.println("enter two number");
        Scanner objt=new Scanner(System.in);
        obj.x=objt.nextInt();
        obj.y=objt.nextInt();
        obj.add(obj.x,obj.y);
        obj.sub(obj.x,obj.y);
        obj.mul(obj.x,obj.y);
        obj.division(obj.x,obj.y);
        
    }
    
}
