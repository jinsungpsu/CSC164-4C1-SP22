public class PersonTester {
    public static void main(String[] args) {
        Person mran = new Person();
        mran.setName("JIn AN");
        mran.birthday();

        System.out.println(mran.getName() + " is " + mran.getAge() + " years old.");

        Person rouhid = new Person();
        rouhid.setName("Rouhid");

        if (mran.isSameAge(rouhid)) {
        }

        if (rouhid.isSameAge(mran)) {

        }
    }

}
