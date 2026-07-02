package if_else_practice;
//Positive, Negative or Zero - done
import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=input.nextInt();

        if(num>0){
            System.out.println(num+" Is positive number");
        } else if (num==0) {
            System.out.println(num+" Is Zero Enter valid number");
        }else {
            System.out.println(num+" Is Negative number");
        }
    }
}
