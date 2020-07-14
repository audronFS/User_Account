package User_account;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        //User data
        System.out.println("Insert your user name");
        String name = consola.nextLine();
        System.out.println("Insert your age");
        int age = consola.nextByte();
        consola.nextLine();
        System.out.println("Insert your ID (8 numbers follow by a letter)");
        String ID = consola.nextLine();

        //Create an user
        User user1 = new User();
        user1.setName(name);
        user1.setAge(age);
        user1.setID(ID);
        do{
            if(user1.setID(ID)){
                System.out.println("User correctly created");
            }else {
                System.out.println("The ID is not correct");
                System.out.println("Insert a valid ID");
                ID = consola.nextLine();        }
        }while(!user1.setID(ID));

        System.out.println(user1.toString());

        //Account
        Account account1 = new Account(user1);
        int choice;

        do {
            //List of posibilities
            System.out.println("Insert the number to start");
            System.out.println("1. Insert an expense");
            System.out.println("2. Insert an income");
            System.out.println("3. Show expenses");
            System.out.println("4. Show income");
            System.out.println("5. Show salary");
            System.out.println("0. Exit");
            choice = consola.nextByte();
            switch (choice) {
                case 1:
                    consola.nextLine();
                    System.out.println("Insert description");
                    String exp_descrip = consola.nextLine();

                    System.out.println("Insert quantity");
                    Double expense = consola.nextDouble();

                    try {
                        account1.addGastos(exp_descrip, expense);
                        System.out.println("Remaining salary " + account1.getSalary());
                    }catch (ExpensesException e){
                        System.out.println(e.getMessage());
                    }finally {
                        break;
                    }

                case 2:
                    consola.nextLine();
                    System.out.println("Insert description");
                    String income_descrip = consola.nextLine();

                    System.out.println("Insert quantity");
                    Double income = consola.nextDouble();

                    account1.addIngresos(income_descrip, income);
                    System.out.println("Remaining salary " + account1.getSalary());
                    break;

                case 3:
                    System.out.println("Expenses: ");
                    Iterator<Expense> it1 = account1.getExpenses().iterator();
                    while (it1.hasNext()) {
                        System.out.println(it1.next());
                    }
                    break;

                case 4:
                    System.out.println("Incomes: ");
                    Iterator<Income> it2 = account1.getIncomes().iterator();
                    while (it2.hasNext()) {
                        System.out.println(it2.next());
                    }
                    break;

                case 5:
                    System.out.println("Current salary: " + account1.getSalary());
                    break;

                case 0:
                    System.out.println("End");
                    System.out.println("Thank you for using the app");
                    break;

                default:
                    System.out.println("This action is not in the list");
            }

        }while (choice != 0);

    }
}
