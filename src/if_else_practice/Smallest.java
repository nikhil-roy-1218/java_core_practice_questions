package if_else_practice;

import java.util.Scanner;
// Smallest of 2 Numbers -
public class Smallest {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a First Number: ");
        int num = input.nextInt();
        System.out.print("Enter a Second Number: ");
        int num2 = input.nextInt();

        if(num>num2){
            System.out.println(num2+" Is Smaller");
        } else if (num==num2) {
            System.out.println("Both number are same (" +num+ ")");
        }else {
            System.out.println(num+" Is Smaller");
        }
    }
}
