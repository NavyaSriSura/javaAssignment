package pack_1;
import java.util.*;
public class StringRepeat {
    public static void main(String args[]) {
        String str;
        int num, length, repeat;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        str = sc.nextLine();
        System.out.println("enter number:");
        num = sc.nextInt();
        System.out.print(str);
        length = str.length();
        repeat = length - num;
        for (int i = 0; i < num; i++) {
            System.out.print(str.substring(repeat));
        }

    }
    }
