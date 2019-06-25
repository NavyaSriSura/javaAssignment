package pack_1;
import java.util.*;

public class Sort_In_Descending  {

    public static void main(String[] args)
    {
     Scanner scanner=new Scanner(System.in);
     int number=scanner.nextInt();
     boolean result;
     result=sort(number);
     System.out.print(" "+result);
    }

   public static boolean sort(int number){
        int sum=0;
       List<Integer> number_list= new ArrayList<>();
       for (int i = number; i > 0; i /= 10)
           number_list.add(i % 10);
       Collections.sort(number_list);  // sorting list in ascending order
       Collections.reverse(number_list); //sorting list in descending order

       for(int j=0;j<number_list.size();j++)
       {
           System.out.print(" "+number_list.get(j)); // printing the elements in descending order
       }

       for(int i=0;i<number_list.size();i++)
       {
           if(number_list.get(i)%2==0)
           {
              sum+=number_list.get(i);
           }
       }
       System.out.println("  Sum of even numbers: "+sum);
       if(sum>15)
        return true;
       else
           return false;
   }

}
