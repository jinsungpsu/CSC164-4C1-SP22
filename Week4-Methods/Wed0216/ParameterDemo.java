public class ParameterDemo {
    public static void main(String[] args) {
        int number = 5;

        System.out.println(number); // 5
        changer(number);
        System.out.println(number); // thumbs up 5, thumbs down 10

        changer(99);
    }

    static void changer(int num) {
        // int num = 5;
        System.out.println("In changer method: " + num);
        num = 10;
        System.out.println("In changer method after being assigned 10: " + num);
    }
}
