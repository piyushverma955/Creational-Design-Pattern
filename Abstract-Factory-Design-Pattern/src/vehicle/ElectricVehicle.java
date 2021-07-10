package vehicle;

public abstract class ElectricVehicle implements Vehicle {
    private String carType;
    public ElectricVehicle(String carType){
        this.carType= carType;
    }
    public void drive(){
        System.out.println("driving electric "+carType);
    }
    public void fillUp(){
        System.out.println("driving electric "+carType);
    }
}
