package problem2.problem2after;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(2.0);

        List<ShippingMethod> shippingMethods = new ArrayList<>();
        shippingMethods.add(new StandardShipping());
        shippingMethods.add(new ExpressShipping());
        shippingMethods.add(new DroneShipping());
        shippingMethods.add(new PickupShipping());

        for (ShippingMethod shippingMethod : shippingMethods) {
            System.out.println(shippingMethod.name() + ": " + String.format("%.2f", parcel.shippingCost(shippingMethod)) + " MAD");
        }
    }
}
