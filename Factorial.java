// import java.util.*;
// public class Factorial {
//     public static void main(String args[]){
//         System.out.println("enter the number");
//         Scanner input = new Scanner(System.in);
//         int num= input.nextInt();
//         System.out.println("factorial number is : " + findfact(num));
//     }

//     public static int findfact(int num){
//         int facto=1;
//         for(int i=1;i<=num;i++){
//             facto*=1;
//         }
//         return facto;
//     }
// }


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Number : ");
        int num = sc.nextInt();

        System.out.println("Factorial number is : " + findFactorial(num));
        sc.close();
    }

    private static int findFactorial(int num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}