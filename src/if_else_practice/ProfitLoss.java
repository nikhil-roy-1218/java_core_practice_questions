package if_else_practice;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        int cp= input.nextInt();
        System.out.print("Enter Selling Price: ");
        int sp = input.nextInt();

        if(cp < sp){
            int profit=sp-cp;
            System.out.println("You made profit of : "+profit);
        } else if (cp == sp) {
            System.out.println("You have no profir no loss");
        }else{
            int loss=cp-sp;
            System.out.println("You made loss "+ loss);
        }
    }
}
