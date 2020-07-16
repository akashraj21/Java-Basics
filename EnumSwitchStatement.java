package com.company;

public class EnumSwitchStatement {
    public enum Dept{CSE,ECE,EEE,MECH,CIVIL,BME}
    public static void main(String args[]){
        Dept[]DeptNow=Dept.values();
        for (Dept Now:DeptNow){
            switch (Now){
                case CSE:
                    System.out.println("COMPUTER SCIENCE");
                    break;
                case BME:
                    System.out.println("BIOMEDICAL");
                    break;
                case ECE:
                    System.out.println("ELECTRICAL & COMMUNICATION");
                    break;
                case EEE:
                    System.out.println("ELECTRONICS & ELECTRICAL ");
                    break;
                case MECH:
                    System.out.println("MECHANICAL");
                    break;
                case CIVIL:
                    System.out.println("construction is very important in life");
                    break;

            }
        }
    }
}
