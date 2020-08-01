import java.util.Scanner;
public  class palindrome{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
int n,r,s=0,a;
System.out.println("enter the number");
 n=obj.nextInt();
a=n;
while(n>0)
{
r=a % 10;
s=r+(s*10);
n=n/10;
}
if(s==a)
{
System.out.println("it is a palindrome");
}
else
{
System.out.println("it is not a palindrome");
}
}
}

}
