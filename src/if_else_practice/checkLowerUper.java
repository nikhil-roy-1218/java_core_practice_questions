package if_else_practice;
//  Write a program to check whether a character is uppercase or lowercase alphabet
import java.util.Scanner;

class checkLowerUper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Character: ");
        char ch= input.nextLine().charAt(0);

        if(ch>='a' && ch<= 'z'){
            System.out.println(ch+" Is character is in lower case");
        } else if (ch>='A' && ch<='Z') {
            System.out.println(ch+" Is character is in Upper case");
        }else {
            System.out.println(ch+" Is not a Alphabet");
        }


    }
}
