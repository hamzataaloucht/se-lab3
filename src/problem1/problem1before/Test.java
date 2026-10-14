package problem1.problem1before;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException{
        Invoice invoice = new Invoice("ALAMI Samir");

        invoice.addLine("Laptop", 9000.00);
        invoice.addLine("Mouse", 150.00);
        invoice.addLine("USB cable", 50.00);

        System.out.println("The total is: " + String.format("%.2f", invoice.total()));
        System.out.println(invoice.print());
        invoice.save();
    }
}
