package pack_1;
import java.util.*;
public class String_Reverse {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String reverse = ReverseMethod(string);
        System.out.println(reverse);
    }

    public static String ReverseMethod(String string) {
        if (string == null || string.isEmpty())
            return string;
        else
            {
            String reverse = "";
            for (int i = string.length() - 1; i >=0; --i) {
                reverse = reverse+ string.charAt(i);
            }
            return reverse;
        }

    }
}

