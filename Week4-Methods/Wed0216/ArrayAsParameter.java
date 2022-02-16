public class ArrayAsParameter {
    public static void main(String[] args) {
        int[] bigarray = new int[1000];
        for (int i = 0; i < bigarray.length; i++) {
            bigarray[i] = 7;
        }

        changer(bigarray);


        for (int each: bigarray) {
            System.out.println(each);
        }
        System.out.println("after big array is changed: " + bigarray[1]);

        int[] arr = {1,2,3};
        System.out.println(arr[1]);
        changer(arr);
        System.out.println(arr[1]);

    }

    static void changer(int[] array) {
        array[1] = 99;
    }

    static int sum(int num1, int num2) {
        return num1+num2;
    }

    static int sum (int num1, int num2, int num3) {
        return num1+num2+num3;
    }

    static int sum(int[] nums) {
        int total = 0;
        for (int each: nums) {
            total += each;
        }
        return total;
    }

}
