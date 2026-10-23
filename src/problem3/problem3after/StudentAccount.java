package problem3.problem3after;

public class StudentAccount extends CurrentAccount {
    public StudentAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 200) {
            throw new IllegalArgumentException("Student accounts cannot withdraw more than 200 MAD");
        }
        super.withdraw(amount);
    }
}
