public class PrintPractice {
    public static void main(String[] args) {
        // formatted output
        // https://www.journaldev.com/28692/java-printf-method
        final double TAX_RATE = 0.06;
        double total = 200.67;
        double tip = total * .20;

        System.out.printf("The total is: %.2f\nThe tax rate is:%.3f\nThe tip is:%.2f", total, TAX_RATE, tip);

        System.out.printf("\n\nHello %s", "World");


        // implicit casting
        // https://www.w3schools.com/java/java_type_casting.asp
        int points = 500;
        double something = points;

        double num = 500.5;
        int num2 = (int)num;

        System.out.println("\n\n"+ num2);

        // parsing
        String numberString = "5";
        // { 53 }
        String numberString2 = "five";
        // { f, i, v, e }
        // { 102, 106, 118, 101 }
        // { }
        int actualInt = 5;
        // 5, 101

        // int numEquivalent = (int)numberString;
        // this makes no sense, inconvertible types

        System.out.println("========= parsing String to int ==========");

        int numEquivalent = Integer.parseInt(numberString);
        int numEquivalent2 = Integer.valueOf(numberString);

        System.out.println(numEquivalent);
        System.out.println(numEquivalent2);

        // int and String addition
        System.out.println(numEquivalent + 1);
        System.out.println(numberString + 1);


    }
}
