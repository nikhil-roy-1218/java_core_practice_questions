package if_else_practice;
// Divisible by both 3 and 5
import java.util.Scanner;

public class Divisibleby3_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num%3==0 && num%5==0){
            System.out.println(num+" Is Divisible by 3 & 5");
        }else {
            System.out.println(num+" Is not Divisible by 3 and 5");
        }

    }
}
