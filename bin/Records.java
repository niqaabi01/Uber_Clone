import java.io.*;
import java.util.*;

public class Records{
    String file_Path_CSV = "C:\\Users\\saani\\Downloads\\uberClone_OOP-master\\uber_Assignment_clone\\bin\\driverList.csv";
    int numberXL;
    int numberX;
    Driver[] drivers ;

    Records() {}
    //iterates the rows in the CVS files
    public int countLines_CSV(String filename) {
        int i = 0;
        try {
            BufferedReader Reader = new BufferedReader(new FileReader(file_Path_CSV));
            String row = null;
            while ((row = Reader.readLine()) != null) {
                i++;
            }
            Reader.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return i;
    }
    // prints out the info in the form of an array
    public void printArray(Driver[] drivers) {
        System.out.print("[ ");
        for(Driver d: drivers) {
            System.out.print(d);
            System.out.print(",");
            System.out.println("");
        }
        System.out.print(" ]");
    }
    //Retrieves driver info based on car type Selection
    public void getDriversArray() {
        try {
            BufferedReader Reader = new BufferedReader(new FileReader(file_Path_CSV));
            String row = null;
            int i = 0;
            this.drivers = new Driver[countLines_CSV(file_Path_CSV)-1];
            while ((row = Reader.readLine()) != null) {
                if(i > 0) {
                    String[] DriverInfo = row.split(",");
                    Car car = new Car(DriverInfo[5].trim(), DriverInfo[6].trim(), DriverInfo[7].trim(), DriverInfo[8].trim());
                    Driver driver = new Driver(car, DriverInfo[0].trim(), DriverInfo[1].trim(), DriverInfo[2].trim(), DriverInfo[3].trim(), Integer.parseInt(DriverInfo[4].trim()));
                    if(DriverInfo[8].trim().equals("X")) {
                        this.numberX++;
                    }
                    if(DriverInfo[8].trim().equals("XL")) {
                        this.numberXL++;
                    }
                    this.drivers[i-1] = driver;
                }
                i++;
                
            }
            Reader.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public Driver[] ArrayVehicleTypes(String vehicleType) {

        Driver[] Xdrivers = new Driver[this.numberX];
        Driver[] XLdrivers = new Driver[this.numberXL];

        int Xindex = 0;
        int XLindex = 0;
        for(int i=0; i<this.drivers.length; i++) {
            if(this.drivers[i].getCar().getVehicleType().equals("X")) {
                Xdrivers[Xindex] = this.drivers[i];
                Xindex++;
            }
            if(this.drivers[i].getCar().getVehicleType().equals("XL")) {
                XLdrivers[XLindex] = this.drivers[i];
                XLindex++;
            }
        }
        if(vehicleType.equals("X")) {
            return Xdrivers;
        }
        return XLdrivers;
    }
}



















