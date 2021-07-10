package vehicle;

public class ElectricSedanVehicle extends ElectricVehicle {
    public ElectricSedanVehicle(){
        super("SEDAN");
    }

    @Override
    public void greetDriver() {
        System.out.println("Greetings from Electric Sedan");
    }
}
