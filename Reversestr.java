// reverse a string
import java.util.*;
public class Reversestr{
    public static void main(String args[]){
       solution("hello");
    }

    public static String solution(String str){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name : ");
        String name = input.nextLine();

        
       String reversed=  new StringBuilder(str).reverse().toString();
       System.out.println("reversed name : " + reversed);

        return "hello";
    }
}


