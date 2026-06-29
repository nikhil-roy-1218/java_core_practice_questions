package if_else_practice;

import java.util.Scanner;

class Voting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name=input.nextLine();
        System.out.print("Enter your Age: ");
        int age = input.nextInt();

        if(age>=18){
            System.out.println(name+ " You are eligible for vote your age is "+age);
        }else {
            System.out.println(name+ " You are not eligible for vote your age is "+age);
        }
    }
}
