import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        double num2 = keyboard.nextDouble();

        System.out.println(num + ", " + num2);

    }
}
