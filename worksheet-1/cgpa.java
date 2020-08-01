import java.util.Scanner;
public class cgpa
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      double m[]=new double[10];
      double n[]=new double[10];
      double sum=0,cpgasum=0;
int i,c;
System.out.println("enter number of subject");
int n=obj.nextInt();
for(i=0;i<n;i++)
{
System.out.println("enter grade and credit for"+(i+1)+"subject");
m[i]=obj.Double();
c[i]=obj.Double();
sum=sum+m[i]*c[i];
cgpasum=cgpasum+c[i];
}
System.out.println("cgpa ....."+(sum/cpgasum));
}
}

