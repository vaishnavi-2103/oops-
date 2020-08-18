package package1;
import package2.*;
import package2.subpackage21.*;
import package1.subpackage11.*;
                                               
public class Pack {
    public static void main(String[] args) {
        System.out.println("I am package 1");
        subpackone obj1=new subpackone();
        pack2 obj2=new pack2();
        subpacktwo obj3=new subpacktwo();
    }
    
}
