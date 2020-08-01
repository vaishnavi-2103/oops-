import.java.util.Scanner;
public class palindrome
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("enter the number");
int a=obj.nextInt();
a=n;
while(a!=0)
{
r=a%10;
sum=sum+r*10;
a=a/10;
}
if(a=n)
{
System.out.println("it is a palindrome");
}
else
{
System.out.println("it is not a palindrome);
}
}