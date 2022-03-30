public class RoadVehicle extends Vehicle{
    private int numPassengers;
    private double milage;
    private int numDoors;
    private int numWheels;

    public RoadVehicle(String make, String model) {
        super(make, model);
        setCurrentSpeed(0);
    }

    @Override
    public String toString() {
        return "Car: " + getMake() + " " + getModel() + " and traveling at: " + getCurrentSpeed() + " mph.";
    }

    public boolean equals(RoadVehicle otherCar) {
        if (getMake().equals(otherCar.getMake())
            && getModel().equals(otherCar.getModel()))
            return true;
        else return false;
    }

}
