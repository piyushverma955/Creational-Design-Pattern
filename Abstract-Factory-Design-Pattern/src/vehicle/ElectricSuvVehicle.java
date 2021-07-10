package vehicle;

public class ElectricSuvVehicle extends ElectricVehicle{
    public ElectricSuvVehicle(){
        super("SUV");
    }

    @Override
    public void greetDriver() {
        System.out.println("Greetings from Electric SUV");
    }
}
