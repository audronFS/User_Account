package User_account;

public class ExpensesException extends Exception {
    String sms;

    public ExpensesException() {
        this.sms="There is not enough salary. Expenses: ";
    }

    public ExpensesException(String sms) {
        this.sms = sms;
    }

    @Override
    public String getMessage() {
        return sms + super.getMessage();
    }
}
