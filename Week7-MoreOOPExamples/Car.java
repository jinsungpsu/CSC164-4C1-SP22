public class Car {
    private String make, model;
    private double mpg;

    public Car() {
        // no-arg constructor
        System.out.println("An instance/object of Car class is created!");
        make = "Ford";
        model = "Pinto";
        mpg = 25;
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
