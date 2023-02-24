package count_item_in_String;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Manager {
    public static void main(String[] args) {
        Map<Character, Integer> myTreeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input document: ");
        String message = sc.nextLine();
        message = message.toLowerCase();
        for (int i = 0; i < message.length(); i++) {
            char key = message.charAt(i);

            if (myTreeMap.containsKey(key)) {
                myTreeMap.put(key, myTreeMap.get(key) + 1);
            } else {
                myTreeMap.put(key, 1);
            }
        }
        for (Character key : myTreeMap.keySet()) {
            System.out.println("Key : " + key + "- Value: " + myTreeMap.get(key));
        }
    }
}
