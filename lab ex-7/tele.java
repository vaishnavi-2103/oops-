  
import java.util.*;

public class tele{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float amount = 0, sum = 0;
        ArrayList<Float> bill = new ArrayList<>();
        System.out.println("Enter telephone bill amount for 12 months");
        for (int i = 1; i <= 12; i++) {
            amount = obj.nextInt();
            bill.add(amount);
        }
        for (float a : bill) {
            sum = sum + a;
        }
        Collections.sort(bill);
        System.out.println("Average: " + (sum / 12));
        System.out.println("Max amount: " + bill.get(0));

        Collections.sort(bill, Collections.reverseOrder());
        System.out.println("Min amount: " + bill.get(0));
}
}
  
