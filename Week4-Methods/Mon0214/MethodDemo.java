public class MethodDemo {
    public static void main(String[] args) {
        int num;

        printHelloWorld();

        int num1 = 1, num2 = 2;
        int total = sum(num1, num2);

        //System.out.println("Contents of num2 inside main method: " + num2);

    }

    // returnType nameOfMethod (parameterList)
    static void printHelloWorld() {
        System.out.println("Hello World");

        System.out.println("The total of 1+2 is: " + sum3(1, 2, 10));

    }

    static int sum3(int num1, int num2, int num3) {
        return num1+num2+num3;
    }

    static int sum(int num1, int num2) {
        num2 = 5;

        printHelloWorld();

        //System.out.println("Contents of num2 inside sum method: " + num2);
        return num1+num2;
    }
}
