package pack_1;
import java.util.*;

public class Odd_Even {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number between 20 and 30 ");
        int n=sc.nextInt();
        Odd_Even odd_even=new Odd_Even();
        odd_even.checkOddEven(n);
    }
    public static void checkOddEven(int n)
    {
        if(n>20 && n<30)
        {
            if(n%2==1)
            {
                System.out.print("Tom");
            }
            else
            {
                System.out.print("Jerry");
            }
        }
        else {
            System.out.print("not tom not jerry");
        }
    }
}
