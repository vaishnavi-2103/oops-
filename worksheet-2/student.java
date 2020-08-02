import java.util.Scanner;

public class student {
      public static void main(String[] args){
          stud obj[]=new stud[100];
          for(int i=0;i<9;i++)
          {
              obj[i]=new stud();
              obj[i].getvalue();
              obj[i].calgrade();
              obj[i].display();
          }
      }
}
        

      class stud
      {
          String name;
          String dept;
          String result;
          double s1,s2,s3;
          void getvalue()
          {
           Scanner obj=new Scanner(System.in);
           System.out.println("enter the input"); 
           name=obj.next();
           dept=obj.next();
           s1=obj.nextDouble();
           s2=obj.nextDouble();
           s3=obj.nextDouble();
          }
          void calgrade()
          {
              double a=(s1+s2+s3)/3;
          if(a>80)
              result="first class";
          else if(a>70 && a<=79)
              result="second class";
          else if(a>50 && a<=69)
              result="third class";
          else
              result="fail";
                  
          }
          void display()
          {
              double a=(s1+s2+s3)/3;
              System.out.println("name:\t"+(name)+"\ndept:\t"+(dept)+"\ns1:\t"+s1+"\ns2:\t"+s2+"\ns3:\t"+s3+"\navg:\t"+a);
          }
      }

        
          
           
              
          
              

