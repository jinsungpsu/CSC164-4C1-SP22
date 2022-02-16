public class MethodsReview {
    public static void main(String[] args) {
        String word = "Hello";
        String word2 = "Hi";

        System.out.println(word + " in spanish is " + dictionary(word));
        System.out.println(word2 + " in spanish is " + dictionary(word2));
    }

    private static String whatsup(int i, String hi, char c) {
        return "";
    }

    static String dictionary(String word) {
        if (word.equals("Hello")) {
            return "Hola";
        } else if (word.equals("Bye")) {
            return "Adios";
        } else if (word.equals("Donkey")) {
            return "Burro";
        } else {
            return "Can't find that word in my little, crappy dictionary!";
        }
    }
}
