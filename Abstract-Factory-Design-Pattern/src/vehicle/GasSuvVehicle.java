package vehicle;

public class GasSuvVehicle extends GasVehicle{
    public GasSuvVehicle(){
        super("SUV");
    }

    @Override
    public void greetDriver() {
        System.out.println("Greetings from Gas SUV");
    }
}
