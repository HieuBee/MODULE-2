package string_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Manager {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String palindromeString = sc.next();

        char charPalindromeString;

        for (int i = 0; i < palindromeString.length(); i++) {
            charPalindromeString = palindromeString.charAt(i);

            stack.push(String.valueOf(charPalindromeString));
            queue.add(String.valueOf(charPalindromeString));
        }
        boolean checkPalindrome = true;
        while (!stack.isEmpty() && !queue.isEmpty()) {

            String stackElement = stack.pop();
            String queueElement = queue.remove();

            if (!stackElement.equalsIgnoreCase(queueElement)) {
                checkPalindrome = false;
                break;
            }
        }
        if (checkPalindrome) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not Palindrome.");
        }
    }
}
