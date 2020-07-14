package User_account;

public class Income extends Money {
    //CONSTRUCTOR
    public Income(double income, String description) {
        super.setMoney(income);
        super.setDescription(description);
    }

    //TO STRING
    @Override
    public String toString() {
        return "Income" + money +", description='" + description + '\'';
    }
}
