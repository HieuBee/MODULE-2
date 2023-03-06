package illegal_triangle_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input side of triangle! ");
        try {
            System.out.println("Input side a: ");
            int sideA = Integer.parseInt(sc.nextLine());
            System.out.println("Input side b: ");
            int sideB = Integer.parseInt(sc.nextLine());
            System.out.println("Input side c: ");
            int sideC = Integer.parseInt(sc.nextLine());

            if (sideA + sideB < sideC || sideB + sideC < sideA || sideA + sideC < sideB) {
                throw new IllegalTriangleException();
            }

            if (sideA < 0 || sideB < 0 || sideC < 0) {
                throw new IllegalTriangleException();
            }

            System.out.println("Side a = " + sideA);
            System.out.println("Side b = " + sideB);
            System.out.println("Side c = " + sideC);

        } catch (IllegalTriangleException e) {
            System.out.println("Illegal triangle exception");
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
