package vehicle;

public abstract class HybridVehicle implements Vehicle{
    private String carType;
    public HybridVehicle(String carType){
        this.carType= carType;
    }
    public void drive(){
        System.out.println("driving hybrid "+carType);
    }
    public void fillUp(){
        System.out.println("driving hybrid "+carType);
    }
}
