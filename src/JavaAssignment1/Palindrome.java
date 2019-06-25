package pack_1;
import java.util.*;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        long num = sc.nextLong();

        check_Palindrome(num);
    }

        public static void check_Palindrome(long num){
            long temp = num, sum = 0, r, r1, s = 0;
            while (num > 0) {
                r = num % 10;
                sum = (sum * 10) + r;
                num = num / 10;
            }
            if (sum == temp) {
                System.out.print(sum + "" + " is a palindrome and");

                while (sum > 0) {
                    r1 = sum % 10;
                    if (r1 % 2 == 0) {
                        s = s + r1;
                    }
                    sum = sum / 10;
                }
                if (s > 25) {
                    System.out.print(" sum of even numbers is greater than 25");
                } else {
                    System.out.print(" sum of even numbers is less than 25");
                }
            } else {
                System.out.print(num + "is not a palindrome");
            }
        }
    }
