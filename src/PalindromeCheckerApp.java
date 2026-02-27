import javax.swing.*;
import java.util.*;

/*
@author Nikhil
@version 1.0
Created class as PalindromeCheckerApp
Application entry point for UC8
Checks Palindrome by using Linked List Based
*/
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        System.out.println("Input : " + input);
        LinkedList<Character> List =new LinkedList<>();
        for (char c :input.toCharArray()){
            List.add(c);
        }
        boolean isPalindrome = true;
        while (List.size()>1) {
            char first = List.removeFirst();
            char last = List.removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
