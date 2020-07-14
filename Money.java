package User_account;

public abstract class Money {

    //GETTERS AND SETTERS
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) {
        this.description = description;
    }

    //VARIABLES
    protected double money;
    protected String description;
}
