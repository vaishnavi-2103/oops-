
public class staticnonstatic{
    public static void main(String[] args) {
        staticvariable obj=new staticvar();
        obj.display();
        staticvariable obj1=new staticvariable();
        obj1.display();
        staticvariable obj2=new staticvariable();
        obj2.display();
        obj.display1();
        obj.display1();
        obj.display1();
        
    }

        
}
class staticvariable {
    static int a=20;
     int b=30;
     int c=10,d=40;
    void display()
    {

        System.out.println("Result using static variable");
        a=a+10;
        b=b+10;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    void display1()
    {
        System.out.println("Result using non static variable");
        c=c+10;
        d=d+10;
        System.out.println("c="+c);
        System.out.println("d="+d);
        
 
            
    }
    
}
