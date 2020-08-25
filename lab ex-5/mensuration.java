import java.util.Scanner;
public class mensuration {
    public static void main(String[] args){
    circle obj=new circle();
    obj.area();
    obj.circumference();
    square obj1=new square();
    obj1.area();
    obj1.lengthofdiagonal();
    sphere obj2=new sphere();
    obj2.surface();
    obj2.vol();
    }
}
class shape
{
    double a, r,area,circumference,length,surfarea,vol;
    shape()
    {
        r=2.32;// setting the radius
        a=3.14;// setting a as pi value
    }
}
class circle extends shape
{
    public void area()
    {
        System.out.println(" area and circumference of circle  of radius:\t" +r);
        area=a*r*r;
        System.out.println("The area of circle is:"+area+"sq units");
    }
    public void circumference()
    {
        circumference=2*a*r;
        System.out.println("The circumference of circle is:"+circumference+"cm\n");
    }
}
class square extends shape
{
    public void area()
    {
        System.out.println("area and diagonal length of a square of radius:\t"+r);
        area=4*r;
        System.out.println("The area of square is:"+area+"sq units");
    }
    public void lengthofdiagonal()
    {
        length=1.414*r;
        System.out.println("The length of diagonal is :"+length+"cm\n");
    }
}
class sphere extends shape
{
    public void surface()
    {
        System.out.println(" surface area and volume of sphere of radius:\t" +r);
        surfarea=4*a*r*r;
        System.out.println("The surface area of sphere is:"+surfarea+"sq units");
    }
    public void vol()
    {
        vol=(4/3)*(a*(r*r*r));
        System.out.println("The volume of sphere"+vol+"cubic units");
    }
}



    


