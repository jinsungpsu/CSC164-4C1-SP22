public class OverloadedConstructor {
    public static void main(String[] args) {
        Car car1 = new Car("Honda");
        Car car2 = new Car(55.5);

        Car[] myGarage = new Car[2];
        myGarage[0] = car1;
        myGarage[1] = car2;
        // Car[] myGarage = {car1, car2};

        System.out.println("My garage currently has: ");
        for (int i = 0; i < myGarage.length; i++) {
            System.out.println("Car parked in spot #: " + (i+1));
            System.out.println(myGarage[i].getModel());
            System.out.println(myGarage[i].getMake());
            System.out.println(myGarage[i].getMpg());
        }
    }
}
