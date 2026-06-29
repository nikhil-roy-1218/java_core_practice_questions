package if_else_practice;

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();

        if(num %2==0){
            System.out.println(num+ " This is even number");
        }else {
            System.out.println(num+ " This is odd number");
        }
    }
}
