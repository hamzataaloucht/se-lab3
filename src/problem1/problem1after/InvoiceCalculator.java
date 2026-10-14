package problem1.problem1after;

public class InvoiceCalculator {
    public double subtotal(InvoiceData data) {
        double sum = 0;
        for (InvoiceLine line: data.getLines()) {
            sum += line.price();
        }
        return sum;
    }

    public double total(InvoiceData data) {
        return subtotal(data) * 1.20;
    }
}
