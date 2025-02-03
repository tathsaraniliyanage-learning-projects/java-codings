import java.util.*;
// Multiplication Table (1 to 12) of given number
public class Multiplication {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your num : ");
        int num= scanner.nextInt();

        for(int i=1 ; i<13 ; i++){
            int num2=num*i;
            System.out.println(num + "*" + i + "=" + num2 );
        }
    }
}
