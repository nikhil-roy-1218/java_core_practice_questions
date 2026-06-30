package if_else_practice;

import java.util.Scanner;

class Alphabate {
     public static void main(String[] args){
         Scanner input =new Scanner(System.in);
         System.out.println("Enter any Character A to z: ");
         char ch = input.next().charAt(0);
         if(ch>'a' && ch <'z' || ch>'A' && ch<'Z'){
             System.out.println(ch+" Is Alphabate");
         }else {
             System.out.println(ch+" Is Not Alphabate");
         }
     }
}
