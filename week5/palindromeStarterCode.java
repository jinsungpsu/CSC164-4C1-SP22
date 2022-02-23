  public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String b = "";
        b += "cat";
        b += 'f';
        b += 5;
        System.out.println(b);

        // write some code to reverse A
        // and assign it to b

        for (int i = A.length()-1; i >= 0; i--) {
            char letter = A.charAt(i);
            System.out.print(letter);
        }


        if (A.equals(b)) {

        }

    }
