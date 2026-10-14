package problem1.problem1after;

import java.util.List;

public class InvoicePrinter {
    private final InvoiceCalculator calculator;

    public InvoicePrinter(InvoiceCalculator calculator) {
        this.calculator = calculator;
    }

    public String print(InvoiceData data) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice for ").append(data.getCustomer()).append("\n");
        List<InvoiceLine> lines = data.getLines();
        for (InvoiceLine invoiceLine : lines) {
            sb.append(line(invoiceLine.item(), invoiceLine.price()));
        }
        sb.append(line("Subtotal", calculator.subtotal(data)));
        sb.append(line("TOTAL", calculator.total(data)));
        return sb.toString();
    }

    private String line(String label, double value) {
        return String.format("%-12s %8.2f%n", label, value);
    }
}
