package if_else_practice;

import java.util.Scanner;
// Write a program to input any character and check whether it is alphabet, digit or special character
class Check {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Character: ");
        char ch=input.nextLine().charAt(0);

        if(ch>='a'&& ch<='z'||ch>='A'&& ch<='Z'){
            System.out.println(ch+" Is Character");
        } else if (ch>='0' && ch<='9') {
            System.out.println(ch+" Is Digit");
        }else {
            System.out.println(ch+" Is Special character");
        }
    }
}
