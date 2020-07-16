package com.company;
import java.util.Scanner;


public class TernaryOperator {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        String output=(num%2==0)?"even number":"odd number";
        System.out.println(output);
    }

}
