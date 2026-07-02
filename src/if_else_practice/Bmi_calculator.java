package if_else_practice;

import java.util.Scanner;

public class Bmi_calculator {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your Neme: ");
        String name=input.nextLine();
        System.out.print("Enter Your height in feet like (5.5): ");
        double height_feet= input.nextDouble();
        System.out.print("Enter your Weight: ");
        int weight = input.nextInt();
        double height_meter=height_feet*0.3048;
        double bmi=weight/(height_meter*height_meter);

        if(bmi<18.5){
            System.out.println(name+" Yor are Underweight");
        } else if (bmi<25.0) {
            System.out.println(name+" Yor have normal weight ");

        } else if (bmi<30.0) {
            System.out.println(name+" You are Overwweight. ");
        }else {
            System.out.println(name+ "You are Obese");
        }
        System.out.println(name+" Your BMI Score is(" +bmi+ ") ");
    }



    }


