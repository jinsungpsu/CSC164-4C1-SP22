public class OOPHelloWorld {
    public static void main(String[] args) {
        ComputerScreen display1 = new ComputerScreen();
        ComputerScreen display2 = new ComputerScreen();

        display2.output = "Something else!";
        display2.refreshDisplay();

        display1.output = "Hello World";
        display1.brand = "Samsung";
        display1.model = "AWESOME";
        display1.horizontalPixels = 1920;
        display1.verticalPixels = 1080;
        display1.refreshDisplay();
    }
}
class ComputerScreen {
    int verticalPixels;
    int horizontalPixels;
    String output;
    String brand;
    String model;

    void refreshDisplay() {
        System.out.println("\n" + brand + ": " + model);
        System.out.println("This monitor's resolution is: ");
        System.out.println(horizontalPixels + " x " + verticalPixels);
        System.out.println(output);
    }

}

