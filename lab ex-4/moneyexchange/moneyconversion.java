
package conversion.pack1;
import java.util.Scanner;
public class moneyconversion {
        double dollar,rupees,yen,euro;
        Scanner obj=new Scanner(System.in);
        public double dollartorupee()
        {
          System.out.println("Enter the dollar:");
          dollor=obj.nextDouble();
          rupees=dollor*74.85;
          return rupees;
        }
        public double rupeetodollar()
        {
          System.out.println("Enter the rupees:");
          rupees=obj.nextDouble();
          dollor=rupees*0.013;
          return dollor;
        }
        public double yentorupee()
        {
          System.out.println("Enter the yen:");
          yen=obj.nextDouble();
          rupees=yen*0.70;
          return rupees;
        }
        public double rupeetoyen()
        {
          System.out.println("Enter the rupees:");
          rupees=obj.nextDouble();
          yen=rupees*1.42;
          return yen;
        }
        public double eurotorupee()
        {
          System.out.println("Enter the euro:");
          euro=obj.nextDouble();
          rupees=euro*88.65;
          return rupees;
        }
        public double rupeetoeuro()
        {
          System.out.println("Enter the rupees:");
          rupees=obj.nextDouble();
          euro=rupees*0.011;
          return euro;
        }
        
        
          
        }
        
    
    
       
        
        
        
    
