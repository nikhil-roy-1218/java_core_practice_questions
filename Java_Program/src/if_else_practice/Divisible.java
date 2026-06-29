package if_else_practice;
// Check Divisible by 5 and 11
import java.util.Scanner;

class Divisible {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num % 5 ==0 && num %11 ==0){
            System.out.println(num+ " This number Divisible by 5 & 11");
        }else {
            System.out.println(num+ " This number not Divisible by 5 & 11");
        }
    }
}
