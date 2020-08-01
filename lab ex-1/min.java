import java.util.Scanner;
class min
{
   public static void main(String args[])
   {
      int x, y;
      System.out.println("Enter the numbers");
      Scanner in = new Scanner(System.in);  
      x = in.nextInt();
      y = in.nextInt();
      int min=(x<y)?x:y;
System.out.println("minimum is" +min );
}
}