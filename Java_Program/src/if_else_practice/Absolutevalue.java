package if_else_practice;

import java.util.Scanner;

class Absolutevalue {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = input.nextInt();

         if(num <0){
             num = num * -1;
         }
         System.out.println(num+" This is Absolute value");
     }
}
