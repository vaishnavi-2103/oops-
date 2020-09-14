
public class duplicate {
    public static void main(String[] args){
        String a="w3resource";
        String b="";
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch!=' ')
            b=b+ch;
            a=a.replace(ch,' ');
        }
        System.out.println("After removing duplicates the word is:"+b);
                
    }
}

    
            
        
        
