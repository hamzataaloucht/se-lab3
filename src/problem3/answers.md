## Problem 3: Liskov Substitution Principle

### Q1. Running the Test
The first account is charged (490), then the program crashes on the fixed-term account
with an UnsupportedOperationException("Locked until maturity").

### Q2. "A fixed-term account IS-A bank account"
In the real world it is a bank account, but in the code an Account is defined by what it
can do, and every Account promises that withdraw works when there is enough money.
FixedTermAccount does not keep that promise, so it does not behave like an Account.

### Q3. Broken rule
The exceptions rule: withdraw throws a new exception (UnsupportedOperationException) that
the base class never throws. It also strengthens the precondition (no amount is accepted at all).

### Q4. Adding instanceof in chargeMonthlyFee
It violates the Open/Closed Principle: Bank now knows about the subclasses.
If a third kind of account that cannot withdraw appears, we have to open Bank again
and add another instanceof, otherwise it crashes again.

### Q7. StudentAccount
No, it is not substitutable. CurrentAccount.withdraw accepts any amount up to the balance,
StudentAccount only accepts up to 200 MAD, so it strengthens the precondition.
A client that withdraws 300 MAD from a CurrentAccount with enough money would get an exception.

Better design: StudentAccount should not extend CurrentAccount. It can implement
WithdrawableAccount directly, and the contract of WithdrawableAccount says that withdraw can
be refused above a limit, for example with a method `double withdrawalLimit()`
(CurrentAccount returns its balance, StudentAccount returns min(balance, 200)).
Then the limit is part of the contract and clients can check it before withdrawing.
