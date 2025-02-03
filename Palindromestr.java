// Check if a string is a palindrome
import java.util.*;
public class Palindromestr {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name : ");
        String  name = input.nextLine();

        String reverse = new StringBuilder(name).reverse().toString();
        if(name.equals(reverse)){
            System.out.println(name + " is palindrome : " + "true");
        }else{
            System.out.println(name + " is palindrome : " + "false");
        }
    }
}
