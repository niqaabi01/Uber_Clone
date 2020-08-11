public class Passenger extends Person {
    String email;

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











