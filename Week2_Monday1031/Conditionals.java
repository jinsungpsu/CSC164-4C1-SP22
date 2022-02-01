public class Conditionals {
    public static void main(String[] args) {
        int n = 5;

        boolean isEven = true;
        float num = 1.5F;
        double num2 = 1.5;

        long num3;
        short num4;
        long sum;
        char something;
        byte somethingElse;

        String name = "John";

        if (n>0 && n<10) {
            // checking if n is 1-9
        }
        if (n<1 || n>9) {
            // check if n is NOT valid, meaning
            // outside of 1-9
        }

        switch(n) {
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("Greater than 9");
                break;
        }

        if (n==5) {
            System.out.println("five");
        } else if (n == 6) {
            System.out.println("six");
        }
        printStuff();
    }

    static void printStuff() {
        System.out.println("hi");
    }
}
