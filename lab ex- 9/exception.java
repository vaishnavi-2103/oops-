public class exception {
    public static void main(String[] args) {
        int a = 4, b = 0;
        int arr[] = new int[6];
        String str[] = new String[3];
     
        arrayexcep(arr);
        arith(a, b);
        numformat(a);
        stringexcep(str);
    }

   
    static void arrayexcep(int arr[]) {
        try {
            arr[7] = 50;
        } catch (Exception e) {
            System.out.println( e);
        }
    }

    static void arith(int a, int b) {
        try {
            a = a / b;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void numformat(int a) {
        try {
            a = Integer.parseInt(" 1 ");
        } catch (Exception e) {
            System.out.println( e);
        }
    }

    static void stringexcep(String str[]) {
        try {
            str[4] = "It is a string";
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}