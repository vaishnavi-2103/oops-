import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class byteandcharstream {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        FileInputStream fis=null;
        FileOutputStream fos=null;
        fis=new FileInputStream("image1.jpg");
        fos=new FileOutputStream("image.jpg");
        int read;
        while((read=fis.read())!=-1)
        {
            fos.write(read);
        }
        fis.close();
        fos.close();

        FileReader obj=null;
        FileWriter obj1=null;
        obj=new FileReader("vaishu.jpg");
        obj1=new FileWriter("images.jpg");
        int read1;
        while((read1=obj.read())!=-1)
        {
            obj1.write(read1);
        }
        obj.close();
        obj1.close();
    }
}
