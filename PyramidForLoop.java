package com.company;

public class PyramidForLoop {
    public static void main(String args[]){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
        System.out.println();
        }
     System.out.println("Print Pyramid OppositeSide");
        for (int m=1;m<=6;m++){
            for (int n=6;n>=m;n--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
