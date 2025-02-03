// Print 1 to 100 without using numbers.
public class Printnum {
    public static void main(String args[]){
        // for(int i=1; i<101 ; i++){
        //     System.out.println(i);
        // }

        String s1 = "a";
        String s2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        for (int i = s1.length(); i <= s2.length(); i++) {
            System.out.println(i);
        }
    }
}
