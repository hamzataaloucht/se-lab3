package problem2.problem2before;

public class Test {
    public static void main(String[] args) {
        ShippingCalculator calculator = new ShippingCalculator();

        System.out.println("Standard: " + calculator.cost("STANDARD", 2) + " MAD");
        System.out.println("Express: " + calculator.cost("EXPRESS", 2) + " MAD");
        System.out.println("Drone: " + calculator.cost("DRONE", 2) + " MAD");
    }
}
