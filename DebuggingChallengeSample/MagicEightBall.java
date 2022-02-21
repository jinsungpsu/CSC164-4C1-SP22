
/*
Hey! this is my Magic Ball code for the debugging challenge.
So, a couple of things:
    1)There is a total of 8 errors that are needed to be fixed in
    order for this code to work.
    2) HINT: The errors are a mix of syntax, logic, and runtime errors,
    3) Make sure to have fun! :D
*/

import java.util.Scanner;

public class MagicEightBall {
    public static void main(String[] args) {

        System.in.println("Enter a Question! ");
        Scanner scan = new Scanner(System.out);

        scan.next();
        scan.close();

        Random rand = Random();
        int r = rand.nextInt(5);
        System.out.println(r);

        MagicBall(int r);

    }
    static void MagicBall(r){
        if(r=0){
            System.out.println("As I see it, yes,");
        } else if(r == 1){
            System.out.println("Probably not.");
        } else if (r == 2){
            System.out.println("Signs point to yes.");
        }else if (r == 3){
            System.out.println("Don't count on it");
        }else if (r == 4){
            System.out.println("Got lazy, ask again later.");
        } else if (r == 5){
            System.out.println("Outlook not looking good bro/sis.");
    }
}

