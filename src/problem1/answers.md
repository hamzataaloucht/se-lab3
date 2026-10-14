## Problem 1: Single Responsibility Principle

### Q1. Actors and reasons to change
Three actors: Accounting, the invoice designer, and the IT/database team.
So Invoice has 3 reasons to change.

### Q2. Effect of changing subtotal()
The printed invoice and the saved file change silently.
This symptom is called fragility.

### Q5. Describing each class in one sentence
- InvoiceData holds the content of an invoice.
- InvoiceCalculator computes the amounts of an invoice.
- InvoicePrinter formats an invoice as text.
- InvoiceRepository saves an invoice to a file.