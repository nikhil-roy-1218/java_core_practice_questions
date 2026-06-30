package if_else_practice;

import java.util.Scanner;

class VowelConstant {
     public static void main(String[] args){
         Scanner input =new Scanner(System.in);
         System.out.print("Enter Any one Alphabate: ");
         char ch=input.nextLine().charAt(0);

         if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' || ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
             System.out.println(ch+" Is Vowel");
         }else {
             System.out.println(ch+" Is Not Vowel");
         }

     }
}
