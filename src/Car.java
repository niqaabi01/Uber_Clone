public class Car implements Vehicle {

    //instance variables for the car class
    String numberPlate;
    String color;
    String model;
    String type;
    double baseRate;

    //constructor
    Car(String numberPlate, String color, String model, String type) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.model = model;
        this.type = type;
        if(type.equals("XL")) {
            this.baseRate = 30.00;
        } else {
            this.baseRate = 12.00;
        }
    }

    //getters to retrieve information for the car
    public String getNumberPlate() {
        return this.numberPlate;
    }

    public double getBaseRate() {
        return this.baseRate;
    }

    public String getColor() {
        return this.color;
    }
    public String getModel() {
        return this.model;
    }

    public String getVehicleType() {
        return this.type.toUpperCase();
    }

    public String toString() {
        return "Vehicle being dispatched is : "+this.model + " car of " + this.color + " color, with number plate: " + this.numberPlate;
    }
}