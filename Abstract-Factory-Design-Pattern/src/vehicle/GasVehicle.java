package vehicle;

public abstract class GasVehicle implements Vehicle{
    private String carType;
    public GasVehicle(String carType){
        this.carType= carType;
    }
    public void drive(){
        System.out.println("driving gas "+carType);
    }
    public void fillUp(){
        System.out.println("driving gas "+carType);
    }
}
