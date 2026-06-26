package If_else_practice;
// find largest number
import java.util.Scanner;

class Largest_Number {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1= input.nextInt();
        System.out.print("Enter Second number: ");
        int num2= input.nextInt();
        System.out.print("Enter Third number: ");
        int num3= input.nextInt();


        if(num1 >= num2 && num1>=num3){
            System.out.println(num1 +" This is greater number");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2+" This number is greater");
        }else {
            System.out.println(num3+ " This number is greater");
        }
    }
}
