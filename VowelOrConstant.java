package com.bridgelabz.BasicCorePrograms;
import java.util.Scanner;
public class VowelOrConstant {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet:");
        char c = sc.next().charAt(0);

        switch (c){

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered Alphabet is Vowel:" + c);
                break;

            default:
                System.out.println("Entered Alphabet is Consonant:" + c);
                break;


        }
    }
}
