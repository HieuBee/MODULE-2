package reverse_array;

import java.util.Scanner;
import java.util.Stack;

public class Manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        System.out.println("Input size array: ");
        int size = sc.nextInt();

        int[] myNumbers = new int[size];
        System.out.println("Input item array: ");
        for (int i = 0; i < size; i++) {
            myNumbers[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++) {
            numbers.push(myNumbers[i]);
        }
        //Before
        System.out.println("Before array: " + numbers);

        for (int i = 0; i < size; i++) {
            myNumbers[i] = numbers.pop();
        }

        for (int i = 0; i < size; i++) {
            numbers.push(myNumbers[i]);
        }

        System.out.println("After array: " + numbers);
    }
}
