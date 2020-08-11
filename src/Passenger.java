// example of inheritance using the instance variables from one class in another


public class Passenger extends Person {
    // instance variable
    String email;

    //constructor is used to intailize objects
    Passenger(String email, String name, String surname ,String phone_number, int cash){
        super(name,surname,phone_number, cash);
        this.email = email;
    }

    // Email address
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public String toString(){
        return "Hi I'm " + super.toString() + " and I am a passenger";
    }
    
}











