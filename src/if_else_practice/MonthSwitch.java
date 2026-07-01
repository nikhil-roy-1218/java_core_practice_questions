package if_else_practice;

import java.util.Scanner;

class MonthSwitch {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter month year (1 - 12 ): ");
        int month= input.nextInt();

        switch (month){
            case 1:month=1;
                System.out.print(month+" Is January");
                break;
            case 2:month=2;
                System.out.print(month+" Is February");
                break;
            case 3:month=3;
                System.out.print(month+" Is March");
                break;
            case 4:month=4;
                System.out.print(month+" Is April");
                break;
            case 5:month=5;
                System.out.print(month+" Is May");
                break;
            case 6:month=6;
                System.out.print(month+" Is June");
                break;
            case 7:month=7;
                System.out.print(month+" Is July");
                break;
            case 8:month=8;
                System.out.print(month+" Is August");
                break;
            case 9:month=9;
                System.out.print(month+" Is September");
                break;
            case 10:month=10;
                System.out.print(month+" Is October");
                break;
            case 11:month=11;
                System.out.print(month+" Is November");
                break;
            case 12:month=12;
                System.out.print(month+" Is December");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
