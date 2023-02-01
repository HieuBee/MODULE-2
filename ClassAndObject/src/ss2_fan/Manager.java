package ss2_fan;

public class Manager {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        System.out.println(fan1.toString(false));
        System.out.println(fan2.toString(true));
    }
}
