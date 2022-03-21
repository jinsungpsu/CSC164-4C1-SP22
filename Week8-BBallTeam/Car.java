public class Car {
    private String make, model;
    private double mpg;

    public Car() {
        // no-arg constructor
        System.out.println("An instance/object of Car class is created!");
        make = "Ford";
        model = "Bronco";
        mpg = 25;
    }

    public Car(String make) {
        this();
        this.make = make;
    }

    public Car(String[] carInfo) {
        make = carInfo[0];
        model = carInfo[1];
    }

    public Car(String make, String model, double mpg) {

    }



    public Car(double mpg) {
        this("Some Car");
        this.mpg = mpg;
    }

    public void modCar() {
        this.mpg += 10;
    }

    public void setMake(String makeOfCar) {
        make = makeOfCar;
    }

    public void setModel(String modelOfCar) {
        model = modelOfCar;
    }

    public void setMpg(double carMpg) {
        if (carMpg < 0) {
            mpg = 0;
        } else {
            mpg = carMpg;
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getMpg() {
        return mpg;
    }

}
