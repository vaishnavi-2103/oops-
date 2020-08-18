package conversion;
import conversion.pack1.*;
public class main{
    public static void main(String[] args){
               moneyconversion e=new moneyconversion();
        System.out.println("The value of dollar in rupees:Rs."+e.dollartorupee());
        System.out.println("The value of rupees in dollar:$"+e.rupeetodollar());
        System.out.println("The value of yen in rupees:Rs."+e.yentorupee());
        System.out.println("The value of rupees in yen:"+e.rupeetoyen());
        System.out.println("The value of euro in rupees:Rs."+e.eurotorupee());
        System.out.println("The value of rupees in euro:"+e.rupeetoeuro());
        
    }
    
}
