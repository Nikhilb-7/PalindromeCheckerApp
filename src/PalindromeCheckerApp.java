import java.util.Stack;

/*
@author Nikhil
@version 1.0
Created class as PalindromeCheckerApp
Application entry point for UC12
Checks Palindrome by using Strategy Pattern for Palindrome Algorithms (Advanced)
*/
interface PalindromeStrategy {
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(input);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}