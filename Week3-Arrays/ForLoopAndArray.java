public class ForLoopAndArray {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "No", "More", "Problems"};

//        System.out.println(words); // this doesn't really work
//        System.out.println(words[0]);
//        System.out.println(words[1]);
//        System.out.println(words[2]);
//        System.out.println(words[3]);
//        System.out.println(words[4]); // these work, but it's repetitive

        for (int i = 0; i < words.length; i++) {
            System.out.print("Word #" + (i+1) + ": " + words[i] + " ");
        }

        System.out.println();

        for (String each: words) {
            System.out.print(each + " ");
        }
    }
}
