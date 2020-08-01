import java.util.Scanner;
public class press{
    public static void main(String[]args){
     System.out.println("PRESS KEY");
     Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();  

      switch(n)
{
  case 0:
  case 1:
  case 2:
  case 3:
  case 4:
  case 5:
  case 6:
  case 7:
  case 8:
  case 9:
     System.out.println("it is pressed AND VALID ENTRY "+n);
     break;
 default:
      System.out.println("it is incorrectly pressed AND INVALID ENTRY"+n);
}
}
}