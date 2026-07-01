package if_else_practice;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the one side of Triangle: ");
        int side1= input.nextInt();
        System.out.print("Enter the second side of Triangle: ");
        int side2= input.nextInt();
        System.out.print("Enter third side of Triangle: ");
        int side3=input.nextInt();

        if(side1+side2+side3==180){
            System.out.println("This is valid Triangle");
        }else {
            System.out.println("This is not valid Triangle");
        }
    }
}
