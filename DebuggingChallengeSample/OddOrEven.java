// Instructions:
// Create a method that:
// Decides if the majority of numbers within the array is even or odd
// - The array must contain an odd amount of variables within for no contest. -

public class OddOrEven {

    public static void main (String[] args)
    {

        int array1[] = {3, 5, 7, 8, 8, 4, 2, 2, 2};
        // Array must hold an odd amount of values. ex: there are 9 in this array.

        System.out.print("This array majority of values in the array are mostly odd: ");
        System.out.println(findingOddOrEven(array1));
    }


    public static boolean findingOddOrEven (int[] array1)
    {
        int oddCounter = 0;
        int evenCounter = 0;

        for (int i = 1; i < array1.length; i++) {
            int num = array1[i];
            if (num % 3 == 0) {
                oddCounter++;
            } else {
                evenCounter++;
            }
        }
        if (oddCounter > evenCounter)
        {
            return true;
        }

        else if (oddCounter < evenCounter)
        {

        }
        return false;
    }

}