/*(I). Say you are working on a project called Traffic in the City. Say you are working on some
obvious objects such as Car, Bike, and Bus. With respect to these objects, you need to
create numerous variables such as registerationNumber, color, engineCapacity, speedInfo,
and ownerID and think of specific hierarchy in your code. Corresponds to every available
variables you need to create separate getters/setters methods, while in your super class
you need to have a separate displayVehicleInfo() as well. Create a separate test class and
test your code by calling methods.
(II). Following your created hierarchy in (I) phase, you need to create separate private
members such as routeID and manufacturerName in sub-level classes (say, routeID in car
and manufacturerName in bus) and both these sub-level classes must have displayInfo()
method printing all the necessary details of sub-level classes with data of the parent class’s
displayVehicleInfo(). You will require to create parameterized constructor(s) in the code.*/


class Vehicle{
    private String registrationNumber;
    private String color;
    private double engineCapacity;
    private double speedInfo;
    private String ownerID;
    
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    
    public String getRegistrationNumber(){
        return this.registrationNumber;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setEngineCapacity(double engineCapacity){
        this.engineCapacity = engineCapacity;
    }
    
    public double getEngineCapacity(){
        return this.engineCapacity;
    }
    
    public void setSpeedInfo(double speedInfo){
        this.speedInfo = speedInfo;
    }
    
    public double getSpeedInfo(){
        return this.speedInfo;
    }
    
    public void setOwnerID(String ownerID){
        this.ownerID = ownerID;
    }
    
    public String getOwnerID(){
        return this.ownerID;
    }
    
    public Vehicle(String registrationNumber, String color, double engineCapacity, double speedInfo, String ownerID){
        setRegistrationNumber(registrationNumber);
        setColor(color);
        setEngineCapacity(engineCapacity);
        setSpeedInfo(speedInfo);
        setOwnerID(ownerID);
    }
    
    public void display(){
        System.out.println(getRegistrationNumber());
        System.out.println(getColor());
        System.out.println(getEngineCapacity());
        System.out.println(getSpeedInfo());
        System.out.println(getOwnerID());
    }
}

class Car extends Vehicle{
    private String routeID;
    
    public void setRouteID(String routeID){
        this.routeID = routeID;
    }
    
    public String getRouteID(){
        return this.routeID;
    }
    
    public Car(String routeID, String registrationNumber, String color, double engineCapacity, double speedInfo, String ownerID){
        super(registrationNumber, color, engineCapacity, speedInfo, ownerID);
        setRouteID(routeID);
    }
    
    public void viewCarDetails(){
        super.display();
        System.out.println(this.routeID);
    }
}

/*class Bus extends Vehicle{
    
}

class Bike extends Vehicle{
    
}*/

public class TestVehicle{
    public static void main(String[] Args){
        Car veh = new Car("6969", "RJ02", "black", 45, 200, "69");
        veh.viewCarDetails();
    }
}
