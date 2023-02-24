package convert_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class Manager {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to transfer: ");
        int number = sc.nextInt();
        int transfer;
        int inputNumber = number;
        while (inputNumber > 0) {
            transfer = inputNumber % 2;
            myStack.push(transfer);
            inputNumber = inputNumber / 2;
        }
        String str = "";

        while (!myStack.empty()) {
            str += myStack.pop();
        }
        System.out.println("Nhi phan cua " + number + " la " + str);
    }
}
