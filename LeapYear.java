package com.company;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the Years in numbers");
        Scanner scanner=new Scanner(System.in);
        year =scanner.nextInt();
        if ((year%4==0)&&(year%100!=0)||(year%100==0)){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Comman Year");
        }

    }

}
