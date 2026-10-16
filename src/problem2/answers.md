## Problem 2: Open/Closed Principle

### Q7. Design pattern
The Strategy pattern.

### Q8. Cost depending on the destination country
No. The cost method in ShippingMethod has no country, so the interface,
every shipping class, and Parcel would all have to change.
This shows we cannot close a design against every change.
We choose which changes to protect against: here, adding new shipping methods.