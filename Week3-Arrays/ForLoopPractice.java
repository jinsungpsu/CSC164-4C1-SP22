public class ForLoopPractice {
    public static void main(String[] args) {
        /*
        Quick check in… for loops
        0 1 2 3 4 5 6
        5 6 7 8 9 10
        10 9 …. 0
        0 5 10 15 .. 200

        until 2:08pm
         */
        for (int i = 0; i < 7; i++) {
            System.out.printf(i + " ");
        }
        System.out.println();
        for (int i = 5; i < 11; i++) {
            System.out.printf(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.printf(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 200; i=i+5) {
            System.out.printf(i + " ");
        }

        int i = 0;
        while ( i < 10) {
            i++;
        }
        // don't do that! for (int i = 0; i < 10; i++) {}

    }
}
