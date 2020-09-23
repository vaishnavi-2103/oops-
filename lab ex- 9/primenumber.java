
public class primenumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Prime p= new Prime(a, b);
        try {
            p.check();
            p.primenumbers();
        } 
        catch (PrimeNumberException e) {
            System.out.println(e);
        }
    }
}

class Prime {
    int a, b;

    Prime(int a, int b) {
       
    }

    void check() throws PrimeNumberException {
        if (a <= 0 && b <= 0)
            throw new PrimeNumberException("wrong entry");
        if (b < a)
            throw new PrimeNumberException("last is small than first num ");
    }

    void primenumbers() {
        int flag = 0;
        for (int i = a; i <= b; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = -1;
                    break;
                } else
                    flag = 1;
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}

class PrimeNumberException extends Exception {
    PrimeNumberException(String s) {
        super(s);
    }
}


   
  