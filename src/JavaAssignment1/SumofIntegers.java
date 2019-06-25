package pack_1;
import java.util.*;

public class SumofIntegers {
    public static void main(String[] args)
    {
       int sum=0;
        do {
            Scanner sc = new Scanner(System.in);//scanner to take input
            int number = 0;
            sum = 0;
            String line = sc.nextLine();
            sc = new Scanner(line); //has to do this to make the kb.hasNexInt() work.
            while (sc.hasNextInt()) {
                number = sc.nextInt();
                sum += number;
            }
            if (sum <= -1)
                System.out.println("error");
            else if (sum >= 0)
                System.out.println("Sum = " + sum);

        } while (sum != -1);

    }
}
