package if_else_practice;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num= input.nextInt();

        if(num<0){
            num=num*-1;
        }
        System.out.println(num+" Is Absolute value");

    }
}
