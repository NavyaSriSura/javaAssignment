package pack_1;
import java.util.*;

public class VowelConsonant {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String word=sc.nextLine();
       // System.out.println("Your word is "+word);
        word=word.toLowerCase();
        VowelConsonant vowelConsonant=new VowelConsonant();
        vowelConsonant.checkMeth(word);
    }
    public static void checkMeth(String word)
    {
        for(int i=0;i<word.length();++i)
        {
            char ch= word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.print("Vowel ");
            }
            else if (ch>='a' && ch<='z')
            {
                System.out.print("Consonant ");
            }
            else
            {
                System.out.print("Please enter a valid letter");
            }
        }
    }
}
