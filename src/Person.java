// person class will be our parent class for Driver and passenger
public class Person {

    //instance variables
    private String name;
    private String surname;
    private String phone_number;
    private double cash;

    // a constructor
    Person(String name, String surname, String phone_number,double cash) {
        this.name = name;
        this.surname = surname;
        this.cash = cash;
        this.phone_number = phone_number;
    }

  
  
    //getters && setters
    // Name
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    //Surname
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname(){
        return this.surname;
    }
    //Phone number
    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPhoneNumber(){
        return this.phone_number;
    }
    
    // cash
    public double getCash(){
        return this.cash;
    }
    
    public void setCash(double cash) {
        this.cash = cash;
    }
    
     // name and surname are visible the rest of the info is saved in a database
    public String toString() {
        return this.name + " " + this.surname;
    }
}