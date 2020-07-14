package User_account;

import java.util.ArrayList;

public class Account {

    //CONSTRUCTOR
    public Account(User user){
        this.user = user;
        salary = 0.0;
        expenses = new ArrayList<>();
        incomes = new ArrayList<>();
    }

    //GETTERS AND SETTERS
    // SALDO
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //USUARIO
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //GASTOS
    public ArrayList<Expense> getExpenses() {
        return expenses;
    }
    public double addGastos(String description, double quantity) throws ExpensesException {
        double checker = salary -quantity;
        if(checker<0){
            throw new ExpensesException();
        }
        Expense expense = new Expense(quantity, description);
        expenses.add(expense);
        salary -= quantity;
        return salary;
    }

    //INGRESOS
    public ArrayList<Income> getIncomes() {
       return incomes;
    }
    public double addIngresos(String description, double quantity) {
        Income income = new Income(quantity, description);
        incomes.add(income);
        salary += quantity;
        return salary;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Account: " +
                "salary=" + salary +
                ", user=" + user;
    }

    //VARIABLES
    private double salary;
    private User user;
    private ArrayList<Expense> expenses;
    private ArrayList<Income> incomes;
}

