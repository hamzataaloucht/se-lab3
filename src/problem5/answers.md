## Problem 5: Dependency Inversion Principle

### Q1. Dependency arrows
EnrollmentService -> CsvStudentStore and EnrollmentService -> EmailSender.
The arrows go from the policy to the details, so the business rule depends on a CSV file
and on an SMTP server.

### Q2. Where do StudentRepository and Notifier live?
Next to EnrollmentService. They are written for the needs of the policy, so the policy owns them.
The CSV and e-mail classes depend on them, which turns the arrows around (details -> policy).

### Q6. DIP vs DI
DIP is a design rule: high-level code and low-level code both depend on abstractions owned by
the high-level code. DI is a technique: an object receives its dependencies from outside
(here through the constructor) instead of creating them with new.
In Q3 I applied DI (constructor injection), in Q4 I applied DIP (the CSV and e-mail classes
now implement the abstractions of the policy).
