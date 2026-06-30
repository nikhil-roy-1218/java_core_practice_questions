package if_else_practice;

import java.util.Scanner;

class MonthName {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Month Number 1 to 12: ");
         int year = input.nextInt();

         if(year==1){
             System.out.println(year+ " Is January");
         } else if (year==2) {
             System.out.println(year+ " Is February");
         } else if (year==3) {
             System.out.println(year+ " Is March");
         } else if (year==4) {
             System.out.println(year+ " Is  April");
         } else if (year==5) {
             System.out.println(year+ " Is May");
         } else if (year==6) {
             System.out.println(year+ " Is June");
         } else if (year==7) {
             System.out.println(year+ " Is July");
         } else if (year==8) {
             System.out.println(year+ " Is August");
         } else if (year==9) {
             System.out.println(year+ " Is  September");
         } else if (year==10) {
             System.out.println(year+ " Is October");
         } else if (year==11) {
             System.out.println(year+ " Is November");
         } else if (year==12) {
             System.out.println(year+ " Is December");
         }else{
             System.out.println(year+ " You Enter invalid Month");
         }
     }
}
