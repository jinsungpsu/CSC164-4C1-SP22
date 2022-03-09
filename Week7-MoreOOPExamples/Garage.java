public class Garage {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setModel("Model S");
        car1.setMake("Tesla");
        car1.setMpg(99.9);

        System.out.println(car1.getMpg());

        Car[] myGarage = new Car[2];
        myGarage[0] = car1;
        myGarage[1] = car2;
        // Car[] myGarage = {car1, car2};

        System.out.println("My garage currently has: ");
        for (int i = 0; i < myGarage.length; i++) {
            System.out.println("Car parked in spot #: " + (i+1));
            System.out.println(myGarage[i].getModel());
            System.out.println(myGarage[i].getMake());
        }
    }
}
