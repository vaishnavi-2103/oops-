
public class truefalse {
    public static void main(String[] args) {
        argument obj=new argument();
        boolean c=argument.majority(true,false,false);
        if(a==true)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
      
    }
    
}
class argument  {
    static boolean majority(boolean a,boolean b, boolean c)
    {

        if((a &&b)||(b && c)||(a && c)){
            return true;
        }
        else {
            return false;
}
        
    }
}
