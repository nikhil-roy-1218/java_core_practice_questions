package if_else_practice;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        int Score=input.nextInt();

        if(Score<40){
            System.out.println(Score + " You are Fail..");
        } else if (Score>=40 && Score <=55 ) {
            System.out.println(Score + " Your Just Pass");
        } else if (Score>55 && Score<=75) {
            System.out.println(Score + " Your Marks is good");
        } else if (Score>75 && Score<=85) {
            System.out.println(Score + " Your Marks is V.good");
        } else if (Score>85 && Score<=100) {
            System.out.println(Score + " Your Marks is Excelent Makrs");
        }else {
            System.out.println("Yor Enter Wrong input ");
        }

    }
}
