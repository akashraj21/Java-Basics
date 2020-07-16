package com.company;
import java.util.Scanner;

public class VowelsFindSwitchCase {
        public static void main(String[] args) {
            System.out.println("Enter the latter");
            Scanner scanner=new Scanner(System.in);
            char ch=scanner.next().charAt(0);
            switch(ch)
            {
                case 'a':
                    System.out.println("Vowel");
                    break;
                case 'e':
                    System.out.println("Vowel");
                    break;
                case 'i':
                    System.out.println("Vowel");
                    break;
                case 'o':
                    System.out.println("Vowel");
                    break;
                case 'u':
                    System.out.println("Vowel");
                    break;
                case 'A':
                    System.out.println("Vowel");
                    break;
                case 'E':
                    System.out.println("Vowel");
                    break;
                case 'I':
                    System.out.println("Vowel");
                    break;
                case 'O':
                    System.out.println("Vowel");
                    break;
                case 'U':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        }
    }

