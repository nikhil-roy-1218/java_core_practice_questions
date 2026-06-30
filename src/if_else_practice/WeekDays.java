package if_else_practice;

import java.util.Scanner;
// Write a program to input week number and print week day
class WeekDays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any week-number: ");
        int Weekday= input.nextInt();

        if(Weekday==1){
            System.out.println(Weekday+" Monday");
        } else if (Weekday==2) {
            System.out.println(Weekday+" Tuesday");
        } else if (Weekday==3) {
            System.out.println(Weekday+" Wednesday");
        } else if (Weekday==4) {
            System.out.println(Weekday+" Thursday");
        } else if (Weekday==5) {
            System.out.println(Weekday+" Friday");
        } else if (Weekday==6) {
            System.out.println(Weekday+" Saturday");
        } else if (Weekday==7) {
            System.out.println(Weekday+" Sunday");
        }else{
            System.out.println(Weekday+" Invalid Day Enter number 1 to 7");
        }
    }
}
