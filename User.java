package User_account;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    //CONSTRUCTOR
    public User(){
        this.name ="";
        this.age =0;
        this.ID ="";

    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int edad) {
        this.age = edad;
    }

    public String getID() {
        return ID;
    }

    public boolean setID(String DNI) {//BOOLEAN
        Pattern pat = Pattern.compile("^([0-9]{8})(-)?[a-zA-Z]{1}$");
        Matcher mat = pat.matcher(DNI);
        if(mat.matches()){
            this.ID =DNI;
            return true;
        }else
            return false;
    }

    //TO STRING
    @Override
    public String toString() {
        return "User: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID='" + ID + '\'';
    }


    //VARIABLES
    private String name;
    private int age;
    private String ID;
    Scanner consola = new Scanner(System.in);

}
