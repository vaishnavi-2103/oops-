
import java.util.Scanner;
 public class  har
 {
  public static void main(String args[])
{
int n,i;
float sum=0;

      System.out.println("enter the limit");
      Scanner in = new Scanner(System.in);  
      n = in.nextInt();


for(i=1;i<=n;i++)
{
sum=sum+(float)1/i;
}

      System.out.println("Sum of the integers = " + sum);
}
}