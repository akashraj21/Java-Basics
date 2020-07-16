package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args) {
        System.out.println("enter the age");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        System.out.println("enter the wieght");
        Scanner scanner1=new Scanner(System.in);
        int weight=scanner1.nextInt();
        scanner1.close();

        if (age>20){

            if (weight>50){
                System.out.println("You permit to donate a blood");
            }
            else {
                System.out.println("your weight is not eligible");
            }

        }
        else {
            System.out.println("Your not eligible to donate a blood");
        }

    }

}


