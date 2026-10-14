package problem1.problem1after;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        InvoiceData data = new InvoiceData("ALAMI Samir");

        data.addLine(new InvoiceLine("Laptop", 9000.0));
        data.addLine(new InvoiceLine("Mouse", 150.0));
        data.addLine(new InvoiceLine("USB cable", 50.0));

        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoicePrinter printer = new InvoicePrinter(calculator);
        InvoiceRepository repository = new InvoiceRepository(printer);

        System.out.print(printer.print(data));
        repository.save(data);
    }
}
