package com.api;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = scanner.nextLine();

        if (isPalindrome(input)){
            System.out.println(input + " is a palindrome.");
        }else {
            System.out.println(input + " is not a palindrome.");
        }
        scanner.close();
    }
    public  static  boolean isPalindrome(String str){
        String lowerCase = str.replaceAll("\\s+", "").toLowerCase();
        int left =0;
        int right=lowerCase.length()-1;

        while (left < right){
            if(lowerCase.charAt(left) != lowerCase.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
