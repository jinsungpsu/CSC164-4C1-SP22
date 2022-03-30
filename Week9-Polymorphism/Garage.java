/*

Inheritance chain
Object
    Vehicle
        RoadVehicle                 Airplane
            Motorcycle  Truck


 */
public class Garage {
    public static void main(String[] args) {



        Vehicle something;
        something = new Airplane("Boeing", "707" );

        System.out.println(something);
        Airplane something2 = (Airplane) something;
        something2.fly();

        System.out.println(something2);
        System.out.println("Again: " + something);










        RoadVehicle car1 = new RoadVehicle("Honda", "Accord");
        RoadVehicle car2 = new RoadVehicle("Tesla", "Model 3");
        RoadVehicle car3 = new RoadVehicle("Honda", "Accord");
        Airplane plane1 = new Airplane("Boeing", "787");
        plane1.fly();

        car1.setMake("Toyota");

        //System.out.println(car1);

        Vehicle[] garage = {car1, car2, plane1};

        car1.setCurrentSpeed(55);

        car2.setCurrentSpeed(90);

        plane1.setCurrentSpeed(700);

        for (Vehicle each: garage) {
            System.out.println(each);
            if (isSpeeding(each)) {
                // isSpeeding(car1)
                // isSpeeding(car2)
                // isSpeeding(plane1)
                if (each instanceof Airplane) {
                    System.out.println("You're technically speeding, but no one is gonna catch you!");
                } else {
                    System.out.println("Slow down!");
                }
            }
        }
    }

    static boolean isSpeeding(Vehicle vehicle) {
//        if (vehicle instanceof Airplane) {
//            if (vehicle.getCurrentSpeed() > 15000) return true;
//            else return false;
//        }
        if (vehicle.getCurrentSpeed() > vehicle.SPEED_LIMIT) return true;
        return false;
    }
}
