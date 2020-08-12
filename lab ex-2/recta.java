
public class recta {
    public static void main(String[] args) { 
        shape r=new shape(1.11,2.22);
        System.out.println(r.getlength());
        System.out.println(r.getwidth());
        r.setwidth(3.33);
        System.out.println(r.getwidth());'
        System.out.println(r.getarea());
        System.out.println(r.getperi());
        System.out.println(r);
        
    }
}
class shape {
 
    double length,area,peri;
    double width;
    shape(double l,double w)
    {
        length=l;
        width=w;
    }
    double getlength()
    {
        return length;
    }
    double getwidth()
    {
        return width;
    }
    void setwidth(double w1)
    {
        width=w1;
    }
    double getarea()
    {
         area=length*width;
        return area;
    }
    double getperi()
    {
         peri=2*(length+width);
        return peri;
    }
    public String tostring()
    {
      return "Length:"+length+"Width:"+width+"Area:"+area+"Perimeter:"+peri;
    }
 }

    
        
 
