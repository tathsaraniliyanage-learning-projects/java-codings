// If the salary is more than 10000, deduct 10% of tax, else not deduct tax.
import java.util.*;
public class Salary {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("input salary : ");
        double sal = input.nextDouble();
        double total_price;
        if(sal>10000){
            double deduct =sal*10/100;
            total_price=sal-deduct;
            System.out.println("tax amount :" +deduct  );
            System.out.println("final salary : " + total_price  );
        }else{
            total_price = sal;
            System.out.println( total_price +" amount is not tax dedicated");
        }
    }
}
