public class Person {
    private String name;
    private int age;
    private int numNameChanged = 0;

    public Person() {
        age = 0;
    }

    public void setName(String newName) {
        if (numNameChanged > 2) {
            System.out.println("Can't change name!");
        } else {
            name = newName;
            numNameChanged++;
        }
    }

    public boolean isSameAge(Person anotherPerson) {
        System.out.println("this object age: " + age);
        System.out.println("The other object age: " + anotherPerson.age);

        if (age == anotherPerson.age)
            return true;
        else
            return false;

    }

    public void birthday() {
        age++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
