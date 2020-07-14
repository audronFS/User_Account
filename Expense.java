package User_account;

public class Expense extends Money {
    //CONSTRUCTOR
    public Expense(double expense, String description) {
        super.setMoney(expense);
        super.setDescription(description);
    }

    //TO STRING
    @Override
    public String toString() {
        return "Expense" + money + ", description='" + description + '\'';
    }
}
