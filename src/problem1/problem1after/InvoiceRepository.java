package problem1.problem1after;

import java.io.FileWriter;
import java.io.IOException;

public class InvoiceRepository {
    private final InvoicePrinter printer;

    public InvoiceRepository(InvoicePrinter printer) {
        this.printer = printer;
    }

    public void save(InvoiceData data) throws IOException {
        try (FileWriter fw = new FileWriter(data.getCustomer() + ".txt")) {
            fw.write(printer.print(data));
        }
    }
}
