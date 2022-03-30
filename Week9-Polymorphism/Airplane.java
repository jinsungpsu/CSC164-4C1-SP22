public class Airplane extends Vehicle {
    private double altitude;

    public static final double SPEED_LIMIT = 15000;

    public Airplane(String make, String model) {
        super(make, model);
        altitude = 0;
    }

    public Airplane(String make, String model, double altitude) {
        this(make, model);
        this.altitude = altitude;
    }

    public void fly() {
        altitude += 200;
    }

    @Override
    public String toString() {
        return "this is a plane flying at: " + altitude;
    }
}
