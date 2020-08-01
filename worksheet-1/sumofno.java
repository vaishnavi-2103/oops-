import java.util.Scanner;
 public class  har
 {
  public static void main(String args[])
  {
        int i, n, sum = 0;
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter the limit:");
           n= obj.nextInt();
         for(i=0;i<n;i++)
           {        
               sum = sum +1/ n;
              
}
      System.out.println("Sum of numbers:"+sum);
  }
 }
