public abstract class Journey {

    //variables
    String estartingPoint;
    String endingPoint;

    //Override methods
    public abstract double calculateDistance(String startingPoint, String endingPoint);
    public abstract Driver assignDriver();
    public abstract double calculateCost(String startingPoint, String endingPoint);
    public abstract void completePayment(Driver driver, Passenger passenger);
 }