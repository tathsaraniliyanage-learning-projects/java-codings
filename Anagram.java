// Determine if two strings are anagrams
import java.util.*;
public class Anagram {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("enter string 1 : ");
        String name1 = input.nextLine();
        System.out.print("enter string 2 : ");
        String name2 = input.nextLine();
        if(isAnagram(name1, name2)){
            System.out.println(name1 + " & " + name2 + " are anagrams ");
        }else{
            System.out.println(name1 + " & " + name2 + " are not anagrams ");
        }
    }

    public static boolean isAnagram(String name1 , String name2){
            if (name1.length() != name2.length()) {
                return false; // If lengths are different, they can't be anagrams
            }
    
            // Convert to char array and sort
            char[] arr1 = name1.toCharArray();
            char[] arr2 = name2.toCharArray();
    
            Arrays.sort(arr1);
            Arrays.sort(arr2);
    
            // Compare sorted arrays
            return Arrays.equals(arr1, arr2);
     
    }
}
