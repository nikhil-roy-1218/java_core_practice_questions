package if_else_practice;

import java.util.Scanner;

class Checkmonth {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Month (1 to 12): ");
        int month=input.nextInt();

        if(month<1 || month>12){
            System.out.println(month+" You enter invalid input please select between (1 to 12)");
        } else if (month==2) {
            System.out.println(month+" Is month has 28 or 29 days");
        } else if (month==4||month==6||month==9||month==11) {
            System.out.println(month+" Is month has 30 days");
        }else {
            System.out.println(month+" Is month has 31 days");
        }
        input.close();
    }
}
