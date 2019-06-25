package pack_1;
import  java.util.*;
public class CheckCase {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); //creating object for Scanner class
        System.out.print("Enter character");
        char ch=sc.next().charAt(0);
         CheckCase checkCase=new CheckCase();
         checkCase.checkCaseMeth(ch);
    }
    public static void checkCaseMeth(char ch)
    {
        if(ch>=65 && ch<=90) //checking with ASCII values
        {
            System.out.print("Capital Letter");
        }
        else if (ch>=97 && ch<=122)
        {
            System.out.print("Small Letter");
        }
        else if(ch>=48 && ch<=57)
        {
            System.out.print("digit");
        }
        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=127))
        {
            System.out.print("Special Symbol");
        }
    }
}
