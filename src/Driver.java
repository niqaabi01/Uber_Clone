public class Driver extends Person {
    String licenseID;
    Car car;
    
    
    Driver( Car car, String licenseDrivers, String name, String surname,String phone_number, int cash){
        super(name,surname,phone_number,cash);  //this is inherited from the parent class
        this.car = car;
        this.licenseID = licenseDrivers;    
    }

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