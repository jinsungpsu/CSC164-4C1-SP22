import java.util.Scanner;

public class ConditionalsMain {
    public static void main(String[] args) {

        Converter convertingObject = new Converter();

        Scanner scanner = new Scanner(System.in);

        System.out.println(convertingObject.intToString(scanner.nextInt()));

        // line 10, broken up into 3 parts...
        int n = scanner.nextInt();
        String s = convertingObject.intToString(n);
        System.out.println(s);

    }
}

class Converter {
    // data
    // no data needed... for now

    // method converts int to String
    // so, for example, if user enters 5
    // that should be converted to "five"
    String intToString (int num) {
        switch(num) {
            case 1:
                return "one";
            case 5:
                return "five";
            default:
                return "Greater than 9";
        }
    }

}
