//Inheriting from Super/Parent classes
//Overiding the functionality of existing methods
// or has the same method declared in the parent or super class
public class Driver extends Person {
    //instace variables
    String licenseID;
    Car car;
    
    //constructor is used to intailize objects
    Driver( Car car, String licenseDrivers, String name, String surname,String phone_number, int cash){
        super(name,surname,phone_number,cash);  //this is inherited from the parent class
        this.car = car;
        this.licenseID = licenseDrivers;    
    }
    //Using getters and setters to get the infor
    public void setCar(Car car){
        this.car = car;
    }

    public Car getCar(){
        return this.car;
    }

    public void setlicenseID(String licenseDrivers){
        this.licenseID = licenseDrivers;
    }
    
    public String getlicenseID(){
        return  this.licenseID;
    }

    public String toString(){
        return "Welcome I am "+super.toString() + " and I am a driver";
    }
    
    
    
}